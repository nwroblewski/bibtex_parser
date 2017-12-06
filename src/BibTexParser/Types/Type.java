package BibTexParser.Types;

public class Type implements ITypes.IType {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals() {
        return false;
    }
    @Override
    public int hashCode(){
        if(name == null) return 0;
        return name.hashCode();
    }
}
