package Sortiert.KlausuraufgabenÜbung.Online_Shop;

public class Kunde {
    private Bestellung[] bestellungen = new Bestellung[50];

    public Bestellung sucheArtikelInBestellungen(String artikelname) {
        for (Bestellung bestellung : bestellungen) {
            if (bestellung != null) {
                Artikel[] artikelListe = bestellung.artikelListe;
                for (Artikel artikel : artikelListe) {
                    if (artikel != null && artikel.getArtikelname().equals(artikelname)) {
                        return bestellung;
                    }
                }
            }
        }
        return null; // Wenn der Artikel nicht gefunden wurde
    }
}
 
