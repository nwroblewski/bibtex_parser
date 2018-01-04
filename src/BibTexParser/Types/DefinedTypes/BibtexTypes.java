package BibTexParser.Types.DefinedTypes;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;

import java.util.*;

public class BibtexTypes {
   public Map<Type, ArrayList<Field>> fields = new HashMap<>();

    /**
     * Creates a representation of all needed fields inside specific Publication type
     */
    public BibtexTypes() {
        ArrayList <Field> a1 = new ArrayList<>();
        ArrayList <Field> a2 = new ArrayList<>();
        ArrayList <Field> a3 = new ArrayList<>();
        ArrayList <Field> a4 = new ArrayList<>();
        ArrayList <Field> a5 = new ArrayList<>();
        ArrayList <Field> a6 = new ArrayList<>();
        ArrayList <Field> a7 = new ArrayList<>();
        ArrayList <Field> a8 = new ArrayList<>();
        ArrayList <Field> a9 = new ArrayList<>();
        ArrayList <Field> a10 = new ArrayList<>();
        ArrayList <Field> a11 = new ArrayList<>();
        ArrayList <Field> a12 = new ArrayList<>();
        ArrayList <Field> a13 = new ArrayList<>();

        a1.add(new Field("author"));
        a1.add(new Field("title"));
        a1.add(new Field("journal"));
        a1.add(new Field("year"));
        this.fields.put(new Type("article"), a1);

        a2.add(new Field("author"));
        a2.add(new Field("title"));
        a2.add(new Field("publisher"));
        a2.add(new Field("year"));
        this.fields.put(new Type("book"),a2);



        a3.add(new Field("title"));
        this.fields.put(new Type("booklet"), a3);


        a4.add(new Field("author"));
        a4.add(new Field("title"));
        a4.add(new Field("chapter"));
        a4.add(new Field("publisher"));
        a4.add(new Field("year"));
        this.fields.put(new Type("inbook"),a4);



        a5.add(new Field("author"));
        a5.add(new Field("title"));
        a5.add(new Field("booktitle"));
        a5.add(new Field("publisher"));
        a5.add(new Field("year"));
        this.fields.put(new Type("incollection"), a5);


        a6.add(new Field("author"));
        a6.add(new Field("title"));
        a6.add(new Field("booktitle"));
        a6.add(new Field("year"));
        this.fields.put(new Type("inproceedings"),a6);


        a7.add(new Field("title"));
        this.fields.put(new Type("manual"),a7);


        a8.add(new Field("author"));
        a8.add(new Field("title"));
        a8.add(new Field("school"));
        a8.add(new Field("year"));
        this.fields.put(new Type("mastersthesis"),a8);


        this.fields.put(new Type("misc"),a9);


        a10.add(new Field("author"));
        a10.add(new Field("title"));
        a10.add(new Field("school"));
        a10.add(new Field("year"));
        this.fields.put(new Type("phdthesis"),a10);



        a11.add(new Field("title"));
        a11.add(new Field("year"));
        this.fields.put(new Type("proceedings"),a11);


        a12.add(new Field("author"));
        a12.add(new Field("title"));
        a12.add(new Field("institution"));
        a12.add(new Field("year"));
        this.fields.put(new Type("techreport"),a12);


        a13.add(new Field("author"));
        a13.add(new Field("title"));
        a13.add(new Field("note"));
        this.fields.put(new Type("unpublished"),a13);





    }

}
