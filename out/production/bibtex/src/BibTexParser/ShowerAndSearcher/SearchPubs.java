package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput2;
import BibTexParser.Types.Field;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * this class is used to search arraylist of all publications to
 * give a list of those which i want to print with given authors
 */
public class SearchPubs {

    protected static ArrayList search(String [] authors, AllPublications pubs){
        ArrayList<PublicationInput2> publications = new ArrayList<>();
        try{
            for(PublicationInput2 input : pubs.publist){
                if(input.fields.containsKey(new Field("author"))){
                    for(String a: authors) {
                        Pattern r =  Pattern.compile(a);
                        String authors1 = input.fields.get(new Field("author"));
                        Matcher m =r.matcher(authors1);
                        if(m.find() && !Contains.contains(publications,input)){
                            publications.add(input);
                        }
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return publications;
    }

}
