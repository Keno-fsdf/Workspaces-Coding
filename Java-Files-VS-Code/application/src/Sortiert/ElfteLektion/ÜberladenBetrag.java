package Sortiert.ElfteLektion;

public class ÜberladenBetrag {
    


    public static void main(String[] args) {
        // long a = betrag(9223372036854775807);
        System.out.println(betrag((short) 55));
        
    }


    private static int betrag (int zahl) {
        if (zahl<0) return -zahl;
        return zahl;

    }

        private static double betrag (double zahl) {
        if (zahl<0) return -zahl;
        return zahl;

    }
        private static short betrag (short zahl) {
        if (zahl<0) return (short) -zahl;
        return zahl;

    }

        private static long betrag (long zahl) {
        if (zahl<0) return -zahl;
        return zahl;

    }
    





}
