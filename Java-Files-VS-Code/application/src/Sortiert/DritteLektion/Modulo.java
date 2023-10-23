

public class Modulo {
    public static void main (String[]args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int Zahl= scanner.nextInt();
        int DurchSiebenTeilbar =Zahl%7;
       
        if (DurchSiebenTeilbar==0) {
            System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar");
            
        }
        else {
            System.out.println("Die Zahl ist NICHT ganzzahlig durch 7 teilbar");
           
        }
        

        scanner.close();
    }
}
