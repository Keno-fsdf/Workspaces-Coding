package Sortiert.ZehnteLektion;

public class Weltzeit {
    

    public static void main(String[] args) {
        //Uhrzeit nicht direkt in der array drin speicher, sondern eher sowas wie Uhrzeit1 oder UhrzeitDeutschland
        Uhr[] weltzeit = new Uhr[24];
        //sum up every value and then divide through 60 for hours, through 60 for minutes and through 60 for secons


        int std = 0;
        int min = 23 ;
        int sek = 7;

        for (int i = 0; i<weltzeit.length;i++) {  //weiß net ob Uhr-length
            //wenn z >= 60, dann mach z-60 und mach bei min +1

            
            weltzeit[i] = new Uhr(std, min, sek);
            std++;
            // if (sek>=60){ sek = sek-60; min++;   }
            // if (min>=60) {min = min-60; std++;   }

        }
        System.out.println("Vor dem Hochzählen");
        for (Uhr uhr : weltzeit) {
            System.out.println(uhr);
            
        }
        System.out.println("Nach dem Hochzählen");
        for (Uhr uhr: weltzeit) {
            uhr.naechsteSek();
            System.out.println(uhr);

        }
    }

}
