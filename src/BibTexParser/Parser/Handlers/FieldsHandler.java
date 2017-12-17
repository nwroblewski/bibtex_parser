package BibTexParser.Parser.Handlers;

import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Field;
import BibTexParser.Types.Type;

import java.util.HashMap;
import java.util.Map;

public class FieldsHandler {

    static void Handle(String typ, String[] pola, PublicationInput input){
        boolean isKey = true;
        Map<Field, String> fields = new HashMap<>();

       for(String c: pola){
            if(isKey  && c.charAt(0)!='{'){
                String [] splitted = c.split(" = ");
               // tutaj usuwanie " z przodu i końca
               if (splitted[1] != null && splitted[1].length() > 0 && splitted[1].charAt(splitted[1].length() - 1) == '"') {
                  //  splitted[1] = splitted[1].substring(0, splitted[1].length() - 1);
               }
            //    if(splitted[1] != null && splitted[1].length() > 0 && splitted[1].charAt(0) == '"'){
               //     splitted[1] = splitted[1].substring(1);
          //      }
               // Field pole = new Field(splitted[0]);
              // fields.put(pole,splitted[1]);
            }
          //  else{
             //   fields.put(new Field("viewKey"), c);
             //   isKey = false;
         //   }
        }

        //Type type = new Type(typ);
       // input.publication.put(type,fields);
    }
}
