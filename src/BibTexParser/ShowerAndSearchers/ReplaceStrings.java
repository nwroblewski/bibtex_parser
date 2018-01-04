package BibTexParser.ShowerAndSearchers;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.AllStrings;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Inputs.StringInput;
import java.util.regex.Pattern;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import BibTexParser.Types.Field;

public class ReplaceStrings {
    /**
     *
     * @param pubs AllPublication objects with all of the publications
     * @param strings AllStrings with all of the bibtex string variables, values of this strings will replace any occurance
     *                of key in fields values
     */
    protected static void Replace(AllPublications pubs, AllStrings strings){
        for(PublicationInput input : pubs.publist){
            Iterator it = input.fields.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                String t = (String) pair.getValue();
                for(StringInput input1: strings.strings){
                    Pattern r = Pattern.compile(input1.getKey());
                    Matcher m = r.matcher(t);
                    if(m.find()){
                        input.fields.put((Field)pair.getKey(), ((String) pair.getValue()).replaceAll(input1.getKey(),input1.getValue()));
                    }
                }
            }
        }
    }
}
