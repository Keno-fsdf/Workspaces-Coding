
public class Wahrheitstabelle {
    public static void main(String[] args)  {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Input either: t or f");  //Anweisung an den Benutzer

        //Möglichen Eingaben
        char firstValidChar = 't';  //t steht für true
        char secondValidChar = 'f'; //f steht für false
        boolean validInput = false;


        while (validInput ==false) {   //die While schleife überprüft ob man es sich um eine Valide eingabe handelt
            // und falls nicht, dann wiederholt si  ch die While-Schleife bzw. Anfrage an den User

            char erstesEinzelzeichen = scanner.next(".").charAt(0);
            char zweitesEinzelzeiche = scanner.next(".").charAt(0);
            if ((erstesEinzelzeichen==firstValidChar|| erstesEinzelzeichen==secondValidChar)&& (zweitesEinzelzeiche==firstValidChar || zweitesEinzelzeiche==secondValidChar)){
                System.out.println("Valid Input");
                System.out.println("The result of the truth table is: ");
                validInput = true;

        } 
            else{
                System.out.println("You can only input t or f");  //Wird im Terminal ausgegeben, falls der Benutzter NICHT eine Valide Eingabe getätigt hat
            }
        

          //Code um das Ergbnis von der Wahrheitstabelle auszugeben  
        if (erstesEinzelzeichen==secondValidChar && zweitesEinzelzeiche==secondValidChar){
            System.out.println(0);
        }
        if (erstesEinzelzeichen==secondValidChar && zweitesEinzelzeiche==firstValidChar){
            System.out.println(1);
        }
        if (erstesEinzelzeichen==firstValidChar && zweitesEinzelzeiche==secondValidChar){
            System.out.println(2);
        }
        if (erstesEinzelzeichen==firstValidChar && zweitesEinzelzeiche==firstValidChar){
            System.out.println(3);
        }
        }
        scanner.close(); //Scanner muss immer wieder geschlossen werden

    }

}
