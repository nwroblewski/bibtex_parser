package BibTexParser.Inputs;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.ITypes.IField;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;
import java.util.HashMap;
import java.util.Map;

public class PublicationInput2 {
     public Type typ;
     public Map<Field, String> fields = new HashMap<>();

    public PublicationInput2(Type typ, Map<Field,String> map){
        this.typ = typ;
        this.fields = map;

    }
}
