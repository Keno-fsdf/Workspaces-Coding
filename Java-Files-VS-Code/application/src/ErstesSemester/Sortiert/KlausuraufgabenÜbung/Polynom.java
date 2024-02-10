package Sortiert.KlausuraufgabenÜbung;

public class Polynom {
    double    xHoch3;
    double xHoch2;
    double xHoch1;
    double d;
    
    public Polynom(double xHoch3, double xHoch2, double xHoch1 , double d) {
        this.xHoch3 = xHoch3;
        this.xHoch2 = xHoch2;
        this.xHoch1 = xHoch1;
        this.d = d;


    }


    public double berechenAnDerSTelleX (int x) {
        double ergebnis = xHoch3*x+ xHoch2*x + xHoch1*x + d;
        return ergebnis;

    }


    public Polynom leiteAb() {
       double neuesXHoch2 = xHoch3*3;
       double neuesXHoch1 = xHoch2*2;
       double neuesd = xHoch1;
       Polynom abgeleitet = new Polynom(neuesXHoch2,  neuesXHoch1, neuesd, 0);
       return abgeleitet; 

    }
    @Override
    public String toString() {

        return xHoch3 +"x^3" + xHoch2 + " + x^2" + " + x + " + d;  
    }

    public static void main(String[] args) {
        Polynom neuesPolynom = new Polynom( 1.5, 4, 1.3, -8);

    }


    
    
}
