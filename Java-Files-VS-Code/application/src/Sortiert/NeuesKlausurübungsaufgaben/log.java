package Sortiert.NeuesKlausurübungsaufgaben;

public class log {
    public static double logs (double x) {
        if (x<0 || x>=2) {
        
        throw new RuntimeException();}
        double ergebnis = 0;
        double zwischenergebnis = 1;
        double tolerance = 1e-16;
        for (int n = 1; zwischenergebnis >tolerance || zwischenergebnis<-tolerance; n++) {
        zwischenergebnis = pow(-1,n+1)/n *pow (x-1,n);
        ergebnis +=zwischenergebnis;
        
        
        
        }
        return ergebnis; 
        
        
     
        
    
        
        }

        public static double pow (double basis, int potenz) {
            double ergebnis = 1;
            while (potenz>0) {
            ergebnis*=basis;
            potenz--; }
            return ergebnis;
            
            }


            public static void main(String[] args) {
                double x = 1.6; // Beispielwert, Sie können einen anderen Wert wählen
                try {
                    double lnValue = logs(x);
                    System.out.println("ln(" + x + ") = " + lnValue);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
        }
        }



