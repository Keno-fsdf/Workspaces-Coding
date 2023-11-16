package Sortiert.Leetcode;

public class Fizzbuzz {
    public static void main(String[] args) {
        String ergebnis = "";
        int fizz = 0;
        int buzz =0;
        int fizzbuzz = 0;

        for (int i=1; i<100; i++) {
            fizz++;
            buzz++;
            if (fizz==3 && buzz==5) {
                fizz=0;
                buzz=0;
                ergebnis+= "fizzbuzz";

            }
            else if (fizz==3) {
                ergebnis+="fizz";
                fizz = 0;
            }   
            else if (buzz==5) {
                ergebnis += "buzz";
                buzz =0;

            }

           else {
            String a = Integer.toString(i);
            ergebnis+= a;


           }
           System.out.println(ergebnis);
           ergebnis = "";
        }
    }
    
}
