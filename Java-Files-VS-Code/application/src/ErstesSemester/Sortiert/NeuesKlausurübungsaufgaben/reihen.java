package Sortiert.NeuesKlausurübungsaufgaben;

public class reihen {

    public static double reiheH() {
        double zwischenergebnis = 0;
        double ergebnis = 0;
        
        
        for (int k = 1; k<=10000; k++) {
        zwischenergebnis = pow(-1, k+1) /k;
        ergebnis+=zwischenergebnis;}
        
        return ergebnis;
        
        
    }

        public static double pow (double basis, int potenz) {
        
        double ergebnis = 1;
        
        while (potenz>0) { 
        ergebnis*=basis; potenz--; }
        
        return ergebnis;
     }
            
        
}
