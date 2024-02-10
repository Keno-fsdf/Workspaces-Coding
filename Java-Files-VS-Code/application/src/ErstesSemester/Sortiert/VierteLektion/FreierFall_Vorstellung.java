package Sortiert.VierteLektion;

import java.util.Scanner;

public class FreierFall_Vorstellung {
    public static void main (String []args) throws InterruptedException {
        java.util.Scanner scanner = new Scanner(System.in);
        int zeitUser = scanner.nextInt();
        System.out.println(); //Einfach für die bessere Formatierung nach der User Eingabe
        double fallGeschwindigkeit = 9.80665;


        for (int countUP = 0; countUP<=zeitUser; countUP++)  {
            double zurückgelegteStrecke = 0.5*fallGeschwindigkeit*(countUP*countUP); //Berechnung der zurückgelegten Strecke
            Thread.sleep(1000);

            System.out.println("Zurückgelegt Strecke nach " + countUP + " Sekunden:");
            System.out.println(zurückgelegteStrecke + " Meter");

        }
        scanner.close();


    }
}
