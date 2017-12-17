package BibTexParser.Parser;

import java.io.*;
import java.util.Stack;

public class Loader {
    String path;
    private static FileReader instance = null;
    BufferedReader reader;
    private String extend;

    public void setPath(String path){
        this.path = path;
    }
  //  public static FileReader getInstance(){
    //    if(instance == null) instance = new FileReader();
    //    return instance;
   //   }
    public void Open() throws Exception {
        try {
            if(path == null || path.length()==0) throw new FileNotFoundException("The filepath is empty, which is invalid.");
            reader = new BufferedReader(new FileReader(path));
        }
        catch (FileNotFoundException e) {
            throw new Exception("File not found: " + e.getMessage());
        }
    }

    /**
     *
     * @return  Blok tekstu, gwarancja że nie będzie tam deklaracji kilku rekordów. Zmienne napisowe są w osobnych blokach,
     * taka reprezentacja pomaga znacznie w parsowaniu.
     * @throws Exception - jeżeli nie udało się otworzyć pliku
     */
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

    /**
     * @param buffer - buffer z pliku
     * @return False jeżeli cały input został przetworzony
     */
    boolean entryNotDone(BufferedReader buffer) throws IOException {
        if(buffer.ready()) return true;
        return false;
    }

}