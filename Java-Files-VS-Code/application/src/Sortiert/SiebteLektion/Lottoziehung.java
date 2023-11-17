package Sortiert.SiebteLektion;

public class Lottoziehung {
    public static void main(String[] args) {

        int [] ZahlenListe = lottoZahlenListe();
         System.out.println(java.util.Arrays.toString((ZahlenListe)));
        System.out.println(java.util.Arrays.toString(sortierteListe(ZahlenListe)));
        //wir brauchen zunächst eine methode die 6 random zahlen zieht, welche zwischen 1 und 49 sind
        //danach müssen diese in eine int array gegeben werden und zurückgegeben werden
        System.out.println("Array: " + java.util.Arrays.toString(ZahlenListe));
        //danach mit dem sortier alghoritmus arbeiten
    }
    

public static int[] lottoZahlenListe() {
    int[] zahlenListe = new int[6];

    for (int i = 0; i < zahlenListe.length; i++) {
        int neueZahl;
        boolean istDuplikat;

        do {
            istDuplikat = false;
            neueZahl = (int) (1 + Math.random() * 49);

            // Überprüfen, ob die generierte Zahl bereits in der Liste vorhanden ist
            for (int j = 0; j < i; j++) {
                if (zahlenListe[j] == neueZahl) {
                    istDuplikat = true;
                    break;
                }
            }
        } while (istDuplikat==true);

        zahlenListe[i] = neueZahl;
    }

    return zahlenListe;
}








    public static int[] sortierteListe (int[] lottoZahlenListe) {
        // int minimum = 100;
       
    for ( int b = 0; b<lottoZahlenListe.length; b++) {
        int minimum = b;  //minimum = 0;
        // int [] sortiereArray = new int[lottoZahlenListe.length];
        for (int i = 1+b; i<lottoZahlenListe.length; i++) { //i = 1
            if (lottoZahlenListe[i]<lottoZahlenListe[minimum]) {
                minimum = i;
            }


        }
        int temp = lottoZahlenListe[b];  //der erste wert der liste wird zwischengespeicher
        lottoZahlenListe[b] = lottoZahlenListe[minimum]; //Der erste wert der liste wird überschrieben mit dem minimum
        lottoZahlenListe[minimum] = temp; //

        
    
        }
        
        // System.out.println(minimum);
        return lottoZahlenListe;


    }
}
