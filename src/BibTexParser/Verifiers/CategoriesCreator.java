package BibTexParser.Verifiers;

/**
 * Class used to create a categories array to be printed
 */
public class CategoriesCreator {
    private String [] kategorie;
    public CategoriesCreator(String k){
        if(!k.equals("-")){
            this.kategorie = k.split(",");
        }
        else this.kategorie = null;
    }

    public String[] getKategorie() {
        return kategorie;
    }
}
