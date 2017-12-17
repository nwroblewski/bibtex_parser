package BibTexParser.Inputs;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.ITypes.IField;

import java.util.HashMap;
import java.util.Map;

/**
     * Klasa używana do tworzenia typów publikacji wraz z polami które zostały wprowadzone
    */
public class PublicationInput {
    //public String key; //klucz zaraz po klamrze '{' która otwiera definicje danej publikacji
    public Map<ITypes.IType , Map<IField, String>> publication = new HashMap<>();

    public PublicationInput(){
        this.publication = new HashMap<>();
    }
    public Map<IField, String> getFields() {
        return (Map<IField, String>) this.publication.values();
    }
}
