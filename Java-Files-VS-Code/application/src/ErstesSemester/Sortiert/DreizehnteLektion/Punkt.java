package Sortiert.DreizehnteLektion;

public class Punkt {

    double x;
    double y;
    double z;

    public Punkt(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double berechneAbstand() {
        double zwischenergbnis = x*x + y*y+ z*z;
        double ergebnis = Math.sqrt(zwischenergbnis);

        return ergebnis;


    }
    public String toString() {
        return "x=" + x + ", y =" + y + ", z=" + z;
    }








    public static void main(String[] args) {
        Punkt punkt = new Punkt(3, 5, 6);
        double abstand = punkt.berechneAbstand();
        System.out.println(abstand);

        System.out.println(punkt);
    }

    
}
