package BibTexParser.Verifiers;

public class AuthorsCreator {
    private String [] autorzy;
    public AuthorsCreator(String a){
        if(!a.equals("-"))
        this.autorzy = a.split(",");
        else this.autorzy =null;
    }

    public String[] getAutorzy() {
        return autorzy;
    }
}
