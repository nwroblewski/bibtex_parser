package BibTexParser.Types.DefinedTypes;

import BibTexParser.Types.ITypes;
import BibTexParser.Types.Type;
import BibTexParser.Types.Field;

import java.util.*;

public class BibtexTypes implements IDefined{
    public Map<ITypes.IType, Map<ITypes.IField, Properties>> definition = new HashMap<>();

    private Set<Type> types = new HashSet<>();
    private Set<Field> fields = new HashSet<>();

    public BibtexTypes(){
        Properties r = Properties.REQUIRED;
        Properties o = Properties.OPTIONAL;

        ITypes.IType article = new Type("article");
        ITypes.IType book = new Type("book");
        ITypes.IType booklet = new Type("booklet");
        ITypes.IType inproceedings = new Type("inproceedings");
        ITypes.IType inbook = new Type("inbook");
        ITypes.IType incollection = new Type("incollection");
        ITypes.IType manual = new Type("manual");
        ITypes.IType masterthesis = new Type("masterthesis");
        ITypes.IType phdthesis = new Type("masterthesis");
        ITypes.IType techreport = new Type("techreport");
        ITypes.IType misc = new Type("misc");
        ITypes.IType unpublished = new Type("unpublished");

        ITypes.IField address = new Field("address");
        ITypes.IField annote = new Field("annote");
        ITypes.IField author = new Field("author");
        ITypes.IField booktitle = new Field("booktitle");
        ITypes.IField chapter = new Field("chapter");
        ITypes.IField crossref = new Field("crossref");
        ITypes.IField edition = new Field("edition");
        ITypes.IField editor = new Field("editor");
        ITypes.IField howpublished = new Field("howpublished");
        ITypes.IField institution = new Field("institution");
        ITypes.IField journal = new Field("journal");
        ITypes.IField key = new Field("key");
        ITypes.IField month = new Field("month");
        ITypes.IField note = new Field("note");
        ITypes.IField number = new Field("number");
        ITypes.IField organization = new Field("organization");
        ITypes.IField pages = new Field("pages");
        ITypes.IField publisher = new Field("publisher");
        ITypes.IField school = new Field("school");
        ITypes.IField series = new Field("series");
        ITypes.IField title = new Field("title");
        ITypes.IField type = new Field("type");
        ITypes.IField volume = new Field("volume");
        ITypes.IField year = new Field("year");

        definition.put(article, build(author, r, title, r, journal, r, year, r, volume, o, number, o, pages, o, month, o, note, o));
        definition.put(book, build(author, r, title, r, publisher, r, year, r, volume, o, series, o, address, o, edition, o, month, o, note, o));
        definition.put(booklet, build(title, r, author, o, howpublished, o, address, o, month, o, year, o, note, o));
        definition.put(inbook, build(author, r, title, r, chapter, r, publisher, r, year, r, volume, o, series, o, type, o, address, o, edition, o, month, o, note, o));
        definition.put(incollection, build(author, r, title, r, booktitle, r, publisher, r, year, r, volume, o, number, o, series, o, type, o, chapter, o, pages, o, address, o, edition, o, month, o, note, o));
        definition.put(manual, build(title, r, author, o, organization, o, address, o, edition, o, month, o, year, o, note, o));
        definition.put(masterthesis, build(author, r, title, r, school, r, year, r, type, o, address, o, edition, o, month, o, year, o, note, o));
        definition.put(misc, build(author, o, title, o, howpublished, o, month, o, year, o, note, o));
        definition.put(phdthesis, build(author, r, title, r, school, r, year, r, type, o, address, o, month, o, note, o));
        definition.put(inproceedings, build(title, r, year, r, editor, o, volume, o, series, o, address, o, month, o, organization, o, publisher, o, note, o));
        definition.put(techreport, build(author, r, title, r, institution, r, year, r, type, o, number, o, address, o, month, o, note, o));
        definition.put(unpublished, build(author, r, title, r, note, r, month, o, year, o));

        }
        @Override
        public Map<ITypes.IType, Map<ITypes.IField, Properties>> getDefined() {
            return definition;
        }
        public Set<Field> getFields(){
            return fields;
        }
        public Set<Type> getTypes(){
            return types;
        }
}
