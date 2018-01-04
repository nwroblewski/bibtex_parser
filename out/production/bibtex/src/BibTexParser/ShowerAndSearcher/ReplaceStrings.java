package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.AllStrings;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Inputs.StringInput;

import java.util.Iterator;
import java.util.Map;

public class ReplaceStrings {

    protected static void Replace(AllPublications pubs, AllStrings strings){
        for(PublicationInput input : pubs.publist){
            Iterator it = input.fields.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                String t = (String) pair.getValue();
                for(StringInput input1: strings.strings){

                }
            }
        }
    }
}
