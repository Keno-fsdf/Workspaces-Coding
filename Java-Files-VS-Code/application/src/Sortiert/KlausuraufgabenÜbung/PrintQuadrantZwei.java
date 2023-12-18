package Sortiert.KlausuraufgabenÜbung;

public class PrintQuadrantZwei {
    
    public static void main(String[] args) {
    printQuadrant(8);
    }

    public static void printQuadrant(int zeilen) {
        if (zeilen==0) return;
         String ergebnis = "";
        for (int i = 0; i<zeilen; i++) {
         
            if (i==0 || i==zeilen-1) ergebnis+="****";
            else ergebnis+="*  *";

            ergebnis+="\n";

        }



        System.out.println(ergebnis);
    }
    
}
