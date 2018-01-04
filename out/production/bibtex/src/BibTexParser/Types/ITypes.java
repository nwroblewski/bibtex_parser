package BibTexParser.Types;

import java.util.List;

    /**
    * Interfejs zarządzający typami pól (book,...) i polami (author...)
    */

public interface ITypes {

        List<Field> getFields();
        interface IType {
            String getName();
            boolean equals(Object o);
            int hashCode();
        }
        interface IField {
            String getName();
            boolean equals(Object o);
            int hashCode();
        }
    }
