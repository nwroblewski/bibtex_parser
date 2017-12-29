package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Field;
import java.util.ArrayList;

public class Contains {

    /**
     *
     * @param pubs arraylist with all publications
     * @param input object of publicationinput class which existance in given arraylist is checked
     * @return true if arraylist contains object of PublicationInput Class, false if not
     */
    public static boolean contains(ArrayList<PublicationInput> pubs, PublicationInput input ){
        if(!pubs.isEmpty()) {
            for (PublicationInput i : pubs) {
                if ((i.typ.toString() + i.fields.get(new Field("viewKey"))).equals(input.typ.toString() + input.fields.get(new Field("viewKey")))) {
                    return true;
                }
            }
        }
        return false;
    }
}
