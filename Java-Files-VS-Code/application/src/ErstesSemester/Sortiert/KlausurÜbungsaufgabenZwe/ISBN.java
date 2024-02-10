package Sortiert.KlausurÜbungsaufgabenZwe;
import java.util.Scanner;
public class ISBN {
    public static  boolean Isbn (String ISBN) {
        char[] array = ISBN.toCharArray();
        
        String zwischenergebnis = "";
        zwischenergebnis.length();
        
        for (char elemente: array) {
        if (elemente!='-') zwischenergebnis+=elemente;
        }
        char[] ohneZahlen = zwischenergebnis.toCharArray();
        if (ohneZahlen.length<10 || ohneZahlen.length>13) return false;
       ;
        int ergebnis = 0;
        int zwischenergebnisZwei = 0;
        
        for (int i = 1; i<11; i++) {
        zwischenergebnisZwei = ohneZahlen[i-1]*i;
        
        ergebnis+=zwischenergebnisZwei;
        
        }
        if (ergebnis%11!=0) {return false;}
        
        return true; 
        
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        if (Isbn(eingabe)) System.out.println("Es handelt sich um eine gültige ISBN");
        else {
            System.out.println("Es handelt sich um keine gültige ISBN");
        }
      

    }
        
}
