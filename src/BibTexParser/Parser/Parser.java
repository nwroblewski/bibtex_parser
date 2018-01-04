package BibTexParser.Parser;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.StringInput;
import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.Handlers.StringHandler;
import BibTexParser.Parser.Handlers.TypeHandler;

import java.util.ArrayList;

import static BibTexParser.Parser.BlocksParser.blockChecker;

public class Parser {
    private Loader loader;
    private String path;
    public Parser(String path) {
        this.path = path;
        this.loader = new Loader();
        this.loader.setPath(path);
    }

    /**
     * parses the input file and calls the apropriate methods to create objects
     * @param stringVariables a stringinput class array list to hold every string variable occurance in bibtex file
     * @return AllPublications object that stores all of the publication entries in bibtex file
     */
    public AllPublications Parse(ArrayList<StringInput> stringVariables) {
        AllPublications inpute = new AllPublications();
        try {
            this.loader.Open();

            while (this.loader.entryNotDone(this.loader.reader)) {
                Handler handler = blockChecker(this.loader.nextEntry());
                if(handler!=null && !handler.name.equals("@STRING")) TypeHandler.HandleType(handler,inpute);
                if(handler!=null && handler.name.equals("@STRING")) StringHandler.HandleString(handler, stringVariables);
            }

        }
        catch (Exception e) {
            System.out.println("Parse error (@link Parser): " +e.getMessage());
        }
        return inpute;
    }
    // Loader loader = new Loader();
}
