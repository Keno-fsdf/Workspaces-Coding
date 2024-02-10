package Sortiert.VierteLektion;

public class kleinesEinmalEins {
    public static void main (String[]args) {
        int zahl1 = 1;
        int zahl2 = 1; //Die Zahl ist dafür gedacht für die einzlenen reihen beim 
        while (zahl2<=10) {
        System.out.println("\nDie " + zahl2 + " Spalte\n");  //Zur besseren Formatierung
        for (;zahl1<=10; zahl1++) {
           
            int berechnung = zahl1*zahl2;

            System.out.println(zahl1 + " x " + zahl2 + " = " + berechnung);
            

        }
        
        zahl1 = 1;  //Ich stelle die variable wieder auf 1, sodass die for -Schleife wieder von vorne anfangen kann
        zahl2++;
    }

    }
}
