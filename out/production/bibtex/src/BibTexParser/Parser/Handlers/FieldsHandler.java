package BibTexParser.Parser.Handlers;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput2;
import BibTexParser.Types.Field;
import BibTexParser.Types.Type;

import java.util.HashMap;
import java.util.Map;

public class FieldsHandler {

    static void Handle(String typ, String[] pola, AllPublications input) {
        boolean isKey = false;
        Map<Field, String> fields = new HashMap<>();
        // if(typ.charAt(0) != '}') System.out.println(typ.toUpperCase());
        for (String c : pola) {
            if (isKey && c.trim().charAt(0) != '}') {
                String[] splitted = c.trim().split(" = "); // w splitted [1] nie ma tego co powinno byc
                // tutaj usuwanie " z przodu i końca
                if (splitted[1] != null && splitted[1].length() > 0 && splitted[1].charAt(splitted[1].length() - 1) == '"') { //ten if (?)
                    splitted[1] = splitted[1].substring(0, splitted[1].length() - 1);
                }

                //System.out.println(c.trim());
                //if(splitted[1] != null) System.out.println(splitted[1].trim());
                //}
                if (splitted[1] != null && splitted[1].length() > 0 && splitted[1].charAt(0) == '"') {
                    splitted[1] = splitted[1].substring(1);
                }
                // if(splitted[0].trim() != "{" && splitted[0].trim().charAt(0)!='}')System.out.println(splitted[0].trim() + " = " + splitted[1].trim());
                Field pole = new Field(splitted[0]);
                fields.put(pole, splitted[1]);
            } else if (c.trim().charAt(0) != '}') {
                fields.put(new Field("viewKey"), c);
                isKey = false;
            }
            isKey = true;
        }
        if (!typ.equals("preamble") && !fields.isEmpty()) {
            Type type = new Type(typ);
            PublicationInput2 input2 = new PublicationInput2(type, fields);
            input.publist.add(input2);
        }
    }
}
