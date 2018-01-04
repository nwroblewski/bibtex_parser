package BibTexParser.Inputs;

public class StringInput {
    String key;
    String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @param key a key of string variable
     * @param value a value of string variable
     */
    public StringInput(String key, String value){
        this.key = key;
        this.value = value;
    }

}
