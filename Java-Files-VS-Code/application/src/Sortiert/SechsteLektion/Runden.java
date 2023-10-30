package Sortiert.SechsteLektion;

public class Runden {
    public static void main (String[]args) {
        
        System.out.println (rundenMitAngabeNachkommastellen(31.31, 1)); //Wenn 0 kommt rundet es nach oben aus, dass liegt an der rechenfehlerdifferenz in java -->Lösung hierfür wäre, dass ich alle Zahlen in Integer umwandle, indem ich bspw. *1000 rechne und danach erst mit If-Statements prüfen und danach erst die Zahlen wieder in Kommastellen umwandeln
        

    }

    public static double runden (double zahl) {   
        if (zahl%1<0.5){
            zahl = (int) zahl;
            return zahl;
            
        }
        else {
            zahl = (zahl*10) + 10;  //3.5 *10 = 35 + 10 = 46 / 10 -->4.6 -->4.0
            
            zahl = zahl/10;
            zahl = (int) zahl;
            return zahl;

        }

    }

    public static double rundenMitAngabeNachkommastellen (double zahl, int nachkommastelle) {

            
            //Wenn nachkommastelle 1 ist, dann bleibt es einfach so und geht erst gar nicht in die for-schleife
            int zeahler = nachkommastelle + 1;  //Zwischenspeicherung für die weritere verwendung
            if (nachkommastelle==0) nachkommastelle++; //Für den fall das es 0 Nachkommstellen gibt, sodass es keinen Fehlercode durch bspw. 0/0 gibt 
            nachkommastelle = nachkommastelle/nachkommastelle; // Damit aus der z.b 3 Nachkommastellen zunächst 1 und dann 1000 wird
            while (zeahler>1) {
                nachkommastelle = nachkommastelle*10;
                zeahler--;

            }
            
            //1 nachkomma stelle = zahl%1
            //2 nachkomma stelle = zahl %10
            double a = 1.0/nachkommastelle; //1.0 / 10 --> 0.1
            System.out.println(a); 
           System.out.println(zahl%a);  //31.40 %0.1 
            //abrunden
            boolean esHandeltSichUm0 = false;
            // if ((zahl%a<1000000000%1/nachkommastelle)&& (zahl%a>0.00000000000000000001%1/nachkommastelle)){ // anstatt 0.5 lieber 0.499999 -->Weil teilweise aufgrund der rechenfehlerdifferenz durch java bspw. 0.49999999 rauskommt und dann es nicht zu 0.5 gehört
            // zahl = zahl*nachkommastelle;    //anstatt 0.499999 vielleicht was mit der epsilon umgebung machen -->Das nochmal anschauen üben
            // zahl = (int) zahl;
            // zahl = zahl/nachkommastelle;
            // esHandeltSichUm0 = true;
            // return zahl;   }



            if (zahl%a<0.4999999999%1/nachkommastelle && esHandeltSichUm0 ==false){ // anstatt 0.5 lieber 0.499999 -->Weil teilweise aufgrund der rechenfehlerdifferenz durch java bspw. 0.49999999 rauskommt und dann es nicht zu 0.5 gehört
            zahl = zahl*nachkommastelle;    //anstatt 0.499999 vielleicht was mit der epsilon umgebung machen -->Das nochmal anschauen üben
            zahl = (int) zahl;
            zahl = zahl/nachkommastelle;
            return zahl;   }

            
 

        
        //aufrunden
        else {
            zahl = zahl*nachkommastelle ;  //2.5356 = 2.5356 *100 = 253,56
            zahl = zahl + 1; // 253,56 + 1 = 254,56
            zahl = (int) zahl; //254
            zahl = zahl/nachkommastelle; //254  / 100 = 2.54
            return zahl;

        }


    }

    
}
