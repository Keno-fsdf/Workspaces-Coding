public class Primzahl {
    public static  void main(String[]args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein ");


        int a= scanner.nextInt();
        System.out.println("");
        int zahlZuÜberprüfen = a ;
        // boolean Primzahl = true;

        int countdown = zahlZuÜberprüfen ;
        while (countdown>0){
            int ganzzahligTeilbar = countdown%zahlZuÜberprüfen;
            System.out.println(ganzzahligTeilbar);
            // if (ganzzahligTeilbar == 0) {    //ganzzahligTeilbar !=0
            //     Primzahl=false;
            //     System.out.println("Es handelt sich um keine Primzahl");
            //     System.exit(0); // beendet das Programm
            // }
            countdown = countdown-1;
        }



        // System.out.println(ganzzahligTeilbar);
        // if (zahlZuÜberprüfen>1&&zahlZuÜberprüfen/zahlZuÜberprüfen)
        scanner.close();
    }
    
}
