package Sortiert.NeuesKlausurübungsaufgaben;

public class Sitzplatzreservierung {
    public static char[][] erstelleSaal(int reihen) {
        char[][] array = new char[reihen][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new char[i + 3];
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Neue Zeile für jede Reihe
        }

        return array;
    }

    public static void fuelleSitze(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = fifty();
            }
        }
    }

    public static char fifty() {
        if (Math.random() < 0.5) return 'o';
        return 'x';
    }

    public static void bucheSitz(char[][] array, int reihe, int spalte) {
        if (array[reihe][spalte] == 'x') {
            System.out.println("belegt");
            return;
        } else {
            array[reihe][spalte] = 'x';
        }
    }

    public static void darstellen(char[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Neue Zeile für jede Zeile
        }
    }

    public static void main(String[] args) {
        char[][] saal = erstelleSaal(3);
        fuelleSitze(saal);
        bucheSitz(saal, 2, 1); // Änderte dies zu einer existierenden Position
        darstellen(saal);
    }
}
