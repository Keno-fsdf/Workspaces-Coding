package Sortiert.NeuesKlausurübungsaufgaben;

public class KommaEntfernen {

public static int dezimalZuGeld (double geldbetrag) //1,99 zu 199
{

String text = String.valueOf(geldbetrag);
String zwischenergebnis = "";
char [] array = text.toCharArray();
for (char element:array) {
if (element!='.') {
zwischenergebnis+=element;}

}

int ergebnis = Integer.valueOf(zwischenergebnis);
return ergebnis+1;
}



    public static void main(String[] args) {
        // Testdaten
        double geldbetrag = 1.99;

        // Aufruf der Methode
        int ergebnis = dezimalZuGeld(geldbetrag);

        // Ausgabe des Ergebnisses
        System.out.println("Ergebnis: " + ergebnis);
    }   
}
