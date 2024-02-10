package Sortiert.KlausuraufgabenÜbung.Online_Shop;

public class Artikel {
    private int artikelnummer;
    private String artikelname;

    public Artikel(int artikelnummer, String artikelname) {
        this.artikelnummer = artikelnummer;
        this.artikelname = artikelname;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public String getArtikelname() {
        return artikelname;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    // Methode zum Löschen eines Artikels (du musst die Implementierung hinzufügen)
    public void loescheArtikel(int artikelnummer) {
        // Implementiere die Logik zum Löschen eines Artikels
    }
}




