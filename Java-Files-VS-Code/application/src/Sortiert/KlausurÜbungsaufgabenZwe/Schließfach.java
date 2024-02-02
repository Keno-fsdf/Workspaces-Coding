package Sortiert.KlausurÜbungsaufgabenZwe;

public class Schließfach {

private boolean offen;
private int nummer;

public Schließfach(int nummer) {
this.nummer = nummer; }




public boolean getOffen() {
return offen; }

public int getNummer() {
return nummer; }

public void setOffen(boolean offen) {
this.offen = offen; }

public void setNumemr(int nummer) {
this.nummer = nummer; }



@Override

public String toString() {
if (offen){
return "o";
}
return "z";
}
public static void main(String[] args) {
    // Erstelle ein Schließfach mit der Nummer 123
    Schließfach schließfach = new Schließfach(123);

    // Überprüfe den Anfangszustand
    System.out.println("Schließfachnummer: " + schließfach.getNummer());
    System.out.println("Ist das Schließfach offen? " + schließfach.getOffen());
    System.out.println("Schließfachzustand: " + schließfach);

    // Ändere den Zustand des Schließfachs
    schließfach.setOffen(true);
    schließfach.setNumemr(456); // Hier sollte es "setNummer" sein, nicht "setNumemr"

    // Überprüfe den geänderten Zustand
    System.out.println("Neue Schließfachnummer: " + schließfach.getNummer());
    System.out.println("Ist das Schließfach jetzt offen? " + schließfach.getOffen());
    System.out.println("Aktueller Schließfachzustand: " + schließfach); }




}

