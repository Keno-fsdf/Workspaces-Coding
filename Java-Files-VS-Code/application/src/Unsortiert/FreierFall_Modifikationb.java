package Unsortiert;


public class FreierFall_Modifikationb {

    static double fallGeschwindigkeit = 9.80665; //Eine globale Variable erstellen mit "static", sodass ich von überall auf diese Variable zugreifen kann

        //Die Modifikation ist, dass nur alle 5 Sekunden der Wert ausgedrückt
//Die Modifikation ist, dass nur alle 5 Sekunden der Wert ausgedrückt
//Die Modifikation ist, dass nur alle 5 Sekunden der Wert ausgedrückt

    public static void main(String[] args)  {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);  //Code für den Scanner
        System.out.println("Geben Sie die Falldauer an: "); //Anforderung an den Benutzer

        int countdown = scanner.nextInt(); //Fragt nach einem Integer vom Benutzer mit der Eingabe
        System.out.println(""); //Zur besseren Formatierung

        countUP(1,countdown); //Hier ist n2

            scanner.close();
    }






    public static int countUP(int n1, int n2) { //Erwartet zwei Variablen als Integer
    
    if (n1-1>=n2){
        
            try {Thread.sleep(1000); //1000 milliseconds equals 1 second
                
                
                
            

        }
            catch (InterruptedException e){
            System.out.println("Thread interrupted");;
        } 
            

        
        return 0; //end statement
    }
    else {
        System.out.println("Zurückgelegte Strecke nach " + n1 + " sekunden:");

        try {Thread.sleep(1000); //1000 milliseconds equals 1 second
            double zurückgelegteStrecke=fallGeschwindigkeit/2*Math.pow(n1, 2);
            System.out.println(zurückgelegteStrecke + "m");



        }
        catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        

        
        
       

        return countUP(n1+5, n2);
    }


    }

}

