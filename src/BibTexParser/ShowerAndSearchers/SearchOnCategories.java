package BibTexParser.ShowerAndSearchers;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Type;

import java.util.ArrayList;

public class SearchOnCategories {
    /**
     *
     * @param pubs all of the publications entries
     * @param categories the array of categories that we want to print
     * @return arraylist of publication inputs to be shown
     */

    protected static ArrayList searchc(AllPublications pubs, String [] categories){
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
