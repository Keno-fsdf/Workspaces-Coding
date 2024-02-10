package Sortiert.ZehnteLektion;

import Sortiert.NeunteLektion.AutoLektionNeun;

public class AutoFabrikTest {
    public static void main(String[] args) {
        AutoFabrik ersteFabrik = new AutoFabrik(10);

        ersteFabrik.produziere("Mercedes",3500, "grün", 5);
        ersteFabrik.produziere("BMW",3000, "gelb", 2);
        ersteFabrik.produziere("Audi",2000, "rot", 8);
        ersteFabrik.produziere("pagani",200550, "orange", 20);

        AutoLektionNeun[] ersteFabrikAutos = ersteFabrik.getAutos();
        System.out.println();
        for (AutoLektionNeun autos :ersteFabrikAutos) {
            if (autos!= null) System.out.println(autos);

            
        }
        

    }
}
