package Sortiert.FünfteLektion;

import java.util.Scanner;

public class QuadratwurzelExtraAufgabe {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        boolean programmWeiter = true;
        double yi = 1;
        System.out.println("Geben sie ihre Zahl ein, aus welcher sie ihre Wurzel ziehen wollen: ");
        double zahlWurzelZiehen = scanner.nextDouble(); //später noch in ein double umändern
        int anzahlderDurchläufe = 0;
       
    
        
        double berechnung;
        double unterschied = 0;



        double WurzelGezogenMitMethode = Math.sqrt(zahlWurzelZiehen);


        if (zahlWurzelZiehen<0) { System.out.println("Fehler: Es können aus negativen Zahlen keine Wurzel gezogen werden");
        programmWeiter =false;
        
        }
    
        if (zahlWurzelZiehen==0) { 
            System.out.println("Das Ergebnis ist " + zahlWurzelZiehen);
            programmWeiter = false; }   
    
    
    
        
    
        do {
        berechnung = ((zahlWurzelZiehen/yi + yi)/2.0);         
        // System.out.println(berechnung);
        unterschied = (berechnung-yi);
        if ( unterschied<0) {
            unterschied = unterschied*-1;
            
        }
    
        // System.out.println("Unterschied " + unterschied);
        yi = berechnung;  
        double unterschiedZwischenDenBeidenRechnungen = (WurzelGezogenMitMethode- berechnung);
        // System.out.println(berechnung);
        if (anzahlderDurchläufe==10) { //Nach 10 Durchläufen ist die eigene Berechnung schon genauso genau wie Math.sqrt
            
            
            System.out.println("\nNach: " + anzahlderDurchläufe + " Durchläufen ist das" + " Ergbnis mit Math-Methode: " + WurzelGezogenMitMethode +"\n" + "Ergbnis mit eigener Ausrechnung: " + berechnung + "\nUnd der Unterschied zwischen diesen beiden Formel ist: " + unterschiedZwischenDenBeidenRechnungen);
            
        }
        
        if (anzahlderDurchläufe==100) {
            
            
            System.out.println("\nNach: " + anzahlderDurchläufe + " Durchläufen ist das" + " Ergbnis mit Math-Methode: " + WurzelGezogenMitMethode +"\n" + "Ergbnis mit eigener Ausrechnung: " + berechnung + "\nUnd der Unterschied zwischen diesen beiden Formel ist: " + unterschiedZwischenDenBeidenRechnungen);
            
        }

    
        if (anzahlderDurchläufe==1000) {
            
            
           System.out.println("\nNach: " + anzahlderDurchläufe + " Durchläufen ist das " + " Ergbnis mit Math-Methode: " + WurzelGezogenMitMethode +"\n" + "Ergbnis mit eigener Ausrechnung: " + berechnung + "\nUnd der Unterschied zwischen diesen beiden Formel ist: " + unterschiedZwischenDenBeidenRechnungen);
            
        }
    
        if (anzahlderDurchläufe==10000) {
            
            
           System.out.println("\nNach: " + anzahlderDurchläufe + " Durchläufen ist das" + " Ergbnis mit Math-Methode: " + WurzelGezogenMitMethode +"\n" + "Ergbnis mit eigener Ausrechnung: " + berechnung + "\nUnd der Unterschied zwischen diesen beiden Formel ist: " + unterschiedZwischenDenBeidenRechnungen);
            
        }
        anzahlderDurchläufe++;
    
    
       
        }
    
        
        
        while ( (anzahlderDurchläufe<=10000)  &&  (programmWeiter==true) );  
        if (programmWeiter==true) System.out.println("\nDie Wurzel von: " + zahlWurzelZiehen + " ist: " + berechnung);

      
        scanner.close();
    
    
    
        }
}
