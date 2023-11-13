package Sortiert.SiebteLektion;

public class test {
    public static void main(String[] args) {
       System.out.println( cos (12));
    }
 
public static double cos (double x) {   
double z = 1.0;
double n = 1.0;
double summe = 1.0;
double summand = 1.0;
for (int i = 2; summand >1E-15 || summand <-1E-15; i = i + 2) {
    z = z*x *x *(-1);
    n = n*i*(i-1);
    summand = z / n;
    summe = summe + summand;


}

return summe;
}
}
