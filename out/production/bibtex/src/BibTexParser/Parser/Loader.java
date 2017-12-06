package BibTexParser.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Loader {
    String path;
    private static FileReader instance = null;
    private BufferedReader reader;

    public void setPath(String path){
        this.path = path;
    }
    public static FileReader getInstance(){
        if(instance == null) instance = new FileReader();
        return instance;
    }
    public void Open() throws Exception {
        try {
            if(path == null || path.length()==0) throw new FileNotFoundException("The filepath is empty, which is invalid.");

        }
        catch (FileNotFoundException e) {
            throw new Exception("File not found: " + e.getMessage());
        }
    }
    public String nextEntry() throws Exception {
        StringBuilder builder = new StringBuilder();

    }
}