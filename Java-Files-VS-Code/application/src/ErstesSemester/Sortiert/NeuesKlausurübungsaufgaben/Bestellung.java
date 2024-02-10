package Sortiert.NeuesKlausurübungsaufgaben;

public class Bestellung {
    int bestellnummer;
    Artikel [] artikel;
    public Bestellung (int bestellnummer, int anzahlArtikel) { 
    artikel = new Artikel [anzahlArtikel];
    this.bestellnummer = bestellnummer; }



    
    public void einfuegen (int artikelnummer, String artikelname) {
    Artikel neuerArtikel = new Artikel (artikelnummer, artikelname);
    for (Artikel element: artikel) {
    if (element==null) { element = neuerArtikel; return; }
    }
    }}
