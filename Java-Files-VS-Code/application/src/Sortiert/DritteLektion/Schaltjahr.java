
public class Schaltjahr {
    public static void main(String[] args)  {
        System.out.println("Geben sie das Jahr ein");  
    
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int jahreszahl = scanner.nextInt();
        
        
        //Ich arbeite mit boolean Values zur besseren Übersicht
        boolean ganzzahligteilbarV =false;  //Initialisieren der Boolean-Values
        boolean ganzzahligteilbarH = false;
        boolean ganzzahligteilbarVH = false; 

        int prüfungGanzzahligTeilbarDurchVier = jahreszahl%4;
        int prüfungGanzzahligTeilbarDurchHundert = jahreszahl%100;
        int prüfungGanzzahligTeilbarDurchVierHundert = jahreszahl%400;

        //Dafür sorgen das die boolean Values die richten Werte haben bzw. richtig "eingestellt" sind
        if (prüfungGanzzahligTeilbarDurchVier==0) {

            ganzzahligteilbarV =true;
        }
        if (prüfungGanzzahligTeilbarDurchHundert==0) {

            ganzzahligteilbarH =true;
        }
        if (prüfungGanzzahligTeilbarDurchVierHundert==0) {

            ganzzahligteilbarVH =true;
        }  

        //Überprüfung ob es um ein Schaltjahr handelt mit Boolean-Values

        if(ganzzahligteilbarV==false){    //Schauen ob es nicht durch 4 teilbar
            System.out.println("Es handelt sich um KEIN Schaltjahr"); 
        }

        if (ganzzahligteilbarV==true&& ganzzahligteilbarH==true && ganzzahligteilbarVH ==true) {   //Durch 4 teilbar und durch 100 und durch 400
            System.out.println("Es handelt sich um ein Schaltjahr");
        }
        if (ganzzahligteilbarV==true&& ganzzahligteilbarH==true && ganzzahligteilbarVH ==false) {   //Durch 4 teilbar und durch 100, aber nicht durch 400
            System.out.println("Es handelt sich um KEIN Schaltjahr");
        }
        if (ganzzahligteilbarV==true&& ganzzahligteilbarH==false && ganzzahligteilbarVH ==false) {   //Durch 4 teilbar, aber nicht durch 100 und nicht durch 400
            System.out.println("Es handelt sich um ein Schaltjahr");
        }
        scanner.close();
    }
}
