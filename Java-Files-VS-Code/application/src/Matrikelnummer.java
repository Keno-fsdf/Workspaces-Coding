public class Matrikelnummer {
    public static void main(String[] args)  {
        java.util.Scanner scanner = new java.util.Scanner(System.in);  //Scanner für den User-Input
                  

        System.out.println("Gib deine Matrikelnummer an ");
        int matrikelnummer = scanner.nextInt();

        int length_Anzahl_Der_Stellen = String.valueOf(matrikelnummer).length();  //Wie viel Stellen die Matrikelnummer hat
        int firstTwoDigits = Integer.parseInt(Integer.toString(matrikelnummer).substring(0, 2));   //Die ersten beiden Stellen der Matrikelnummer

        

        // }
        
       if (length_Anzahl_Der_Stellen==7 && firstTwoDigits==50  || length_Anzahl_Der_Stellen ==7 &&firstTwoDigits==51 || length_Anzahl_Der_Stellen==7 && firstTwoDigits==62) 
       {    System.out.println("Es handelt sich um eine gültige Matrikelnummer");}


       else {
        System.out.println("Es handelt handelt sich um KEINE gültige Matrikelnummer ");
       }


        
        scanner.close();
    }
}
