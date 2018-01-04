package BibTexParser;
import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.AllStrings;
import BibTexParser.Parser.Parser;
import BibTexParser.Verifiers.*;
import BibTexParser.ShowerAndSearchers.*;

public class Main {
    public static void main(String[] args)  {
        ArgsVerifier.verify(args);
        Parser parser = new Parser(args[0]);

        AllPublications pubs = new AllPublications();
        AllStrings strings = new AllStrings();
        pubs = parser.Parse(strings.strings); // w tym miejscu mamy obiekt zawierający wszystkie publikacje

        //Creating a raport about the publications written in input file
         PublicationsVerifier.Verify(pubs);

        AuthorsCreator autorzy = new AuthorsCreator(args[1]);
        CategoriesCreator kategorie = new CategoriesCreator(args[2]);

        ShowPubs.printSpecific(pubs,args[3],kategorie.getKategorie(),autorzy.getAutorzy(),strings);


    }
}
