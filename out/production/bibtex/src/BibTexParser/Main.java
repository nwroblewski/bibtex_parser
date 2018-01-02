package BibTexParser;
import BibTexParser.Inputs.AllPublications;
import BibTexParser.Parser.Parser;
import BibTexParser.Types.DefinedTypes.BibtexTypes;
import BibTexParser.Verifiers.*;
import BibTexParser.ShowerAndSearcher.*;
import BibTexParser.Types.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        ArgsVerifier.verify(args);
        Parser parser = new Parser(args[0]);

        AllPublications pubs = new AllPublications();
        pubs = parser.Parse(); // w tym miejscu mamy obiekt zawierający wszystkie publikacje

        //Creating a raport about the publications written in input file
        // PublicationsVerifier.Verify(pubs);

        AuthorsCreator autorzy = new AuthorsCreator(args[1]);
        CategoriesCreator kategorie = new CategoriesCreator(args[2]);


        ShowPubs.printSpecific(pubs,args[3],kategorie.getKategorie(),autorzy.getAutorzy());


    }
}
