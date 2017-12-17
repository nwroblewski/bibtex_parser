package BibTexParser.Parser;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Parser.BlocksParser;
import BibTexParser.Parser.Handlers.Handler;
import BibTexParser.Parser.Handlers.TypeHandler;

public class Main {
    public static void main(String[] args) throws Exception {

        Parser parser = new Parser("/home/miki/bibtex/bib");
        PublicationInput input = parser.Parse(); // w tym miejscu mamy obiekt zawierający wszystkie publikacje
        

    }
}
