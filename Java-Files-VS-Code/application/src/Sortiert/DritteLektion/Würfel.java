

public class Würfel {
    public static void main(String[] args)  {
        boolean programmWiederholen = true; // Wiederholt den Vorgang wenn eine Zahl bei Math.random rauskommt die entweder 0 oder größer als 6 ist

        while (programmWiederholen== true) {
         double number = Math.round(Math.random()*10);  //Es können nur Zahlen von 1-10 ausgeben werden -->0,1 [...] -->1,             0,36466546 -->3
         int umwandlungVonNumber = (int) number; //Umwandlung von double zu integer sodass ich danach das switch-Statement verwenden kann
        
       

        


            
            switch (umwandlungVonNumber) { //Man kann ALTERNATIV auch mehrere IF-Statements benutzen
                case 1:
                System.out.println("Eins gewürfelt");
                programmWiederholen = false; //Damit nicht nochmal das Programm läuft -->Es kam ja eine Würfelzahl raus
                
                break;
                case 2:
                System.out.println("Zwei gewürfelt");
                programmWiederholen = false;
                break;
                case 3:
                System.out.println("Drei gewürfelt");
                programmWiederholen = false;
                break;
                case 4: 
                System.out.println("Vier gewürfelt");
                programmWiederholen = false;
                break;
                case 5:
                System.out.println("Fünf gewürfelt");
                programmWiederholen = false;
                break;
                case 6:
                System.out.println("Sechs gewürfelt");
                programmWiederholen = false;
                break;


            }

        }




    }
}
