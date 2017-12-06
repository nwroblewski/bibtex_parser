package BibTexParser.Types;

import java.util.List;

    /**
    * Interfejs zarządzający typami pól (book,...) i polami (author...)
    */

public interface ITypes {

        /**
         *
         * @param name - nazwa typu jako string
         * @return obiekt klasy Type z podaną nazwą
         */
        Type getType(String name);

        /**
         *
         * @param name - nazwa typu
         * @return  Jeżeli istnieje typ o podanej nazwie
         */
        boolean hasType(String name);

        /**
         *
         * @param name - nazwa pola
         * @return obiekt klasy Field z podaną nazwą
         */
        Field getField(String name);

        /**
         *
         * @param name nazwa pola
         * @return jeżeli istnieje pole o podanej nazwie
         */
        boolean hasField(String name);
        /**
         *
         * @return lista z wszystkimi typami
         */
        List<Type> getTypes();

        /**
         *
         * @return lista wszystkich pól
         */
        List<Field> getFields();
        interface IType {
            String getName();
            boolean equals();
            int hashCode();
        }
        interface IField {
            String getName();
            boolean equals();
            int hashCode();
        }
    }
