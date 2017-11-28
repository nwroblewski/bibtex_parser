package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Loader {


    public static void LoadAndPrint(String name){
        try {
            Scanner bib = new Scanner(new FileReader(""+name));
            while(bib.hasNextLine()){

                System.out.println(bib.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Plik o nazwie " + name +" nie istnieje.");
        }
    }

    public static void main(String[] args) {
        LoadAndPrint(args[0]);
    }
}