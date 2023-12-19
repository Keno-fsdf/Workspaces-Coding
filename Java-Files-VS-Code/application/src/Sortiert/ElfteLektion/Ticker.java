package Sortiert.ElfteLektion;

public class Ticker {
    int größe;
    char[] nachricht;

    public Ticker(int größe) {
        this.größe = größe;
        if (größe < 1) {
            this.nachricht = new char[200];
        } else {
            this.nachricht = new char[größe];
        }
        fillWithSpaces(this.nachricht);
    }

    public char[] getNachricht() {
        return this.nachricht;
    }

    public void rotateNachricht(int distance) {
        char[] zwischenspeicher = new char[this.nachricht.length];

        // Copy characters from 'distance' to the end
        for (int j = distance, k = 0; j < this.nachricht.length; j++, k++) {
            zwischenspeicher[k] = this.nachricht[j];
        }

        // Copy characters from the beginning up to 'distance'
        for (int i = 0, k = this.nachricht.length - distance; i < distance; i++, k++) {
            zwischenspeicher[k] = this.nachricht[i];
        }

        this.nachricht = zwischenspeicher;
    }

    private static void fillWithSpaces(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 32;
        }
    }

    public int getGroesse() {
        return this.größe;
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = zeichen;
        }
    }

    public void resetNachricht() {
        resetNachricht((char) 43);
    }

    public void setNachricht(char[] nachricht) {
        for (int i = 0; i < nachricht.length && i < this.nachricht.length; i++) {
            this.nachricht[i] = nachricht[i];
        }

        for (int j = 0; j < this.nachricht.length; j++) {
            if (this.nachricht[j] == 32) {
                this.nachricht[j] = 43;
            }
        }
        replaceUnnecessaryPlusSigns(this.nachricht);
    }

    public static void replaceUnnecessaryPlusSigns(char[] zeichenArray) {
        for (int i = 1; i < zeichenArray.length - 1; i++) {
            if (zeichenArray[i] == '+' && zeichenArray[i - 1] != '+' && zeichenArray[i + 1] != '+') {
                zeichenArray[i] = ' ';
            }
        }
    }
}
