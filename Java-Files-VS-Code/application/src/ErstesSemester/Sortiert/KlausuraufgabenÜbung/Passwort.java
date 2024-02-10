package Sortiert.KlausuraufgabenÜbung;
// Klasse = Passwort -->Soll eine Passowrt verwalten
// -->Methode alsPWgeeignet -->String nehmen, boolean rückgabe

// String in eine charArray umwandeln -->Dadurch hat man es einfacher

// mit int a überprüfen, ob es schon mehrermals vorkommen ist
// lieber int anstatt boolean machen
// 1. Länge prüfen
// 2. mit boolean überprüfen, ob ein Buchstgaben kelin ist. 
// 3. mit boolean überprüfen, ob ein Buchstabe gorß ist.
// 4. mit boolean überprüfen, ob eine Ziffer drin ist.

// Konstruktor




public class Passwort {

public static void main(String[] args) {
    Passwort passwort = new Passwort("KenoKaka12");
    System.out.println(passwort);
    System.out.println(passwort.pwAendern("HallKfsdfsaka22"));
    System.out.println(passwort);
}


String zeichenkette;

public Passwort (String zeichenkette)
{ if (alsPWgeeingnet(zeichenkette)==true) this.zeichenkette = zeichenkette;
else this.zeichenkette = null;
}

@Override
public String toString() {
if (zeichenkette == null) return "Kein gueltiges Passwort!";
String ergebnis = "";
char[] array = zeichenkette.toCharArray();
for (int i = 0; i<array.length; i++) {
array[i] = '*';
ergebnis += array[i];

}

return ergebnis;
} 



public boolean pwAendern(String neuesPasswort) {
if (this.zeichenkette==null) return false;
if (alsPWgeeingnet(neuesPasswort)==false) return false;

char[] neueArray = neuesPasswort.toCharArray();
char [] alteArray = this.zeichenkette.toCharArray();
if (alteArray.length==0) return false;

boolean ersteZeichenGleich = false;
// boolean letzenZeichenGleich = false;
boolean letzenZeichenGleich = neueArray[neueArray.length - 1] == alteArray[alteArray.length - 1];
if (neueArray[0] ==alteArray[0]) ersteZeichenGleich = true;
// if (neueArray[neueArray.length-1] == alteArray[alteArray.length-1]) letzenZeichenGleich = true; 

if (ersteZeichenGleich || letzenZeichenGleich) return false;
this.zeichenkette = neuesPasswort;

return true;
  



}


public boolean alsPWgeeingnet(String zeichenkette) {
char [] string = zeichenkette.toCharArray();
if (string.length<8) return false;
int kleinBuchstaben = 0;
int großBuchstaben = 0;
int ziffer = 0;

for (int i = 0; i<string.length; i++) {
if (string[i]>='a' && string[i]<='z') kleinBuchstaben++;
if (string[i]>='A' && string[i]<='Z') großBuchstaben++;
if (string[i]>='0' && string[i]<='9') ziffer++;
}
if (kleinBuchstaben>=2 && großBuchstaben>=2 && ziffer>=2) return true;
return false;
}





}





