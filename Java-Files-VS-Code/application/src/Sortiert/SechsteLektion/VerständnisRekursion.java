package Sortiert.SechsteLektion;

public class VerständnisRekursion {
    public static void main (String[]args) {
        System.out.println(summe(3)); // 3 + 2 +1 = 6

    }


    public static int summe (int zahl)
    {

        if (zahl ==0) return 0;
        return zahl + summe(zahl-1);
        


    }

    
}
