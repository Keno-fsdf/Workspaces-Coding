package Sortiert.KlausuraufgabenÜbung;

public class harmonischeReihe {
    public static void main(String[] args) {
        
        double temp = 0;
        for (int k =1; k<=10000; k++) {
            double berechnung = (berechnePotenzen(-1, k+1))/k;
            temp = temp+berechnung;
        }
        System.out.println(temp);


        int a = 0;
        int b = 3;

        if (a<=b) System.out.println();
        if (a>=b)System.out.println();
    }


    public static double berechnePotenzen (double basis, int potenz) {
        double result = 1;
        while (potenz>0) {
            result = result*basis;
            potenz--;
        }
        return result;

    }
    
}
