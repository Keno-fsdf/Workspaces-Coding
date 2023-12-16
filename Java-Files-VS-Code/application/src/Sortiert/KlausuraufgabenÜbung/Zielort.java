package Sortiert.KlausuraufgabenÜbung;

public class Zielort {

private String name;
private int distanz;
private Zielort next;


public Zielort (String name, int distanz) {

this.name = name;
this.distanz = distanz;
this.next = null;



}

public String getName() {
    return this.name;


}
public int getDistanz() {

    return this.distanz;

}
 public void setNachfolger(Zielort next) {
        this.next = next;
    }

public Zielort getNachfolger() {
    return next;

}

public void setName (String name) {
    this.name = name;

}

public void setDistanz(int distanz) {

    this.distanz = distanz;
}
@Override
public String toString() {

    return "Ortsname: " + name + " Distanz: " + distanz + " km";
}

    
}
