package BibTexParser.Types.DefinedTypes;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;

import java.util.*;

public class BibtexTypes {
   private Map<Type, ArrayList<Field>> fields = new HashMap<>();

    public BibtexTypes() {
        ArrayList <Field> required = new ArrayList<>();


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("journal"));
        required.add(new Field("year"));
        required.add(new Field("volume"));
        this.fields.put(new Type("article"), required);
        required.clear();


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("publisher"));
        required.add(new Field("year"));
        this.fields.put(new Type("book"),required);
        required.clear();


        required.add(new Field("title"));
        this.fields.put(new Type("booklet"), required);
        required.clear();


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("chapter"));
        required.add(new Field("publisher"));
        required.add(new Field("year"));
        this.fields.put(new Type("inbook"),required);
        required.clear();


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("booktitle"));
        required.add(new Field("publisher"));
        required.add(new Field("year"));
        this.fields.put(new Type("incollection"), required);
        required.clear();


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("booktitle"));
        required.add(new Field("year"));
        this.fields.put(new Type("inproceedings"),required);
        required.clear();

        required.add(new Field("title"));
        this.fields.put(new Type("manual"),required);
        required.clear();

        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("school"));
        required.add(new Field("year"));
        this.fields.put(new Type("mastersthesis"),required);
        required.clear();


        this.fields.put(new Type("misc"),required);


        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("school"));
        required.add(new Field("year"));
        this.fields.put(new Type("phdthesis"),required);
        required.clear();


        required.add(new Field("title"));
        required.add(new Field("year"));
        this.fields.put(new Type("proceedings"),required);
        required.clear();

        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("institution"));
        required.add(new Field("year"));
        this.fields.put(new Type("techreport"),required);
        required.clear();

        required.add(new Field("author"));
        required.add(new Field("title"));
        required.add(new Field("note"));
        this.fields.put(new Type("unpublished"),required);



        //fields.put(new Type("book"), )

    }

}
