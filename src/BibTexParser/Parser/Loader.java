package BibTexParser.Parser;

import java.io.*;
import java.util.Stack;

public class Loader {
    String path;
    private static FileReader instance = null;
    private BufferedReader reader;
    private String extend;

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
        builder.append(extend);
        extend = "";
        Stack<Character> stos= new Stack<Character>();

        boolean entry = true;

        try{
            while(reader.ready() && entry){

                char c = (char) reader.read();
                if(c == '{') stos.push('{');
                if(c == '}'){
                    stos.pop();
                    if(stos.empty()) entry = false;
                }
                if(c == '@') {
                    entry = false;
                    extend = "@";
                }
                else{
                    builder.append(c);
                }
            }
        }
        catch (IOException e){
            throw new Exception("Opening a file failed" + e.getMessage());
        }
        return builder.toString();
    }


}