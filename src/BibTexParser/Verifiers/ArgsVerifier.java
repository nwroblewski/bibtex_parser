package BibTexParser.Verifiers;

public class ArgsVerifier {
    /**
     *
     * @param args with given arguments in the line to be verified
     */
    public static void verify(String [] args){
        try{
            if(args.length!=4){
                if(args.length==0){
                    System.out.println("Nie wpisałeś żadnego argumentu! Poprawny format argumentów to: ");
                    System.out.println("Pierwszy argument: ścieżka do pliku");
                    System.out.println("Drugi argument: lista autorów, których publikacje mają być wyświetlone, oddzielone przecinkami." +
                            " Wywołanie z argumentem '-' wywoła wszystkich autorów");
                    System.out.println("Trzeci argument: lista kategorii, które mają zostać wypisywane. Wywołanie z '-' wypisze wszystkie kategorie.");
                    System.out.println("Czwarty argument: znak z którego ma zostać utworzone obramowanie. Reprezentowane dalej jako string o długości 1.");
                    System.exit(1);
                }
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
