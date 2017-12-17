package BibTexParser.Types;

public class Type implements ITypes.IType {
    String name;


    public Type(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Type type = (Type) o;
        if(type.getName().equals(this.getName())) return true;
        return false;
    }
    @Override
    public int hashCode(){
        if(name == null) return 0;
        return name.hashCode();
    }
}
