package BibTexParser;
import BibTexParser.Inputs.AllPublications;
import BibTexParser.Parser.Parser;
import BibTexParser.Verifiers.*;
import BibTexParser.ShowerAndSearcher.*;
public class Main {
    public static void main(String[] args)  {
        ArgsVerifier.verify(args);
        Parser parser = new Parser(args[0]);

        AllPublications pubs = new AllPublications();
        pubs = parser.Parse(); // w tym miejscu mamy obiekt zawierający wszystkie publikacje

        AuthorsCreator autorzy = new AuthorsCreator(args[1]);
        CategoriesCreator kategorie = new CategoriesCreator(args[2]);
    ShowPubs.printSpecific(pubs,args[3],kategorie.getKategorie(),autorzy.getAutorzy());


      // BibTexParser.Types.Field pole = new BibTexParser.Types.Field("author");
      // System.out.println(pubs.publist.get(0).fields.containsKey(pole));
    }


}
