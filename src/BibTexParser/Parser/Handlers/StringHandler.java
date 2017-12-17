package BibTexParser.Parser.Handlers;

import java.io.BufferedReader;

/**
 *  Klasa StringHandler zawiera
 */
public class StringHandler {
    public String name;
    public BufferedReader reader;
    public StringHandler(String name, BufferedReader reader){
        this.name = name;
        this.reader = reader;
    }
}
