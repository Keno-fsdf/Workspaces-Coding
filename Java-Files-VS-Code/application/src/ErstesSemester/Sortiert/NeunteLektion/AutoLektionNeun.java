package Sortiert.NeunteLektion;

public class AutoLektionNeun {
    private String Marke;
    private int Hubraum;
    private String Farbe;
    private int Modell;
    private static int produktionszähler;

    public AutoLektionNeun(String Marke, int Hubraum, String Farbe, int Modell) {  //Konstrukter //KEIN void machen
        produktionszähler++;
        
        
        if (Hubraum<0) this.Hubraum = 1600;  //Überprüft, ob der Parameter Hubraum vom Benutzer kleiner als 0 ist und setzt es falls ja auf 1600
        else  this.Hubraum = Hubraum;

        this.Marke = Marke;
        this.Farbe = Farbe;
        this.Modell = Modell;

    }
    public void setHubraum(int ccm) {
        if (ccm>0) this.Hubraum = ccm;   //"this" wäre glaub ich hier nicht nötig gewesen, aber ich hab es zur Verdeutlichung hingemacht


    }


    public int getHubraum() {
        return this.Hubraum;
    }


    //Für die Ausgabe des ganzen:

    public String toString() {
        return "Marke: " + Marke + "| Hubraum: "+ Hubraum + "| Farbe: " + Farbe + "| Modell: " + Modell ;

    }
    
    
}
