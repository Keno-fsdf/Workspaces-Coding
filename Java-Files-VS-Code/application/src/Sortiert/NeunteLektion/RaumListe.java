package Sortiert.NeunteLektion;

public class RaumListe {

    public static void main(String[] args) {
    Raum ersterRaum = new Raum("1.2.1", 55);
    
    Raum zweiterRaum = new Raum("1.2.15", 88);


    System.out.println("Ist der erste Raum belegt? ");
    System.out.print(ersterRaum.istBelegt()+ "\n");
    
    System.out.println("Ist der zweite Raum belegt? ");
    System.out.print(zweiterRaum.istBelegt()+ "\n");


    ersterRaum.belegungRaum(); //Belegung der ersten Raums
    
    System.out.println("Ist der erste Raum belegt? ");
    System.out.print(ersterRaum.istBelegt()+ "\n");
    
    System.out.println("Ist der zweite Raum belegt? ");
    System.out.print(zweiterRaum.istBelegt()+ "\n"); 


    }


}
