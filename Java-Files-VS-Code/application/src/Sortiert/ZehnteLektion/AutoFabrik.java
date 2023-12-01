package Sortiert.ZehnteLektion;

import Sortiert.NeunteLektion.AutoLektionNeun;

public class AutoFabrik {
    private int produktionsKapazität;
    private int produktionszähler;
    private AutoLektionNeun[] produzierteAutos;
    public AutoFabrik(int produktionsKapazität) {
        this.produktionszähler = 0;
        this.produktionsKapazität = produktionsKapazität;
        this.produzierteAutos = new AutoLektionNeun[produktionsKapazität];
        
    }

    // private int[]
    public AutoLektionNeun[] getAutos () {
        return produzierteAutos;

    }

    public void produziere(String Marke, int Hubraum, String Farbe, int Modell) {
        AutoLektionNeun auto = new AutoLektionNeun(Marke, Hubraum, Farbe, Modell);
        boolean istVoll = true;
        for (int i = 0; i<produzierteAutos.length; i++) {
            
            if (produzierteAutos[i]==null) {
                produzierteAutos[i] = auto;
                istVoll = false;
                break;
               
                
            }

        }
        if(istVoll ==true) System.out.println("Die Autofabrik ist voll und hat keine Kapazitäten mehr");





        produktionszähler++;

        System.out.println("Auto produziert, Aktuelle Zählerstand ist: " + produktionszähler );



    }

}
