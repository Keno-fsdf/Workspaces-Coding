package Sortiert.NeuesKlausurübungsaufgaben;

public class Vielfach {
    
    public static void main(String[] args) {
        // Test der vielfache-Methode
        int[] testArray = {2, -6, 0, 9, -12, 5, 18};

        int result = vielfache(testArray);

        System.out.println("Anzahl der Vielfachen von 3 im Array: " + result);
    }

    public static int vielfache ( int [] array) { int ergebnis = 0;
        for (int element: array) {
        if (element<0) {element = -1*element;}
        // if (element==0) continue;
        if (element%3 == 0) ergebnis++;
        }
        return ergebnis; }
}
