package BibTexParser.Verifiers;

import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.DefinedTypes.BibtexTypes;
import BibTexParser.Types.Field;

import java.util.ArrayList;

public class PublicationsVerifier {
    /**
     * Method used to verify all publication entries and print the raport about them
     * @param pubs AllPublication object containing all of the publication entries
     */
    public static void Verify(AllPublications pubs){
        try{
            System.out.println("Raport poprawności publikacji: ");
            BibtexTypes types = new BibtexTypes();
            //iteruje po allpublications, potem wylapuje typ i z odpowiedniej mapy
            //ze zdefiniowanych typow sprawdzam czy sa klucze o danych polach
            for(PublicationInput input : pubs.publist){
                ArrayList<Field> required = types.fields.get(input.typ);
                for(Field pole: required){
                    if(!input.fields.containsKey(pole)){
                        if(pole.equals(new Field("author"))){
                            if(!input.fields.containsKey(new Field("editor"))) System.out.println(input.typ+" ("+input.fields.get(new Field("viewKey"))+")"+" nie posiada pola author ani editor!");
                        }
                        else System.out.println(input.typ +" ("+input.fields.get(new Field("viewKey"))+")"+ " nie posiada wymaganego pola: " + pole);
                    }
                }
            }
            System.out.println("");
            System.out.println("");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
