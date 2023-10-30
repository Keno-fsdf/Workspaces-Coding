package Sortiert.FünfteLektion;
import java.util.Scanner;
public class Potenz {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Baisis an");
        double b = scanner.nextInt();
        System.out.println("Geben sie die Potenz an");
        int n = scanner.nextInt(); //potzen
        boolean ersteRechnung = true;
        double ergebnis = 0;
        
        scanner.close();
        if (n==0) ergebnis =1;

        else if (n>0) {
            
            while (n>0) {

                if (ersteRechnung==true) {
                ergebnis = b*b;
                ersteRechnung=false;
                
                n = n-2;
                }
                else {

                ergebnis = ergebnis*b;    
                    
                    n = n-1;

                }
            



           
            }
           


        }

    else if (n<0) {
            
            while (n<0) {

                if (ersteRechnung==true) {
                ergebnis = b*b;
                ersteRechnung=false;
                System.out.println("rodrigo");
                n = n+2;
                }
                else {

                ergebnis =  ergebnis*b;    
                    System.out.println("sdkfsjdf");
                    n = n+1;

                }
                
            



           
            }
           ergebnis = 1.0/ergebnis;


        }
         System.out.println(ergebnis);
        // else if (n<0) {
        //     ergebnis = 1/b



        // }




        
        


    }    
}
