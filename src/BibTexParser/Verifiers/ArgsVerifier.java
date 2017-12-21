package BibTexParser.Verifiers;

public class ArgsVerifier {
    public static void verify(String [] args){
        try{
            if(args.length!=4){
                if(args.length<4) throw new Exception("Podałeś za mało argumentów!");
                else throw new Exception("Podałeś za dużo argumentów!");
            }
        if(args[3].length()!=1) throw new IllegalArgumentException("Ostatni argument powinien być ZNAKIEM obramowania!!");



        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
