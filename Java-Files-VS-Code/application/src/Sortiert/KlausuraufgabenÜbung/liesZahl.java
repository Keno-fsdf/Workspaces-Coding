package Sortiert.KlausuraufgabenÜbung;
import java.util.Scanner;

public class liesZahl {


    public static void main(String[] args) {
        System.out.println(liesZahlen());
    }

  

    public static int liesZahlen() {
        Scanner scanner = new Scanner(System.in);
        boolean wiederholen = false;    
       
        int zahl = 0;
        do {
        String eingabe = scanner.next();
        zahl = Integer.valueOf(eingabe);



        if (zahl%1!=0) { wiederholen = true;
        System.out.println("Keine Ganzzahl, bitte gebe eine Ganzahl ein: ");
        zahl = scanner.nextInt();}}


        while (wiederholen==true); 
        return zahl ;


        }

        
        


    
    
}
