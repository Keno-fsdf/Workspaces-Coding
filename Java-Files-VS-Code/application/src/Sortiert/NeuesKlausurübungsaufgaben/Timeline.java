package Sortiert.NeuesKlausurübungsaufgaben;

public class Timeline { 
    Post neuesterPost; //head
    public void fuegePostEin (String text, String absender, String empfänger) { Post neuerPost = new Post (text, absender, empfänger) ;
    neuerPost.next = neuesterPost;
    neuesterPost = neuerPost; }
    
    public void gibAus () {
    // if (neuesterPost==null) return;
    Post current = neuesterPost;
    while (current!=null) {
    System.out.println (current.absender + " -> " + current.empfänger + "\n" + current.text + "\n");
    current = current.next; }}
    
    public static void main (String [] args) {
    Timeline timeline = new Timeline ();
    timeline.fuegePostEin("Gutes neues Jahr", "Alice", "Bob");
    timeline.fuegePostEin("Danke! Guten Rutsch ins neue Jahr!", "Bob", "Alice");
    timeline.fuegePostEin ("Frohe Weihnachten!", "Alice", "Bob");
    timeline.gibAus();
     }}
