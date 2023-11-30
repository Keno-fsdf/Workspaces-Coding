package Sortiert.NeunteLektion;

public class Raum {
    
    private String kennung;
    private int anzahlSitzplätze;
    private boolean belegt;

    public Raum (String kennung, int anzahlSitzplätze) {
        this.belegt = false; //Bei der Erstellung des Raums ist ja der Raum zu 100% nicht belegt
        this.kennung = kennung;
        this.anzahlSitzplätze = anzahlSitzplätze;
    }


    public void belegungRaum() {
        this.belegt = true;
    }

    public boolean istBelegt() {
        return this.belegt;

    }



}
