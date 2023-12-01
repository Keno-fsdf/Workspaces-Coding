package Sortiert.ElfteLektion;

public class AlternativLösung {
    private char[][] text;

    // Konstruktor für die Initialisierung des Textdokuments
    public AlternativLösung(int zeilen, int spalten) {
        text = new char[zeilen][spalten];
    }

    // Methode zur Zählung der Zeichen im Textdokument (ohne Leerzeichen)
    public int zaehleZeichen() {
        int anzahlZeichen = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != null) {
                for (int j = 0; j < text[i].length; j++) {
                    if (text[i][j] != ' ') {
                        anzahlZeichen++;
                    }
                }
            }
        }
        return anzahlZeichen;
    }

    // Methode zum Vertauschen von zwei Zeilen im Textdokument
    public boolean vertauscheZeilen(int zeile1, int zeile2) {
        if (zeile1 >= 0 && zeile1 < text.length && zeile2 >= 0 && zeile2 < text.length) {
            char[] temp = text[zeile1];
            text[zeile1] = text[zeile2];
            text[zeile2] = temp;
            return true;
        } else {
            return false;
        }
    }

    // Methode zum Einfügen eines Textdokuments an einer bestimmten Zeilenposition
    public void fuegeEinTextdokument(char[][] einzufuegendesDokument, int zeilenposition) {
        if (zeilenposition >= 0 && zeilenposition <= text.length) {
            if (einzufuegendesDokument != null) {
                for (int i = 0; i < einzufuegendesDokument.length; i++) {
                    if (zeilenposition + i < text.length) {
                        text[zeilenposition + i] = einzufuegendesDokument[i];
                    } else {
                        break; // Einfügen abbrechen, wenn außerhalb des Textdokuments
                    }
                }
            } else {
                throw new RuntimeException("Ungültiges einzufügendes Textdokument");
            }
        } else {
            throw new RuntimeException("Ungültige Zeilenposition");
        }
    }

    // Beispiel für die Verwendung
    public static void main(String[] args) {
        AlternativLösung textdokument = new AlternativLösung(3, 5);

        // Beispiel für das Einfügen eines Textdokuments
        char[][] einzufuegendesDokument = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        textdokument.fuegeEinTextdokument(einzufuegendesDokument, 1);

        // Beispiel für das Vertauschen von zwei Zeilen
        textdokument.vertauscheZeilen(0, 2);


        for (char[] cs : einzufuegendesDokument) {
            
        }

    }
}

