package Sortiert.SechsteLektion;

public class Runden {
    public static void main (String[]args) {
        
        System.out.println (rundenMitAngabeNachkommastellen(31.301499, 3)); //Nur wenn man bspw. 31.30  mit runden auf 1 nachkommastelle schreibt funktioniert das programm beim runden nicht, bei 31.01 geht es wieder richtig
        //das problem von oben kommt von der rechnenungsungeaugigkiet bei double werten --> es macht aus 0 --> 9,99999  bzw. 0, 99999999
        //Lösung dafür ist, alle kommazahlen in ganzzahhlige (große) werte umzuwandeln und damit alles zu berechnen bzw. mit if statements zu arbeiten und erst am ende die werte wieder in kommastellen umwandeln
        //Wenn 0 kommt rundet es nach oben aus, dass liegt an der rechenfehlerdifferenz in java -->Lösung hierfür wäre, dass ich alle Zahlen in Integer umwandle, indem ich bspw. *1000 rechne und danach erst mit If-Statements prüfen und danach erst die Zahlen wieder in Kommastellen umwandeln
        

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




            if (zahl%a<0.4999999999%1/nachkommastelle){ // anstatt 0.5 lieber 0.499999 -->Weil teilweise aufgrund der rechenfehlerdifferenz durch java bspw. 0.49999999 rauskommt und dann es nicht zu 0.5 gehört
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
