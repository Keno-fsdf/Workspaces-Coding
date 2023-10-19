
public class Frage_Matirkelnummer {
        public static void main(String[] args)  {
            java.util.Scanner scanner = new java.util.Scanner(System.in);  //Scanner für den User-Input
            int matrikelnummer = scanner.nextInt();          
    
            System.out.println("Gib deine Matrikelnummer an ");
    
            // System.out.println(matrikelnummer);
            // String.valueOf(matrikelnummer).get
            int length_Anzahl_Der_Stellen = String.valueOf(matrikelnummer).length();  //Wie viel Stellen die Matrikelnummer hat
            int firstTwoDigits = Integer.parseInt(Integer.toString(matrikelnummer).substring(0, 2));   //Die ersten beiden Stellen der Matrikelnummer
    
            
            if (length_Anzahl_Der_Stellen!=7 || firstTwoDigits !=50  )  { //Wenn die Matrikelnummer keine 7 stellen hat ODER NICHT mit 50, 51, 61 anfängt
                System.out.println("Geben sie eine gültige Matrikelnummer an (Eine Matrikelnummer hat immer 7 Stellen und fängt mit 50 oder 51 oder 61 an)");
            }   //    || steht für oder
            
           else {
             System.out.println("Es liegt eine gültige Matrikelnummer vor");
           }
        //    || firstTwoDigits !=50  || firstTwoDigits!=51   || firstTwoDigits!=61
           
           
            // System.out.println(firstTwoDigits);
            
            scanner.close();
        }
    }
    

