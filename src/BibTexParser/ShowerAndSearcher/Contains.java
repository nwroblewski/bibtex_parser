package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.PublicationInput2;
import BibTexParser.Types.Field;
import java.util.ArrayList;

public class Contains {
    public static boolean contains(ArrayList<PublicationInput2> pubs, PublicationInput2 input ){
        if(!pubs.isEmpty()) {
            for (PublicationInput2 i : pubs) {
                if ((i.typ.toString() + i.fields.get(new Field("viewKey"))).equals(input.typ.toString() + input.fields.get(new Field("viewKey")))) {
                    return true;
                }
            }
        }
        return false;
    }
}
