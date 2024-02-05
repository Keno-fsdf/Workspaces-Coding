package Sortiert.NeuesKlausurübungsaufgaben;

public class random {
    public static void main(String[] args) {
        int kleinsteZahl = Integer.MAX_VALUE; // Anfangswert auf den maximalen Double-Wert setzen
        int größteZahl = Integer.MIN_VALUE; // Anfangswert auf den minimalen Double-Wert setzen

        for (int i = 0; i <= 10000000; i++) {
            // int a = (int) (Math.random()*8 +1);
            int a = randomNumber();

            
            // Vergleich mit kleinster Zahl
            if (a < kleinsteZahl) {
                kleinsteZahl = a;
            }
            
            // Vergleich mit größter Zahl
            if (a > größteZahl) {
                größteZahl = a;
            }
        }

        System.out.println("Kleinste Zahl: " + kleinsteZahl + "\n" + "Größte Zahl: " + größteZahl);
    }



    public static int randomNumber() {
        return (int) (43+ Math.random()*6); }
}
