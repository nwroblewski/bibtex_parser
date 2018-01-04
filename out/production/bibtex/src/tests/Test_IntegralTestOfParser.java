
import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.AllStrings;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Parser.BlocksParser;
import BibTexParser.Parser.Parser;
import BibTexParser.Types.Field;
import org.junit.Test;
import BibTexParser.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test_IntegralTestOfParser {
    @Test
    public void ParserTest(){
        Parser parser = new Parser("/home/miki/bibtex/test1");
        AllPublications pubs = new AllPublications();
        AllStrings strings = new AllStrings();
        pubs = parser.Parse(strings.strings);

        for(PublicationInput input : pubs.publist){
            if((input.typ.toString()+input.fields.get(new Field("viewKey"))).equals("articlearticle-full")){
                assertEquals(true,input.fields.containsKey(new Field("author")));
                assertEquals(true,input.fields.containsKey(new Field("title")));
                assertEquals(true, input.fields.containsKey(new Field("journal")));
                assertEquals(true, input.fields.containsKey(new Field("year")));
                assertEquals(true, input.fields.containsKey(new Field("volume")));
                assertEquals(true, input.fields.containsKey(new Field("number")));
                assertEquals(true, input.fields.containsKey(new Field("pages")));
                assertEquals(true, input.fields.containsKey(new Field("month")));
                assertEquals(true, input.fields.containsKey(new Field("note")));
                assertEquals("{L[eslie] A. Aamport}",input.fields.get(new Field("author")));
                assertEquals("{The Gnats and Gnus Document Preparation System}",input.fields.get(new Field("title")));
                assertEquals("{\\mbox{G-Animal's} Journal}",input.fields.get(new Field("journal")));
                assertEquals("1986",input.fields.get(new Field("year")));
            }
            if((input.typ.toString()+input.fields.get(new Field("viewKey"))).equals("articlearticle-minimal")){
                assertEquals(true, input.fields.containsKey(new Field("author")));
                assertEquals(true, input.fields.containsKey(new Field("title")));
                assertEquals(true, input.fields.containsKey(new Field("journal")));
                assertEquals(true, input.fields.containsKey(new Field("year")));
            }
            if((input.typ.toString()+input.fields.get(new Field("viewKey"))).equals("articlearticle-crossref")){
                assertEquals(true, input.fields.containsKey(new Field("crossref")));
                assertEquals(true, input.fields.containsKey(new Field("key")));
                assertEquals(true, input.fields.containsKey(new Field("author")));
                assertEquals(true, input.fields.containsKey(new Field("title")));
                assertEquals(true, input.fields.containsKey(new Field("pages")));
                assertEquals(true, input.fields.containsKey(new Field("note")));
            }
        }
    }

}
