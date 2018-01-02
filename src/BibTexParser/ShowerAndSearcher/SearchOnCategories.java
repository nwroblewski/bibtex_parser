package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Type;

import java.util.ArrayList;

public class SearchOnCategories {
    public static ArrayList searchc(AllPublications pubs, String [] categories){
        ArrayList<PublicationInput> searched = new ArrayList<>();
        try{
            for(PublicationInput input : pubs.publist){
                for(String c : categories){
                    if(new Type(c).equals(input.typ) && !Contains.contains(searched,input)){
                        searched.add(input);
                    }
                }
            }
        }
        catch(Exception e){

        }
        return searched;
    }
}
