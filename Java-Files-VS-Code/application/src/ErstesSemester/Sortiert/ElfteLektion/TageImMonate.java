package Sortiert.ElfteLektion;
import java.util.Scanner;
public class TageImMonate {


    public static void main(String[] args) {
        

        boolean fehlerGefunden = false;

        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Bitte geben sie einen gütligen Monat ein:");
        String eingabe = scanner.next();
        

        try {int tage = tageImMonat(eingabe);fehlerGefunden=false; System.out.println("Der Monat " + eingabe + " hat " + tage + " Tage");}

        catch (RuntimeException e) {
            fehlerGefunden = true;
            System.out.println("Ungültiger Monat wurde eingegeben\n");
            
            eingabe = scanner.nextLine();

        }
    }while (fehlerGefunden==true);
    }


    public static int tageImMonat(String monat)
    {
    int tage = switch(monat)




    {
    case "Februar" -> 28;
    case "April", "Juni", "September", "November" -> 30;
    case "Januar", "März", "Mai", "Juli", "August", "Oktober",
    "Dezember" -> 31;
    default -> throw new RuntimeException("falscher Monatsname");





    
    };
    return tage;
    }
   
}
