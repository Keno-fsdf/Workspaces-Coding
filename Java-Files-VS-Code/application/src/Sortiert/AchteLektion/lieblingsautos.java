package Sortiert.AchteLektion;

public class lieblingsautos {
    public static void main(String[] args) {
        //Erstellung der verschieden Auto-Objekte

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

        //Erstellung einer Array mit dem Hubraum von jedem Auto
        int[] hubraums = {Bmw1er.Hubraum,  audia3.Hubraum, eAutoAMG.Hubraum };
        bubbleSort(hubraums);   //Sortiert diese Array
        System.out.println("Der größte Hubraum ist: " + hubraums[0]); //Gibt den größten Hubraum aus


     

        //Liste von den autos
        Auto[] autos = {Bmw1er,audia3, eAutoAMG};
        //Ausgabe der autos
        System.out.println("\nAutos: ");
        int i = 1;
        for (Auto elemente: autos) {  System.out.println(i+".Auto: " +"\n"+elemente + " "); i++;

    }

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
