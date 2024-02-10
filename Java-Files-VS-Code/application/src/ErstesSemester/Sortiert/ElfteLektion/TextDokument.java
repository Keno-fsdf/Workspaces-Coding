package Sortiert.ElfteLektion;

public class TextDokument {
    char[][] Dokument;
    int Zeilen;
    int Spalten;

    public TextDokument(int Zeilen, int Spalten) {
        this.Zeilen = Zeilen;
        this.Spalten = Spalten;
        this.Dokument = new char[Zeilen][Spalten];
    }

   

    public  int zaehleZeichen(char[][]dokument) {
        int zeahler = 0;

        for (int i = 0; i<dokument.length;i++) {
            for (int j = 0; j<dokument[i].length; j++) {
                try {
                    if (dokument[i][j]!=32) {
                    zeahler++;
                } 
                } catch (Exception e) {
                    
                }

            }

        }


        return zeahler;

    }

    public boolean vertauscheZeilen (int ersteZeile, int zweiteZeile) {
            if (ersteZeile>=Dokument.length|| zweiteZeile>=Dokument.length) return false;
            // char[] temp = {};  //  new char[Dokument[ersteZeile].length] -->Müssen noch fallunterschiedung machen, welche von beiden zeilen länger ist.

            //Tausch der Zeilen
            char[] temp = {};   //new char[Dokument[ersteZeile].length];
            temp = Dokument[ersteZeile];
            Dokument[ersteZeile] = Dokument[zweiteZeile];
            Dokument[zweiteZeile] = temp;

        
            return true;
    }




    public void fuegeEinDokument(char[][] eingefuegtesDokument, int zeilenangabe) throws RuntimeException {
        if (zeilenangabe < 0 || zeilenangabe + eingefuegtesDokument.length > this.Dokument.length) {
            throw new RuntimeException("Ungültige Zeilenposition aufgrund einer zu hohen Zeilenangabe und/oder eines zu großen eingefügten Dokuments");
        }
    
        for (int i = 0; i < eingefuegtesDokument.length; i++) {
            for (int j = 0; j < eingefuegtesDokument[i].length; j++) {
                this.Dokument[zeilenangabe + i][j] = eingefuegtesDokument[i][j];
            }
        }
    }







    public static void main(String[] args) {
        String ersteZeile = "Hallo jeder";
        String zweiteZeile = "b b";
        String dritteZeile = "c";
        String leereZeile = "";
        char[][] dokument = {ersteZeile.toCharArray(), zweiteZeile.toCharArray(), dritteZeile.toCharArray(), leereZeile.toCharArray()}; //Das ist jetzt sozusagen mein Dokument
        // System.out.println(zaehleZeichen(dokument));

        //Spalten ist das gleiche wie die Länge der einzelenen Zeilen
        TextDokument erstesDokument = new TextDokument(5, 11);
        erstesDokument.fuegeEinDokument(dokument, 2);
        erstesDokument.vertauscheZeilen(0, 2);
        

        char[][] array = erstesDokument.Dokument;

        int i = 0;

        for (char[] cs : array) {
            
            System.out.println(i + " Zeile:");
            for (char b: cs) {
                System.out.print(b + " ");
            }
            i++;
            System.out.println("\n");
            
            
        }





    }


}
