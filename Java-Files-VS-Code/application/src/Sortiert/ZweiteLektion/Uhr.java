package Sortiert.ZweiteLektion ;
public class Uhr {
    public static void main(String[] args)  {
        int stunden = 17;
        int minuten = 24;
        int sekunden = 48;
        int zeitSeitMitternacht = (stunden*3600 + minuten+60 + sekunden); //Eine Stunde hat 3600 Sekunden
   
        System.out.println("Seit Mitternacht sind " + zeitSeitMitternacht + " Sekunden vergangen");  //Die Zeit seit Mitternacht gebe ich im Terminal aus
        
        double zeitBisMitternacht = ((24 * 3600) - (stunden*3600 + minuten+60 + sekunden)); // Hab extra Klammern für die bessere Lesbarkeit hinzugefügt , Sekunden an einem Tag = 24*3600 Sekunden
        int zeitBisMitternacht_Int = (int)Math.round(zeitBisMitternacht);  //-->Muss ich machen, damit anstatt 45.0 sekunden 45 sekunden dasteht
        System.out.println("Bis Mitternacht sind es " + zeitBisMitternacht_Int + " Sekunden"); //Verbleibende Sekunden des aktuellen Tages
        
        
        double ZeitDesTagesSchonWegProzent =  zeitSeitMitternacht*100 / (zeitSeitMitternacht + zeitBisMitternacht); //Prozentual ausrechnen wie viel Zeit prozentual seit beginn des Tages vergangen ist
        System.out.println("Es ist schon " +ZeitDesTagesSchonWegProzent +"% des Tages vergangen"); 



    }    
    
}