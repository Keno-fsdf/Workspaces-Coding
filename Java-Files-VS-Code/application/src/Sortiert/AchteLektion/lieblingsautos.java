package Sortiert.AchteLektion;

public class lieblingsautos {
    public static void main(String[] args) {
        Auto Bmw1er = new Auto();
        Bmw1er.Marke = "Bmw";
        Bmw1er.Hubraum = 500;
        Bmw1er.Farbe = "rot";
        Bmw1er.Modell = 1;

        Auto audia3 = new Auto();
        audia3.Marke = "audia3";
        audia3.Hubraum = 200;
        audia3.Farbe = "grün";
        audia3.Modell = 3;



        Auto eAutoAMG = new Auto();
        eAutoAMG.Marke = "Mercedes";
        eAutoAMG.Hubraum = 1000;
        eAutoAMG.Farbe = "blau";
        eAutoAMG.Modell = 36;

        int[] hubraums = {Bmw1er.Hubraum,  audia3.Hubraum, eAutoAMG.Hubraum = 1000 };
        bubbleSort(hubraums);
        System.out.println("Der größte Hubraum ist: " + hubraums[0]);


        // System.out.println("Auto:" + Bmw1er);

        //Liste von den autos
        Auto[] autos = {Bmw1er,audia3, eAutoAMG};
        //Ausgabe der autos
        System.out.println("\nAutos: ");
        for (Auto elemente: autos) System.out.println("Auto: " +elemente + " ");

    }

    public static void bubbleSort(int[] hubraums) {
        for (int i = 0; i<hubraums.length; i++) {
            for (int j = 1+i; j<hubraums.length; j++) {
                if (hubraums[j]>hubraums[i]) {
                    int zwischenspeicher = hubraums[j];
                    hubraums[j] = hubraums[i];
                    hubraums[i] = zwischenspeicher;

                }

            }

        }


    }


    
}
