package Sortiert.ElfteLektion;

import java.util.Random;

public class ThreeDTicTacToe {
    public static void main(String[] args) {
        // Dimensionen des Tic-Tac-Toe-Feldes
        int size = 3;

        // Initialisiere das 3D-Tic-Tac-Toe-Feld
        boolean[][][] ticTacToeField = initializeTicTacToeField(size);

        // Zeige das Tic-Tac-Toe-Feld an
        displayTicTacToeField(ticTacToeField);
    }

    // Initialisiert ein 3D-Tic-Tac-Toe-Feld mit zufälligen true/false-Werten
    private static boolean[][][] initializeTicTacToeField(int size) {
        boolean[][][] field = new boolean[size][size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    // Zufällig true oder false setzen
                    field[i][j][k] = random.nextBoolean();
                }
            }
        }

        return field;
    }

    // Zeigt das Tic-Tac-Toe-Feld an
    private static void displayTicTacToeField(boolean[][][] field) {
        System.out.println("3D Tic-Tac-Toe Field:");

        for (int i = 0; i < field.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < field[i].length; j++) {
                for (int k = 0; k < field[i][j].length; k++) {
                    // Ausgabe von 'x' für true und 'o' für false
                    System.out.print(field[i][j][k] ? "x " : "o ");
                }
                System.out.println();
            }

            System.out.println();
        }}
}
