package BibTexParser.Parser.Handlers;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * Handle used to create objects of PublicationInput and StringInput
 */
public class Handler {
     public String name;
     public StringReader reader;

     public Handler(String name, StringReader reader){
         this.name = name;
         this.reader = reader;
     }
}
