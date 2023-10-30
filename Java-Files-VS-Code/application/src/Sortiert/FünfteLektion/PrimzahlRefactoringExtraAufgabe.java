package Sortiert.FünfteLektion;
import java.util.Scanner;
public class PrimzahlRefactoringExtraAufgabe {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben sie die Zahl, die überprüft werden soll: ");
        int a = scanner.nextInt();

        boolean Ergebenis = primzahl(a);
        // if (Ergebenis==true) System.out.println("Es handelt sich um eine Primzahl");
        if (Ergebenis==true) System.out.println("Es handelt sich um eine Primzahl");
        else System.out.println("Es handelt sich um keine Primzahl");

        
        scanner.close();
    }

    public static boolean primzahl (int zahl) {
        boolean primzahl = true; 

        for (int zahlenUnterZahlZuÜberprüfen = zahl-1; zahlenUnterZahlZuÜberprüfen>1;zahlenUnterZahlZuÜberprüfen--){ 

        int überprüfungGanzzahigNurDurchSichSelbst = zahl%zahlenUnterZahlZuÜberprüfen;  
        if (überprüfungGanzzahigNurDurchSichSelbst==0) primzahl=false;
             
        }
        
        if (primzahl==false) return false;
        else return true;
    }   
    
}
    

