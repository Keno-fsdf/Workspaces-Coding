

import java.util.Scanner;

public class Matrikelnummer_Vorstellbar {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihre siebenstellige Matrikelnummer an: ");


        int benutzereingabe = scanner.nextInt();   //Eingabe der Matrikelnummer 

        if (benutzereingabe < 10000000 && benutzereingabe > 999999) {
            int ueberpruefung1 = benutzereingabe %10000000/1000000; 
            int ueberpruefung2 = benutzereingabe %1000000/100000;
            if (ueberpruefung1==5 && ueberpruefung2==0 || ueberpruefung1==5 && ueberpruefung2==1 || ueberpruefung1==6 && ueberpruefung2==1) {
                System.out.println("Es liegt eine gültige Matrikelnummer vor");
            }
            else System.out.println("Ihre Eingabe ist ungültig");
            
        }
            else System.out.println("Ihre Eingabe ist ungültig.");

        scanner.close();
  
    }    
    
}
