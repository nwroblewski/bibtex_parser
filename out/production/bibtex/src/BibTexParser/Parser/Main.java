package BibTexParser.Parser;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Parser.BlocksParser;
import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.Handlers.TypeHandler;
import BibTexParser.Types.Field;
import BibTexParser.Types.Type;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        Parser parser = new Parser("/home/miki/bibtex/bib");
        PublicationInput input = parser.Parse(); // w tym miejscu mamy obiekt zawierający wszystkie publikacje
       // Type typ = new Type("article");
       // Map<Field,String> pola = input.publication.get(typ);
    //    Iterator it = pola.entrySet().iterator();
     //   while(it.hasNext()){
     //       Map.Entry pair = (Map.Entry)it.next();
           // System.out.println(pair.getKey() + " = " + pair.getValue());
     //       it.remove();
    //    }

    }
}
