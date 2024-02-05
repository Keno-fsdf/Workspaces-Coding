package Sortiert.NeuesKlausurübungsaufgaben;

public class Passwort {
    public boolean alsPWgeeignet (String eingabe) {
    char [] array = eingabe.toCharArray();
    
    int leange = 0;
    int gB = 0;
    int kB = 0;
    int ziffer = 0;
    for (char element: array ) {
    if (element >= '0' && element<= '9') ziffer++;
    if (element>='a' && element <='z') kB++;
    if (element>='A' && element<= 'Z') gB++;
    leange++; }
    
    if (leange>=8 && gB>=2 && kB>=2 && ziffer>=2) return true; 
    return false;
    
    }
    
    String passwort;
    public Passwort (String passwort) {
    if (alsPWgeeignet(passwort)) {
    this.passwort = passwort; return; }
    this.passwort =null; }
    
    public String toString() {
    if (passwort ==null) return "Kein gueltiges Passwort!";
    String ergebnis = "";
    char [] zweitesArray = passwort.toCharArray();
    for (int i = 0; i<zweitesArray.length; i++) {
    ergebnis+="*"; }
    return ergebnis; }
    
    public boolean pwAendern (String neuesPW) {
    if (this.passwort ==null) return false;
    int indexLetzter = neuesPW.length()-1;
    int indexLetzterAlt = passwort.length()-1;
    if (neuesPW.charAt(0)!=passwort.charAt(0) && neuesPW.charAt (indexLetzter) !=passwort.charAt(indexLetzterAlt)) { passwort = neuesPW; return true; } return false; }



}
