package Sortiert.AuswendigCodePrüfung;

public class Potenz {
    public static double berechnePotenzen (double basis, int potenz) {
        double result = 1;
        while (potenz>0) {
            result*=basis;
            potenz--;
        }
        return result;

    }


    public static double potenz(double basis, int potenz)  {
        double ergebnis = 1;
        while (potenz>0) {
        ergebnis*=basis;
        potenz--;
        }
        return ergebnis;}




        public static double potenz3(double basis, int potenz){
            double ergebnis = 1;
            while (potenz>0) {
            ergebnis*=basis;
            potenz--;
            }
            return ergebnis;}
            





        public static void main(String[] args) {
            // Test 1: Potenz von 2^3 sollte 8 sein
            double basis1 = 2;
            int potenz1 = 3;
            double ergebnis1 = potenz3(basis1, potenz1);
            System.out.println(basis1 + " hoch " + potenz1 + " = " + ergebnis1);
    
            // Test 2: Potenz von 5^2 sollte 25 sein
            double basis2 = 5;
            int potenz2 = 2;
            double ergebnis2 = berechnePotenzen(basis2, potenz2);
            System.out.println(basis2 + " hoch " + potenz2 + " = " + ergebnis2);
    
            // Weitere Tests können nach Bedarf hinzugefügt werden
        }
        
}
