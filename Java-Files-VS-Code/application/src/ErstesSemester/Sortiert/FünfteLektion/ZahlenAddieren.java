package Sortiert.FünfteLektion;
import java.util.Scanner;
public class ZahlenAddieren {
    public static void main (String[]args) {
        System.out.println("Ihre eingegebenen ganzen Zahlen werden addiert\nDie Eingabe von 0 beendet das Programm und gibt die Summe aus: ");
        Scanner scanner = new Scanner(System.in);
        int Eingabe = scanner.nextInt();
        int summe = 0;
        while (Eingabe!=0) {
            summe = summe + Eingabe;





            Eingabe = scanner.nextInt();
        }
        System.out.println("Die Summe ist " + summe);





        scanner.close();



    }
    
}
