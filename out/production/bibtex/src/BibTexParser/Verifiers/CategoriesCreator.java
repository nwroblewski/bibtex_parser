package BibTexParser.Verifiers;

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
