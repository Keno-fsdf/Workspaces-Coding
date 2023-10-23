package Sortiert.FünfteLektion;

public class bennung {
    public static void main (String[]args) {
        int zufallszahl = (int) (Math.random()*100+1);
        // System.out.println(zufallszahl);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean zahlNochNichtErraten = false;


        while (zahlNochNichtErraten == false) {
        System.out.println("Raten sie die Zufallszahl indem sie eine Zahl eingeben: ");
        int zahlVomUser = scanner.nextInt();
        if (zahlVomUser>zufallszahl) {
            System.out.println("Die Zufallszahl ist kleiner");

        }
        else if (zahlVomUser<zufallszahl) {
            System.out.println("Die Zufallszahl ist größer");
        }

        else  {
            System.out.println("Sie haben die Zahl erraten: Sie lautet: " + zufallszahl );
            zahlNochNichtErraten=true;
        }
        

    }
    scanner.close();
    }
    
}
