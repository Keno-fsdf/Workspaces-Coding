package Sortiert.KlausuraufgabenÜbung;

public class Factoriel {
    public static int calculateFactorial(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = 5; // Replace 5 with the desired value of n
        int result = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
