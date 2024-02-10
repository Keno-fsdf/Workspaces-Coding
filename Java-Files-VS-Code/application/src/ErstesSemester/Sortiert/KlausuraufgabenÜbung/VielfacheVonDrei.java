package Sortiert.KlausuraufgabenÜbung;

public class VielfacheVonDrei {
    
    public static void main(String[] args) {
        int[]array = {3,9, -3, 5, 0, 8, 55, 66};
        
        System.out.println(vielfacheVonDrei(array));
        
    }




    public static int vielfacheVonDrei(int[] array) {
        int zeahler = 0;
        for (int elemente: array) {
       
        if (elemente%3==0) zeahler++; }
        return zeahler;
        
        
}
}
// public class VielfacheVonDrei {

//     public static void main(String[] args) {
//         // Beispielaufruf
//         int[] meinFeld = {1, 3, 6, 9, 12, -3, 0, 7};
//         int anzahlVielfache = anzahlVielfacheVonDrei(meinFeld);
//         System.out.println("Anzahl der Vielfachen von 3: " + anzahlVielfache);
//     }

//     public static int anzahlVielfacheVonDrei(int[] intFeld) {
//         int anzahlVielfache = 0;

//         for (int wert : intFeld) {
//             if (wert % 3 == 0) {
//                 anzahlVielfache++;
//             }
//         }

//         return anzahlVielfache;
//     }
// }

