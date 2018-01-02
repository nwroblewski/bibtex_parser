package BibTexParser.Parser;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.StringInput;
import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.Handlers.TypeHandler;

import java.util.ArrayList;

import static BibTexParser.Parser.BlocksParser.blockChecker;

public class Parser {
    private Loader loader;
    private String path;
    public Parser(String path) {
        this.path = path;
        this.path = path;
        this.loader = new Loader();
        this.loader.setPath(path);
    }

    /**
     *
     * @return arraylist with all publications inputs
     */
    public AllPublications Parse(ArrayList<StringInput> stringVariables) {
        AllPublications inpute = new AllPublications();
        try {
            this.loader.Open();

            while (this.loader.entryNotDone(this.loader.reader)) {
                Handler handler = blockChecker(this.loader.nextEntry());
                if(handler!=null && !handler.name.equals("@STRING")) TypeHandler.HandleType(handler,inpute);
                // tutaj stringi
            }

        }
        catch (Exception e) {
            System.out.println("Parse error (@link Parser): " +e.getMessage());
        }
        return inpute;
    }
    // Loader loader = new Loader();
}
