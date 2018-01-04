package BibTexParser.Parser.Handlers;

import BibTexParser.Inputs.StringInput;

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *  Klasa StringHandler zawiera
 */
public class StringHandler {


    public static void HandleString(Handler handler, ArrayList<StringInput> strings){
        String key;
        String value;
        StringInput input = new StringInput("","");
        try {
            StringBuilder builder = new StringBuilder();
            int charsRead = -1;
            char[] c = new char[100];

            do {
                charsRead = handler.reader.read(c, 0, c.length);
                if (charsRead > 0)
                    builder.append(c, 0, charsRead);
            } while (charsRead > 0);
            builder.setCharAt(builder.length() -1,' ');
            //System.out.println(builder.toString().trim());
            String [] variable = builder.toString().split(" = ");
            if(variable[1].charAt(0) == '"'){
                StringBuilder manage = new StringBuilder(variable[1]);
                manage.setCharAt(0,' ');
                variable[1] = manage.toString().trim();
            }
            if(variable[1].charAt(variable[1].length() -1) == '"'){
                StringBuilder manage2 = new StringBuilder(variable[1]);
                manage2.setCharAt(manage2.length() -1,' ' );
                variable[1] = manage2.toString().trim();
            }
            input.setKey(variable[0].trim());
            input.setValue(variable[1].trim());
            strings.add(input);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
