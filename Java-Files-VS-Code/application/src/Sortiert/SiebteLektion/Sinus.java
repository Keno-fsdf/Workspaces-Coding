package Sortiert.SiebteLektion;

public class Sinus {
    public static void main(String[] args) {
    // System.out.println(sin(5));
    double wertVonDemIchSinusBerechnenWill = 5.0;
    

    System.out.println("sin(" + wertVonDemIchSinusBerechnenWill + ") = " + sin(wertVonDemIchSinusBerechnenWill)); //precision gibt an wie genau das ganze sein soll -->wie bei der Berechnung von pi mit den dreiecken

    }





    //  }


    public static double sin(double x) {
        
          
        double n = 1;
           double i = 2;
           double z = 1;
            double s = 1;
            double summand = 1.0;
           while (summand>1E-15 ||summand<-1E-15) {
       
               z  = (z * x * x *-1) ;  //das ist genau gleich
               n = (n * (i - 1)) * (i);
               summand = z/n;
               s = s + summand;
                //  answer = answer + ((power/factorial ));
       
               i = i + 2;
       
           }
       
           return s;
       
        }}
