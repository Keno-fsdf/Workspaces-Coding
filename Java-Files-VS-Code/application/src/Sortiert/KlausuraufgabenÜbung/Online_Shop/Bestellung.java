package Sortiert.KlausuraufgabenÜbung.Online_Shop;

public class Bestellung {
     int bestellnummer;
     Artikel[] artikelListe; // Array für Artikel

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        this.artikelListe = new Artikel[50];
    }
   

    public void einfuegen(Artikel neuerArtikel) {
        for (int i = 0; i < artikelListe.length; i++) {
            if (artikelListe[i] == null) {
                artikelListe[i] = neuerArtikel;
                break;
            }
        }
    }
}
