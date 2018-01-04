package BibTexParser.Inputs;

import java.util.ArrayList;

/**
 * Class to store all of the bibtex entries
 */
public class AllPublications {
     public ArrayList<PublicationInput> publist = new ArrayList<>();

    /**
     * Simple constructor
     */
    public AllPublications(){
        this.publist = new ArrayList<>();
    }
}
