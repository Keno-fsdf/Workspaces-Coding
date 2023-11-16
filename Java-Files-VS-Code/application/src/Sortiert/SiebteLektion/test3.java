package Sortiert.SiebteLektion;

public class test3 {


    public static void sortiereListe(int[] lottoZahlenListe) {
        for (int b = 0; b < lottoZahlenListe.length - 1; b++) {
            int minimumIndex = b;
    
            for (int i = b + 1; i < lottoZahlenListe.length; i++) {
                if (lottoZahlenListe[i] < lottoZahlenListe[minimumIndex]) {
                    minimumIndex = i;
                }
            }
    
            // Tausche die Werte an den Positionen b und minimumIndex
            int temp = lottoZahlenListe[b];
            lottoZahlenListe[b] = lottoZahlenListe[minimumIndex];
            lottoZahlenListe[minimumIndex] = temp;
    
            System.out.println("Array nach Schritt " + (b + 1) + ": " + java.util.Arrays.toString(lottoZahlenListe));
        }
    }
    
    public static void main(String[] args) {
        int[] lottoZahlenListe = {64, 25, 12, 22, 11};
    
        System.out.println("Ursprüngliches Array: " + java.util.Arrays.toString(lottoZahlenListe));
    
        sortiereListe(lottoZahlenListe);
    
        System.out.println("Sortiertes Array: " + java.util.Arrays.toString(lottoZahlenListe));
    }
    
}
