package Sortiert.ZwölfteLektion.ZweiteAufgabe;

public class Nodes {

    String wort;
    String bedeutung;
    Nodes left;
    Nodes right;

    public Nodes (String wort, String bedeutung) {
        this.wort = wort;
        this.bedeutung = bedeutung;
        this.right = null;
        this.left = null;

    }

    
}
