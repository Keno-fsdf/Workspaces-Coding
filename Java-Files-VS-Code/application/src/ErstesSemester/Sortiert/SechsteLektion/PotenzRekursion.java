package Sortiert.SechsteLektion;

public class PotenzRekursion {
    public static void main (String[]args) {   //Das mit dem Scanner könnte ich natürlich auch einfach in der Potenz-Methode machen, ich weiß nicht genau wie das von der Aufgabenstellung nämlich verlangt ist in diesem punkt
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Geben sie die Basis der Zahl an: ");
        int basis = scanner.nextInt();
        System.out.print("Geben sie die Potenz der Zahl an: ");
        int potenz = scanner.nextInt();
        System.out.println(Potenz(basis, potenz));
        scanner.close();
    }
    static int ergebnis = 0;
    public static int Potenz (int basis, int potenz) {  //3hoch4 = 3*3*3*3 
        if (potenz==0) return 1;
        
        return basis*Potenz(basis, potenz-1);

       
        


    }
    
}
