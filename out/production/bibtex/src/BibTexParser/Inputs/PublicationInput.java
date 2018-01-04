package BibTexParser.Inputs;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.ITypes.IField;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;
import java.util.HashMap;
import java.util.Map;

public class PublicationInput {
     public Type typ;
     public Map<Field, String> fields = new HashMap<>();

    /**
     *
     * @param typ a type of publication
     * @param map hashmap of all fields associated with entry
     */
    public PublicationInput(Type typ, Map<Field,String> map){
        this.typ = typ;
        this.fields = map;
    }
}
