package BibTexParser;
import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput2;
import BibTexParser.Parser.Parser;
import BibTexParser.Types.Field;
import java.util.Iterator;
import java.util.Map;
import BibTexParser.Verifiers.*;
import BibTexParser.ShowerAndSearcher.*;
public class Main {
    public static void main(String[] args)  {
        ArgsVerifier.verify(args);
        Parser parser = new Parser(args[0]);

        AllPublications pubs = new AllPublications();
        pubs = parser.Parse(); // w tym miejscu mamy obiekt zawierający wszystkie publikacje

       // for(PublicationInput2 input: pubs.publist){
      //      System.out.println("");
      //      System.out.println(input.typ.toString().toUpperCase());
       //     Iterator it = input.fields.entrySet().iterator();
       //     while(it.hasNext()){
       //        Map.Entry pair = (Map.Entry)it.next();
      //          System.out.println(pair.getKey() + " = "+  pair.getValue());
      //     }
     //  }

        AuthorsCreator autorzy = new AuthorsCreator(args[1]);
       // CategoriesCreator kategorie = new CategoriesCreator(args[2]);
        //
    ShowPubs.printSpecific(pubs,args[3],null,autorzy.getAutorzy());


      // BibTexParser.Types.Field pole = new BibTexParser.Types.Field("author");
      // System.out.println(pubs.publist.get(0).fields.containsKey(pole));
    }


}
