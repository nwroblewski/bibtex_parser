package BibTexParser.Parser.Handlers;

import BibTexParser.Inputs.PublicationInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TypeHandler {

    public static void HandleType(Handler handler, PublicationInput input) throws IOException {
      try {
          StringBuilder builder = new StringBuilder();
          int charsRead = -1;
          char[] c = new char[100];
          do {
              charsRead = handler.reader.read(c, 0, c.length);
              if (charsRead > 0)
                  builder.append(c, 0, charsRead);
          } while (charsRead > 0);
          String[] pola = builder.toString().split(",");
          System.out.println(handler.name);
          for(String d : pola) System.out.println(d.trim());
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }

        //czyta i splituje po przecinkach, jest git!

        //dalej parsowanie w obrębie każdego pola

    }



}
