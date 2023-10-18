package Unsortiert;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Uhr_Weiterführende_Aufgabe {
    public static void main(String[] args)  {
 
        String zeitJetzt = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")); //ich hole mir die Zeit mir "LocalTime.now" und Formatiere das ganze direkt mit "DateTimeFormatter"

        

        //Den String wieder in einen Integer umwandeln, damit ich danach damit arbeiten kann, weil mit String kommt ein Fehler raus
        int zeitJetztAlsInteger = Integer.valueOf(zeitJetzt);
      
        
        //Den Integer jetzt auseinander legen, damit dann ich einzelne variablen rausbekommen wie bspw. stunden = 19  (also 19 stunden)

        int stunden = Integer.parseInt(Integer.toString(zeitJetztAlsInteger).substring(0, 2));  //getting to first two numbers from the integer =hh -->Also die Stunden
        int minuten = Integer.parseInt(Integer.toString(zeitJetztAlsInteger).substring(2, 4));
        int sekunden = Integer.parseInt(Integer.toString(zeitJetztAlsInteger).substring(4, 6));

                

        int zeitSeitMitternacht = (stunden*3600 + minuten+60 + sekunden); //Eine Stunde hat 3600 Sekunden
   
        System.out.println("Seit Mitternacht sind " + zeitSeitMitternacht + " Sekunden vergangen");  //Die Zeit seit Mitternacht gebe ich im Terminal aus
        
        double zeitBisMitternacht = ((24 * 3600) - (stunden*3600 + minuten+60 + sekunden)); // Hab extra Klammern für die bessere Lesbarkeit hinzugefügt , Sekunden an einem Tag = 24*3600 Sekunden
        int zeitBisMitternacht_Int = (int)Math.round(zeitBisMitternacht);
        System.out.println("Bis Mitternacht sind es " + zeitBisMitternacht_Int + " Sekunden"); //Verbleibende Sekunden des aktuellen Tages
        
        
        double ZeitDesTagesSchonWegProzent =  zeitSeitMitternacht*100 / (zeitSeitMitternacht + zeitBisMitternacht);   //Prozentual ausrechnen wie viel Zeit prozentual seit beginn des Tages vergangen ist
    
        System.out.println("Es ist schon " +ZeitDesTagesSchonWegProzent +"% des Tages vergangen"); 



    }    
}
