package Sortiert.VierteLektion;

public class Querprodukt {
    static int zahl = 6;


    public static void main (String []args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    //Prüft ob es sich um eine gültige Zahl handelt    

    boolean loop = true;
    while (loop == true) {
        System.out.println("Geben sie eine gültige Zahl ein"); //Aufforderung an den Benutzer
        int zahl = scanner.nextInt();  //Eingabe vom User
        System.out.println(); //Für die bessere Formatierung
        int zahlFürDieAusgabeAmEnde = zahl;  //Das ist dafür, dass ich am Ende bei sysout es richtig hinschreiben kann, da die "zahl" variable bis dahin schon überschrieben wurde und des daher damit keinen Sinn mehr macht

    if (zahl>=1&& zahl<=1000000) {  //Prüft ob es im gültigen Bereich ist und falls ja gibt es in der Standardausgabe "Zahl ist gültig aus"
        loop = false;
        System.out.println("Zahl ist gültig\n");
        //Berchnung für das Querprodukt
        int querprodukt = 1;  //Muss 1 sein, denn ansonsten wir alles mit 0 multipliziert und alles mal 0 gibt immer 0 und das wollen wir ja nicht

        for (; zahl>0; zahl= zahl/10) {   
            

            int einzelZiffer = zahl%10; //Wir haben hier die einzelen Ziffern
            querprodukt = querprodukt *einzelZiffer;  
 
            

        }
        System.out.println("Das Querprodukt von " + zahlFürDieAusgabeAmEnde + " ist: " + querprodukt);

    }
    
    else System.out.println("FEHLER - Zahl ist ungueltig \n");           //Falls die Zahl nicht gültig ist

    }

    //Ab hier geht es normal mit dem progrmam wieder weiter
    //Problem jetzt könen wir aber ja nicht auf die zahl von oben zugreien

  



    scanner.close();

    }
}
