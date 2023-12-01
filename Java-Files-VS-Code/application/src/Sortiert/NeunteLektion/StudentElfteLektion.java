package Sortiert.NeunteLektion;

public class StudentElfteLektion {
    private String firstName;
    private String lastName;
    private int Matrikelnummer;
    private boolean handUp;

    public StudentElfteLektion(String firstName, String lastName, int Matrikelnummer) {
        this.Matrikelnummer = Matrikelnummer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.handUp = false; // Hand ist zu Beginn unten
    }


    public String getFirstName() {
        return this.firstName;
    }
    public int getMatrikelnummer() {

        return this.Matrikelnummer;
    }

    // Getter und Setter für das Attribut handUp
    public boolean isHandUp() {
        return handUp;
    }

    public void setHandUp(boolean handUp) {
        this.handUp = handUp;
    }
}
