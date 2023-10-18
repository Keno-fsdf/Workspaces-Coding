package Unsortiert;
import java.util.ArrayList;


//Fragen ob man Import benutzen darf, also Libarary von außen
//Fragen ob er eine Lösung hat ab dem Part wo ich switch statements benutzt, also wie man das so macht, dass unendlich viele Pizzen verglichen werden können
//Frage -->Wieso sie eine Möglichkeit bei vs-Code die Probleme zu ignorieren
//Wie schlimm sind "Probleme im Code" wenn trotzdem der Code funktioniert???
public class Pizzarechner {
    public static void main(String[] args)  {
        java.util.Scanner scanner = new java.util.Scanner(System.in); //Scanner-Code
        ArrayList<Double>  durchmesserDerPizzen_Liste = new ArrayList<Double>(); //Zwischenspeicher für Durchmesser
        ArrayList<Double> preisDerPizzen_Liste= new ArrayList<Double>();      //Zwischenspeicher für den Preis
        ArrayList<Double> flächePreisVerhältnis_Liste= new ArrayList<Double>();      //Zwischenspeicher für den Preis
       
      
        int anzahDerPizzen = 3;       //Es können maximal 3 Pizzen miteinander verglichen werden
        int anzahlDerBerechnungen = anzahDerPizzen;
       
        while (anzahDerPizzen>0) {
            

                System.out.println("Geben sie die Daten für eine Pizza an: " );
                System.out.println("");
                // Durchmesser
                System.out.println("Gib den Durchmesser der Pizza in cm an");
                double Durchmesser = scanner.nextDouble();   //Fragt nach dem Durchmesser
                durchmesserDerPizzen_Liste.add(Durchmesser);  //Addiert die Usereingabe in eine Liste f端r die Zwischenspeicherung 
                
    
                //Preis
                System.out.println("Gib den Preis der Pizza in Euro an");
                double Preis = scanner.nextDouble();   //Fragt nach dem Durchmesser
                preisDerPizzen_Liste.add(Preis);  //Addiert die Usereingabe in eine Liste f端r die Zwischenspeicherung 
                System.out.println("");
                System.out.println("");
                   
            anzahDerPizzen = anzahDerPizzen-1; }   

        while (anzahlDerBerechnungen>0) {
           
            Object preis_Wert_aus_Liste = preisDerPizzen_Liste.get(anzahlDerBerechnungen-1); //-1, weil eine Liste mit dem Index 0 anfängt also das erste Objekt ist 0 und nicht 1
            Object durchmesser_Wert_aus_Liste = durchmesserDerPizzen_Liste.get((anzahlDerBerechnungen-1));
            double preis_als_rechenbarer_Wert = (double) preis_Wert_aus_Liste;  //Das Object jetzt in ein Double umgewandelt
            double durchmesser_als_rechenbarer_Wert = (double) durchmesser_Wert_aus_Liste;   //Das Object jetzt in eien Double umgewandelt, damit ich damit danach rechnen kann
           //Berechnungen
            double fläche_der_pizza = Math.pow(durchmesser_als_rechenbarer_Wert,2); //Fläche der Pizza ausgerechnet
            double fläche_preis_verhältnis = fläche_der_pizza / preis_als_rechenbarer_Wert;
            flächePreisVerhältnis_Liste.add(fläche_preis_verhältnis); //Zwischenspeicher
       
        
            System.out.println("Die Fläche der Pizza ist " + fläche_der_pizza + "cm²");
            System.out.println("Das Größen- / Preisverältnis ist: " + fläche_preis_verhältnis + " Euro pro cm²");
     
            anzahlDerBerechnungen = anzahlDerBerechnungen-1;
        } 
        
        Object a = flächePreisVerhältnis_Liste.size(); //Wieder ein Zwischenspeicher
        int b = (int) a; // Damit ich die if Schleife benutzen kann mit >1 -->Ich kann mit einem int subtrahieren
        
        if(b>1) {  //Ein Vergleich ist nur Möglich mit mindestens zwei werten 
            System.out.println(""); //zur formatierung -->Besseren Übersicht
            switch(b){
                case 2: //Beim Vergleich von zwei Pizzen
                    double fläche_preis_verhältnis_zum_rechnen = (double) flächePreisVerhältnis_Liste.get(0); //umwandlung der Werte sodass man damit rechnen kann 
                    double fläche_preis_verhältnis_zum_rechnen2 = (double) flächePreisVerhältnis_Liste.get(1); //also von object zu double (Datentyp)

                    if (fläche_preis_verhältnis_zum_rechnen>fläche_preis_verhältnis_zum_rechnen2) {
                        System.out.println("Die zweite Pizza hat ein besseres Preis-Leistung Verhältnis");
                        
                    }
                    else{
                        System.out.println("Die erste Pizza hat ein besseres Preis-Leistung Verhältnis");
                          
                    }
                    break;
                case 3:  //Beim Vergleich von drei Pizzen
                    
                    double c = (double) flächePreisVerhältnis_Liste.get(0); //Es müssen drei werte verglichen werden also drei zeilen
                    double d = (double) flächePreisVerhältnis_Liste.get(1);
                    double e = (double) flächePreisVerhältnis_Liste.get(2);



                    
                    if (c<=d&& c<=e) {
                        System.out.println("Die erste Pizza hat den besten Preis");
                    }
                    else if (d<=e&&d<=c){
                        System.out.println("Die zweite Pizza hat das beste Preis-Leistung Verhältnis"); }
                    else{
                        System.out.println("Die dritte Pizza hat das beste Preis-Leistung Verhältnis"); 


                    }
                break;
            }

            

        }
    scanner.close();
}}
