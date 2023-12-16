package Sortiert.KlausuraufgabenÜbung;

public class Fahrtstrecke {

    Zielort head;

    public Fahrtstrecke() {}


    public void einfuegen(String name, int distanz ) {
        Zielort neuerOrt = new Zielort(name, distanz);
        if (head==null) {
            head = neuerOrt;

        }

        else {
            Zielort current = head;
            while (current.getNachfolger()!=null) {
                current = current.getNachfolger();

            }
            current.setNachfolger(neuerOrt); 


        }


    }

    public int gesamteStrecke () {
        int gesamteStrecke = 0;
        Zielort current = head;  //könnte zu einer nullpointer exceptin führen

        while (current!=null) {
            
            gesamteStrecke= gesamteStrecke + current.getDistanz();
            current = current.getNachfolger();
        }

        return gesamteStrecke;


    }


    public static void main (String[]args) {
        Fahrtstrecke streckeNürnburg = new Fahrtstrecke();
        streckeNürnburg.einfuegen("Würzbug", 0);
        streckeNürnburg.einfuegen("Kitzingen", 19);
        streckeNürnburg.einfuegen("Neustadt", 42);
        streckeNürnburg.einfuegen("Nürnberg", 49);
        int gesameStrecke = streckeNürnburg.gesamteStrecke();
        System.out.println("Die gesamte Strecke von Würzburg nach Nürnburg ist: " + gesameStrecke + "km");

    }
    
}
