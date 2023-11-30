package Sortiert.NeunteLektion;

//Hätte bei der Aufgabe aus Lektion 10 am liebsten eine Hashmap benutzt, aber haben wir halt noch net gemacht nah


public class RaumListe {

    public static void main(String[] args) {
    Raum ersterRaum = new Raum("1.2.1", 3);
    //Belegung des Raums mit Studenten
    ersterRaum.betreteRaum("Keno", 2545);
    ersterRaum.betreteRaum("Rodrigo", 345455);
    ersterRaum.betreteRaum("Isabell", 454545);
  
    

    

        String[] namen = ersterRaum.getStringArray(); //NameArray 
        int [] matrikelnummer = ersterRaum.getIntArray(); //Matrikelnummerarray
         System.out.println("Im Raum befinden sich momentan: ");
        for (int i = 0; i<namen.length; i++) {
           
            if (namen[i]!=null) {
                System.out.println("Student: " + namen[i] + " mit der Matrikelnummer: " + matrikelnummer[i] );

            }
            if (namen[i]!=null) {ersterRaum.verlasseRaum(namen[i]);
                System.out.println("Die Vorlesung hat geendet und jeder Student hat die Vorlesung verlassen");


        }

        }

        //überprüfung dass niemand mehr drin ist
        for (int i : matrikelnummer) {
            if (i!=0) {System.out.println("Kein Leerer Raum!!"); break;}
           
            
        }

        



    Raum zweiterRaum = new Raum("1.2.15", 88);


    System.out.println("Ist der erste Raum belegt? ");
    System.out.print(ersterRaum.istBelegt()+ "\n");
    
    System.out.println("Ist der zweite Raum belegt? ");
    System.out.print(zweiterRaum.istBelegt()+ "\n");


    ersterRaum.belegungRaum(); //Belegung der ersten Raums
    
    System.out.println("Ist der erste Raum belegt? ");
    System.out.print(ersterRaum.istBelegt()+ "\n");
    
    System.out.println("Ist der zweite Raum belegt? ");
    System.out.print(zweiterRaum.istBelegt()+ "\n"); 


    }


}
