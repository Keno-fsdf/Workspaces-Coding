package Sortiert.FünfteLektion;
import java.util.Scanner;
public class Pi {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben sie die Anzahl der Rechtecke an, die verwendet werden sollen um Pi auszurechnen");
    int rechtecke = scanner.nextInt();
    int anzahlDerDurchläufe = rechtecke;
    boolean erstesViereck = true;
    double extraBreite = 1;
    double flächeGesamt = 0;
    double flächeEins = 0;
    while (anzahlDerDurchläufe>0) {
        
        double bAllgemein = 1.0/rechtecke;
        double r = 1.0;
        
        if (erstesViereck==true) {
        double höhe1 = r;
        flächeEins = bAllgemein*höhe1;
        // System.out.println("Ich bin in der ersten schleife");
        erstesViereck=false;
        // a--;
        }

        if (erstesViereck==false) {
        

        double höhe2 = Math.sqrt((r *r) - (((1.0*extraBreite)/rechtecke) * ((1.0*extraBreite)/rechtecke)));   //pro weiteres Viereck ist 1.0 *2+1;     -->Variable für die 2, welche sich dann immer erhöht 
        double flächeZwei = bAllgemein*höhe2;
       ;
        flächeGesamt = flächeZwei + flächeGesamt;
        extraBreite++;
        // System.out.println(flächeGesamt);



        
        }
        anzahlDerDurchläufe--;


    }
   


    double flächeGesamtForReal = (flächeGesamt + flächeEins) * 4;
    System.out.println("Pi ist: " + flächeGesamtForReal);






    scanner.close();



    }
    
}
