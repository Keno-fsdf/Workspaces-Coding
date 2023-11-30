package Sortiert.NeunteLektion;

public class lieblingsautosLektionNeun {
    
    public static void main(String[] args) {
        AutoLektionNeun Bmw1er = new AutoLektionNeun("BMW",500,"rot", 1);
        AutoLektionNeun Audia3 = new AutoLektionNeun( "audi", 200, "grün", 3);
        AutoLektionNeun eAutoAMG = new AutoLektionNeun( "Mercedes", 1000, "blau", 36);
        AutoLektionNeun AutoZuWenigHubraum = new AutoLektionNeun("Honda", -500, "grün", 5);
        AutoLektionNeun TestAutoHubraumÄnderung =  new AutoLektionNeun("Pagani", 6000, "orange", 8);


        //Zeigt das die "setHubraum-Methode" wie gewollt funktioneirt
        TestAutoHubraumÄnderung.setHubraum(500);
        System.out.println(TestAutoHubraumÄnderung.getHubraum());
        TestAutoHubraumÄnderung.setHubraum(-300);  //Hier ändert sich nichts (wie in der Aufgabenstellung verlangt)
        System.out.println(TestAutoHubraumÄnderung.getHubraum());





    
        //Rechnet den größten Hubraum aus und gibt in der Standardausgabe aus
        int[] hubraums = {Bmw1er.getHubraum(),  Audia3.getHubraum(), eAutoAMG.getHubraum(), AutoZuWenigHubraum.getHubraum(), TestAutoHubraumÄnderung.getHubraum() };
        bubbleSort(hubraums);
        System.out.println("Der größte Hubraum ist: " + hubraums[0]);


        
        //Gibt alle Auto-Objekte in der Standardausgabe aus

        //Liste von den autos
        AutoLektionNeun[] autos = {Bmw1er,Audia3, eAutoAMG, AutoZuWenigHubraum, TestAutoHubraumÄnderung};
        //Ausgabe der autos
        System.out.println("\nAutos: ");
        int i = 1;
        for (AutoLektionNeun elemente: autos) {  System.out.println(i+".Auto: " +"\n"+elemente + " "); i++;

        }
    }


    //Sortier Algo
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
