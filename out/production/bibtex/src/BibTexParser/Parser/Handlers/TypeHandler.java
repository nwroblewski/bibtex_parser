package BibTexParser.Parser.Handlers;

import BibTexParser.Inputs.AllPublications;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import BibTexParser.Types.Field;
/**
 * class used to do first "layer" ofl
 */
public class TypeHandler {
    /**
     *
     * @param handler Handler of entry
     * @param input AllPublications object to which publication entries will be put
     * @throws IOException  if a reading of content fails
     */
    public static void HandleType(Handler handler, AllPublications input) throws IOException {
      try {
          Map<Field, String> fields = new HashMap<>();
          StringBuilder builder = new StringBuilder();
          BufferedReader reader = new BufferedReader(handler.reader);
          int charsRead = -1;
          char[] c = new char[100];

          do {
              charsRead = handler.reader.read(c, 0, c.length);
              if (charsRead > 0)
                builder.append(c, 0, charsRead);
          } while (charsRead > 0);
          String[] pola = builder.toString().split(",[^ ]");

          //System.out.println(handler.name.substring(1).toLowerCase());
         for(String d : pola){
             for(int i=0; i<d.length(); i++){
                 StringBuilder repair = new StringBuilder(d);
                 if(d.charAt(i) == '}') repair.setCharAt(i,' ');
             }

             d = d.trim();
           // System.out.println(d);
          }
          FieldsHandler.Handle(handler.name.substring(1).toLowerCase(), pola, input);
         // String[] t = pola[1].split(" = "); ten split działa pięknie
         // System.out.println("pole: "+t[0].trim()+" ma wartość: " + t[1].trim());
      }
      catch(Exception e){
        //System.out.println("Parse error (@link TypeHandler) : " +e.getMessage());
      }

        //czyta i splituje po przecinkach, jest git!

        //dalej parsowanie w obrębie każdego pola

    }



}
