package BibTexParser.Types.DefinedTypes;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface IDefined {
    Map<ITypes.IType, Map<ITypes.IField,Properties>> getDefined();
    Set<Field> getFields();
    Set<Type> getTypes();

    /**
     *
     *
     * Metoda ta wspomaga budowanie mapy pod definicje publikacji ( jakie pola i czy wymagane, czy nie)
     * @param data = to, co chcemy wstawić do mapy
     * @param <T1> = typ klucza
     * @param <T2> = typ wartości
     * @return
     */
    default <T1,T2> HashMap <T1, T2> build(Object... data){
        HashMap <T1,T2> value = new HashMap<>();
        T1 key = null;
        int step = -1;

        for(Object values : data){
            step++;
            switch(step%2){
                case 0:
                    key = (T1) values;
                    continue;
                case 1:
                    value.put(key,(T2) values);
                    break;
            }
        }
        return value;
    }

}
