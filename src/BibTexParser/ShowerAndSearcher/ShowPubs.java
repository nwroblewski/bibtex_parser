package BibTexParser.ShowerAndSearcher;


import BibTexParser.Inputs.AllPublications;
import BibTexParser.Inputs.PublicationInput;
import BibTexParser.Types.Field;
import java.util.Iterator;
import java.util.Map;

/**
 * This class is used to show all of the publications
 */
public class ShowPubs {


    /**
     *
     * @param pubs  array list of all publications
     * @param o     a character to be rame
     * @param categories    all categories to be printed
     * @param authors
     */
    public static void printSpecific(AllPublications pubs,String o,String[] categories,String[] authors ){
        int width = 80;
        if(o.equals("-")) o = "*";
        if(authors!=null)pubs.publist = SearchPubs.search(authors,pubs);
        for(PublicationInput input : pubs.publist)
            if(categories == null || categories != null){

                //System.out.println("");
                for(int i=0; i< width;i++){
                    System.out.print(o);
                }
                System.out.println("");
                System.out.println(input.typ.toString()+" ("+input.fields.get(new Field("viewKey"))+")");
                Iterator it = input.fields.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry pair = (Map.Entry)it.next();
                    if(!pair.getKey().toString().equals("viewKey")){
                        for(int i=0; i< width;i++){
                        System.out.print(o);
                        }
                    }

                    if(!pair.getKey().toString().equals("viewKey")) System.out.print("\n");
                    PrintCategory.printC(input,pair.getKey().toString(),o,width);
                    //System.out.println("");
                }
                for(int i=0; i< width;i++){
                    System.out.print(o);
                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
        }
    }
}