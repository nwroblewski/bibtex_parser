package BibTexParser.Inputs;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.ITypes.IField;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;
import java.util.HashMap;
import java.util.Map;

/**
     * Klasa używana do tworzenia typów publikacji wraz z polami które zostały wprowadzone
    */
public class PublicationInput {
    //public String key; //klucz zaraz po klamrze '{' która otwiera definicje danej publikacji
    public Map<Type, Map<Field, String>> publication = new HashMap<>();

    public PublicationInput(){
        this.publication = new HashMap<>();
    }
    public Map<Field, String> getFields() {
        return (Map<Field, String>) this.publication.values();
    }
}
