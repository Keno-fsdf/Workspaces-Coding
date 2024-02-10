package Sortiert.NeuesKlausurübungsaufgaben;

public class Fahrstrecke  {
    Zielort head;
    public Fahrstrecke () {}
    public void einfuegen (String name, int distanz) {
    Zielort neuerOrt = new Zielort (name, distanz) ;
    if (head==null) {
    head= neuerOrt;
    }
    else {
    Zielort current = head;
    while (current.getNachfolger()!= null) {
    current = current.getNachfolger(); }
    current.setNachfolger(neuerOrt); }}
    
    
    
    public int gesamtStrecke() {
    int summe = 0;
    if (head==null) return summe;
    Zielort current = head;
    while (current!=null) {
    summe+=current.getDistanz();
    current = current.getNachfolger(); }
    return summe; }
    
    public static void main (String [] args) {
    
    
    Fahrstrecke strecke = new Fahrstrecke ();

    strecke.einfuegen ("wuerzburg", 0);
     strecke.einfuegen ("kitzingen", 19);
    strecke.einfuegen("neustadt", 42) ; strecke.einfuegen ("wuerzburg", 49);

    
    int summe = strecke.gesamtStrecke();
    System.out.println ("Die gesamte Strecke beträgt: " + summe + "km" );
}}
