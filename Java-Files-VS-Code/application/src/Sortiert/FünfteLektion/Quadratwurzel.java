package Sortiert.FünfteLektion;
import java.util.Scanner;
public class Quadratwurzel {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
    boolean programmWeiter = true;
    double yi = 1;
    System.out.println("Geben sie ihre Zahl ein, aus welcher sie ihre Wurzel ziehen wollen: ");
    double zahlWurzelZiehen = scanner.nextDouble(); //später noch in ein double umändern
    
   

    ;
    double berechnung;
    double unterschied = 0;
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


    

    yi = berechnung;  


   
    }


    
    while ( (unterschied>10E-10)  &&  (programmWeiter==true) );  
    if (programmWeiter==true)System.out.println("\nDie Wurzel von: " + zahlWurzelZiehen + " ist: " + berechnung);





    scanner.close();



    }
    
}
