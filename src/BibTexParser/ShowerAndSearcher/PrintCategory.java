package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Field;

public class PrintCategory {
    /**
     *
     * @param input publicationinput object to be printed
     * @param c field name to be print
     * @param o character represented as string of lenght one used to print rame
     * @param width the width of rame
     */
    public static void printC(PublicationInput input, String c, String o, int width ){
        if(input.fields.containsKey(new Field(c)) && !c.equals("viewKey")){
           // System.out.println("");
            System.out.print(o+" ");
            System.out.print(c+" "+o);
            System.out.print(" "+input.fields.get(new Field(c)));
            for(int i=0; i<= width - (6+c.length() +input.fields.get(new Field(c)).length());i++){
                if(i<width - (6+c.length() +input.fields.get(new Field(c)).length()))System.out.print(" ");
                if(i ==width - (6+c.length() +input.fields.get(new Field(c)).length())) System.out.print(o);
            }

            System.out.println("");

        }

    }
}
