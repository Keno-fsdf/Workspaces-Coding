package Sortiert.NeuesKlausurübungsaufgaben;

public class Zielort {
    private String name;
    private int distanz;
    private Zielort nachfolger;
    
    public Zielort (String name, int distanz) {
    this.name = name;
    this.distanz = distanz; }
    
    public String getName () {
    return this.name; }

   

    public int getDistanz () {
    return this.distanz; }
    
    public void setName (String name) { this.name = name; }
    public void setDistanz (int distanz) {
    this.distanz = distanz;}
    
    public Zielort getNachfolger () {
    return this.nachfolger; }


    public void setNachfolger (Zielort nachfolger) {
    this.nachfolger = nachfolger; }
    
    public String toString() {
    return "Ortsname: " + name + " Distanz: " + distanz + " km"; } }
