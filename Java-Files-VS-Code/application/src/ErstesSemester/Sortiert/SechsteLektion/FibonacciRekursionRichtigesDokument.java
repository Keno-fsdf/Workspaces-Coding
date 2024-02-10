package Sortiert.SechsteLektion;

public class FibonacciRekursionRichtigesDokument {
    public static void main (String[]args) {
        int anzahlDerAusführungen = 0;
        int zahlbiszuWelcherWirdieFibonacciZahlenHabenWollen = 25; //Bis zur welcher Zahl die fibonacci zahl ausgegben werden soll
        int zwischenspeicher = 0;
         
        
        while (true) {  //wir machen hier "true", weil die schleife unendlich oft ausgeführt werden soll bis, (zwischenspeidher>zahlbiszuWElcherWir ...) -->Dort wird dann die schleife beendet
             zwischenspeicher = fibonacci(anzahlDerAusführungen); //-->mach das solange mit der while schleife bis es einfach über der zahl ist die wir wollen
             if (zwischenspeicher>zahlbiszuWelcherWirdieFibonacciZahlenHabenWollen) break;

            System.out.print(fibonacci(anzahlDerAusführungen) + " ");
            anzahlDerAusführungen++;
        }
    }
   
   

    public static int fibonacci (int Usereingabe) {
        if (Usereingabe==0) { 
            
            return 0;
        }
        if (Usereingabe==1) { 
            
            return 1;
        }

        
            return fibonacci(Usereingabe-1) +  fibonacci(Usereingabe-2);
        // }



      
    }

}
