package Sortiert.ElfteLektion;

public class Ticker {
    int größe;
    char[] nachricht;
    public Ticker (int größe) {
        
        this.größe = größe;
        if (größe<1) this.nachricht = new char[200];
        else this.nachricht = new char[größe];
        fülleMitLeerzeichen(this.nachricht);

    }



    public char[] getNachricht() {
        return this.nachricht;

    }



    public void rotateNachricht(int distance) {
        String zwischenspeicher = "";




        //Ich mach bascically einen neuen String den ich dann einfach in eine Array umwandeln

        //Die letzteren Buchstaben bzw. alle Buchstaben ab Distance werden VORNE beim String hinzugefügt
        for (int j = distance; j<this.nachricht.length; j++) {
            zwischenspeicher+=this.nachricht[j];
        }

      //Die ersten Buchtaben bis distance werden hinten beim String hinzugefügt


        for (int i = 0; i<distance; i++) {
            zwischenspeicher+=this.nachricht[i];
        }




        this.nachricht = zwischenspeicher.toCharArray();

          System.out.println(zwischenspeicher);

        // this.nachricht[1] = 5;

    }


    private static void fülleMitLeerzeichen (char[] array) {
        for(int i = 0; i<array.length; i++) {
            array[i] = 32;

        }

    }


    public int getGroesse() {
        return this.größe;

    }



    public void resetNachricht (char zeichen) {
        for (int i = 0; i<this.nachricht.length;i++) {
            this.nachricht[i] = zeichen;
        }

    }

    public void resetNachricht () {
        for (int i = 0; i<this.nachricht.length;i++) {
            this.nachricht[i] = 43;
        }

    }

    public void setNachricht(char[]nachricht) {
        
        for (int i = 0; i<nachricht.length; i++) {
            if (i+1>this.nachricht.length) break;

            this.nachricht[i] = nachricht[i];

        }

        for (int j = 0; j<this.nachricht.length; j++) {
            if (this.nachricht[j]==32) { this.nachricht[j] =43; }
        }   

        // this.nachricht[]

    }


    
}
