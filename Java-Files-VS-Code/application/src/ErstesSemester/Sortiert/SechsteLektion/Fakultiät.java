package Sortiert.SechsteLektion;

public class Fakultiät {
    public static void main (String[]args) {
        System.out.println(fakultiät(3));

    }
    public static int fakultiät (int zahl) { //wenn wir größere Zahlen verwenden wollte, dann könnten wir auch long verwenden
        int ergebnis = 1;
        while (zahl>0) {
            
            ergebnis = ergebnis*zahl;  //1 = 1*5 = 5                5 = 5*4 = 20     20 = 20*3 0 60



            zahl--;
            
        }
        return ergebnis;



        



    }


    
}
