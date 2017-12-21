package BibTexParser.Parser;

import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.Handlers.StringHandler;
import BibTexParser.Parser.Handlers.TypeHandler;

import java.io.IOException;
import java.io.StringReader;

public class BlocksParser {
    //private boolean flag = true;
    //String input = Loader.LoadAndPrint(String name);
    /**
     * Sprawdza jaki typ bloku zostaje parsowany, zmienne napisowe zaczynają się od @, tak samo jak normalne rekordy.
     * Kolejny typ bloku to bloki puste, zostają pominięte.
     * Bloki zaczynające swe linie od % - każda linia która rozpoczyna się od % zostaje pominieta.
     * Gwarancją dla poprawnych bloków jest to, że zaczynają się od @, zatem każdy inny blok zostaje pominięty
     * @param blok - blok tekstu który zostaje uzyskany przez (@link Loader.nextEntry())
     */
    public static Handler blockChecker(String blok){
        StringReader reader = new StringReader(blok); // by móc parsować po charach
        boolean entry = true;
        boolean flag = true;
        StringBuilder builder = new StringBuilder();
        try {
            while(reader.ready() && entry){
                char c = (char) reader.read();
                if(flag  && c != '@') {
                    entry = false;
                    flag = false;
                }
                else{
                    flag = false;
                }
               if(c != '{') builder.append(c);
               else entry = false;
            }
            if(builder.toString().equals("@STRING")){
                return new Handler(builder.toString(),reader);
            }
            else if(builder.charAt(0) == '@' && !builder.toString().equals("@PREAMBLE")) {
                //typehandler będzie pomijał
                //TypeHandler.HandleType(builder.toString().toLowerCase(),reader);
                // here typeHandler will handle the type given to it and also given fields
                return new Handler(builder.toString(),reader);
            }
        }
        catch (IOException e) {
           // System.out.println(e.getMessage());
        }
        return null;
    }
}
