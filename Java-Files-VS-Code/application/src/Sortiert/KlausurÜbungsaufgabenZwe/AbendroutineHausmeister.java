package Sortiert.KlausurÜbungsaufgabenZwe;

public class AbendroutineHausmeister {
    public static void main(String[] args) {
        Schließfach[] schliefaecher = new Schließfach[100];
        int zeahler = 1;

        for (int i = 0; i < 100; i++) {
            schliefaecher[i] = new Schließfach(i);
            // Schließfächer sind automatisch auf "false" also auf geschlossen gesetzt
        }




        

        boolean schalter = false;
        for (int j = 0; j < 100; j++) {
            if (j == 0) {
                for (int n = 0; n < 100; n++) {
                    schliefaecher[n].setOffen(true);
                }
            } else if (j == 99) {
                schliefaecher[99].setOffen(schalter);
            } else {
                for (int z = j; z < 100; z += j) {
                    schliefaecher[z].setOffen(schalter);
                }
                zeahler++;
                schalter = !schalter; // Use the logical NOT operator for toggling the switch
            }
            //   
            for (Schließfach elemente: schliefaecher) {
                    System.out.print(elemente);

                }


        }

    }
}
