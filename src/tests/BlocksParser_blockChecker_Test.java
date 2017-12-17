
import BibTexParser.Parser.BlocksParser;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
    /**
     *  With a given block of text checks if (@link BlocksParser) returns the type of the block with
     *  @ at the begging as a text
     *
     *
    */
public class BlocksParser_blockChecker_Test {
    @Test
    public void blockTest(){
        assertEquals("@TECHREPORT",BlocksParser.blockChecker("@TECHREPORT{techreport-full,\n" +
                "   author = \"Tom T{\\'{e}}rrific\",\n" +
                "   title = \"An {$O(n \\log n / \\! \\log\\log n)$} Sorting Algorithm\",\n" +
                "   institution = \"Fanstord University\",\n" +
                "   type = \"Wishful Research Result\",\n" +
                "   number = \"7\",\n" +
                "   address = \"Computer Science Department, Fanstord, California\",\n" +
                "   month = oct,\n" +
                "   year = 1988,\n" +
                "   note = \"This is a full TECHREPORT entry\",\n" +
                "}"));
        assertEquals("",BlocksParser.blockChecker("" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                ""));
        assertEquals("@ARTICLE",BlocksParser.blockChecker("@ARTICLE{article-full, \n" +
                "author = {L[eslie] A. Aamport}, \n" +
                "title = {The Gnats and Gnus Document Preparation System}, \n" +
                "journal = {mbox{G-Animal's} Journal}, \n" +
                "year = 1986, \n" +
                "volume = 41, \n " +
                "number = 7, \n" +
                "pages = \"73+\",  \n" +
                "month = jul, \n " +
                "note = \"This is a full ARTICLE entry\", \n " +
        "}"));
    }
}
