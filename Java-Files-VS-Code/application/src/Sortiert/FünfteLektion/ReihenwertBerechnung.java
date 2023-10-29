package Sortiert.FünfteLektion;

public class ReihenwertBerechnung 
{
public static void main (String[]args) {
int nenner = 1;
// double berechnung = 6* (1/nenner);
double berechnung;
double zwischenergebnis = 0;
do {
berechnung = 6* (1.0/nenner);  //Auf das .0 achten, sonst macht es eine Integer division -->falsche ergebnis

zwischenergebnis = zwischenergebnis + berechnung;

nenner++;

}
while (berechnung> 10E-5);





System.out.println(zwischenergebnis);



//Aufgabe: c       gerade konvertiert bei ... -->Zusammenlaufen -->Ein bissle ungenau. D.h wenn der Multiplikator vor der Zahl kleiner ist dann konvertiert schon früher. 
// also bspw. mit 6* -->83.29   mit 1* -->12.00






}    
}
