package BibTexParser.ShowerAndSearcher;

import BibTexParser.Inputs.PublicationInput2;
import BibTexParser.Types.Field;

public class PrintCategory {

    public static void printC(PublicationInput2 input, String c, String o, int width ){
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
