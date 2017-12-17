package BibTexParser.Parser;

import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.BlocksParser;
import BibTexParser.Parser.Handlers.TypeHandler;

import java.io.IOException;

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

    public PublicationInput Parse() {
        PublicationInput inpute = new PublicationInput();
        try {
            this.loader.Open();

            while (this.loader.entryNotDone(this.loader.reader)) {
                Handler handler = blockChecker(this.loader.nextEntry());
                if(handler!=null && !handler.name.equals("@STRING")) TypeHandler.HandleType(handler,inpute);
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return inpute;
    }
    // Loader loader = new Loader();
}
