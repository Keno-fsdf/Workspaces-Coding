package Sortiert.NeuesKlausurübungsaufgaben;


public class Tuer {
    private int nummer;
    private boolean offen;
    
    public Tuer (int nummer) {
    this.nummer = nummer;}
    
    public String toString() {
    if (offen) return "o";
    else return "z"; }
    
    
    public int getNummer() { return nummer; }
    
    public boolean getOffen() { return offen; }
    
    public void setNummer (int nummer) {this.nummer = nummer;}
    public void setOffen (boolean offen) {
    this.offen = offen;}
    
    
    
    public static void main (String[] args) {
    
    Tuer[] array = new Tuer[100];
    
    for (int i = 1; i<=100; i++) {
    Tuer neueTuer = new Tuer(i);
    array [i-1] = neueTuer;}
    
    for (int k =1; k<=100; k++) {
    String a = "";
    for (int j = 1; j<=100; j++) {
    if (k==1) {
    array[j-1].setOffen(true);}
    
    else if (k==100) { array[j-1].setOffen(!(array[j-1].getOffen()));}
    
    else if (j%k==0) { array[j-1].setOffen(!(array[j-1].getOffen()));}
    
    if (array[j-1].getOffen()) a+="o";
    else a+="z";

    }
    System.out.println(a);
    }
}}
