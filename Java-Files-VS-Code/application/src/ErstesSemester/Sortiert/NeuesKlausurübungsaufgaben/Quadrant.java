package Sortiert.NeuesKlausurübungsaufgaben;

public class Quadrant {
    
    public static void printQuadrant (int zeilen) {

        int i = 1;
        String ergebnis = "";
        while (i<= zeilen) {
            if (i==1) { ergebnis+= "****";}
            else if (i!=zeilen) {ergebnis+= "\n*  *";}
            else if (i==zeilen) ergebnis+="\n" + "****";
            i++;
        }
        

        System.out.println(ergebnis);

    }

    public static void main(String[] args) {
        printQuadrant(6);
    }

}
