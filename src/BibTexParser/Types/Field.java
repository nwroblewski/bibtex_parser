package BibTexParser.Types;

public class Field implements ITypes.IField {
    public String name;

    public Field(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals() {
        return false;
    }
    @Override
    public String toString(){
        return getName();
    }
    @Override
    public int hashCode(){
        if(name == null) return 0;
        return name.hashCode();
    }
}
