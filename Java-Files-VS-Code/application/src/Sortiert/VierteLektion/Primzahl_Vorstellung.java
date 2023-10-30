package Sortiert.VierteLektion;

public class Primzahl_Vorstellung {
    public static void main (String []args) {
        //von 0 bis zahlZuÜberprüfen

        

        boolean primzahl = true; //initalisierung einer boolean variable
        System.out.println("Geben sie die Zahl die überprüft werden soll ein: "); //Anweisung an den User

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int zahlZuÜberprüfen = scanner.nextInt();   //Scanner für die Zahl, die der User eingibt

        System.out.println();   // Zur besseren Übersicht

        //Überprüfung ob es sich um eine Primzahl handelt innerhalb der if Schleife

        for (int zahlenUnterZahlZuÜberprüfen = zahlZuÜberprüfen-1; zahlenUnterZahlZuÜberprüfen>1;zahlenUnterZahlZuÜberprüfen--){  //-->Wir müssen vor 1 aufhören 6%1 = 0 

        int überprüfungGanzzahigNurDurchSichSelbst = zahlZuÜberprüfen%zahlenUnterZahlZuÜberprüfen;  //Berechnung mit dem Modulo Operator. -->Erklärung siehe direkt darunter
        if (überprüfungGanzzahigNurDurchSichSelbst==0) primzahl=false;

            // Beispiel mit der Zahl 6:   6%5 = 1             ,         6%4 = 2         , 6%3 = 0 ,       6%2 = 0 ,     -->Wir müssen vor 1 aufhören 6%1 = 0      , 6%0 =?? -->Fehlermeldung 
            //  -->Sobald bei einem Ergebenis  "0" rauskommt handelt es sich um KEINE primzahl, ansonsten schon. -->Geteilt durch 1 wird garnicht geprüft. 
             
        }
        
        //Ausgabe des Ergebnisses in der Standardausgabe je nachdem ob es sich um eine Primzahl handelt oder nicht

        if (primzahl==false) System.out.println("Es handelt sich um keine Primzahl");
        else System.out.println("Es handelt sich um eine Primzahl");

        
        


        scanner.close();

    }
    
}
