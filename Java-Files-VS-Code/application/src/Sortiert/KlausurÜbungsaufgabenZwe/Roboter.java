package Sortiert.KlausurÜbungsaufgabenZwe;

public class Roboter {
    private String name;
    private int größe; //Annahme in "cm"
    private Roboter nachfolger;

    public Roboter(String name, int größe) {
        this.name = name;
        this.größe = größe;
        this.nachfolger =null;


    }

    public String getName() {

        return this.name;
    }

    public int getGroeße () {
        return this.größe;
    }

    public Roboter getNachfolger() {
        return this.nachfolger;
    }

    public void setName (String name) {

        this.name = name;
    }
    public void setGroeße(int groeße) {

        this.größe = groeße;
    }

    public void setNachfolger(Roboter nachfolger) {
        this.nachfolger = nachfolger;

    }

    @Override

    public String toString() {
        return "Hallo ich bin der " + name + ", ich bin " + größe + "cm groß";

    }
    
}
