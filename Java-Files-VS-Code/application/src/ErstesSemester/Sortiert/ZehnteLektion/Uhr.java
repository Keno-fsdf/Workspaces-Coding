package Sortiert.ZehnteLektion;

import java.lang.reflect.Executable;

public class Uhr {
    int std;
    int min;
    int sek;

    public Uhr (int std, int min, int sek) {

        if (std<0 || std>23 || min<0 || min>59 ||  sek<0 || sek>59) {
          
        this.std = 12;
        this.min = 00;
        this.sek = 00;  

        }
        else {
        this.std = std;
        this.min = min;
        this.sek = sek;
        }
    }

    public int getStd() {
        return this.std;
    }

        public int getMin() {
        return this.min;

    }

        public int getSek() {
        return this.sek;

    }


    public void setUhr(int std, int min, int sek) throws Exception {

        if (std<0 || std>23 || min<0 || min>59 ||  sek<0 || sek>59) {
            throw new IllegalArgumentException("Ungültige Zeitangabe");
        }
        else {
        this.std = std;
        this.min = min;
        this.sek = sek;
        }

    }

    public void naechsteSek () {
        this.sek++;
    }

    public String toString() {
        return std + ":" + min + ":0" + sek;

    }

    
}
