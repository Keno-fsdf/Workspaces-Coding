package Sortiert.Leetcode;

public class Potenz {
    public static void main(String[] args) {
        System.out.println(potenzieren(5, 8));
    }

    public static int potenzieren(int basis, int potenz) {
        int ergebnis = 0;
        
        boolean ersteRechnung = true;
        
        for (int i = 0; i<potenz; i++) {
        
        if (ersteRechnung==true) {
            ergebnis = basis*basis;  i++; ersteRechnung=false;
        }
        else ergebnis = ergebnis*basis;
        
        }
        return ergebnis;
        
        
        }

    
}
