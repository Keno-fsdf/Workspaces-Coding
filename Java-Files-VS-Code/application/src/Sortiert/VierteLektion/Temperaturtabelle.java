package Sortiert.VierteLektion;

public class Temperaturtabelle {
    public static void main (String[]args) {
        
        
        System.out.println("Fahrenheit \t Celsius");
        for (int fahrenheit =0; fahrenheit<=300;fahrenheit++) {  
            float celsius =  (float) ((5.0/9) *(fahrenheit-32)); // 5.0 anstatt 5 damit keine Integer-Division durchgeführt wird sondern eine floating-point division
            // double celsius = 5/9;
            float celsiusGerunded = (float)(Math.round(celsius*100.0)/100.0); //Erklärung für die Zeile darunter
            //Wir machen als erste die Ursprüngliche Zahl mal 100 ,damit es dann gerundet wird auf eine ganze Zahl - Integer (weil die Funktion halt genau das machen) 
            //und danach machen wir /100 , damit genau die Zahl rauskommt die wir eigentlich wollen bzw. wir 2 Nachkommastellen wollen
            //und wir müssen (float) davor schreiben, weil links erstmal ein double value rauskommt und wir keinen double zu einen float durch impliziert Typumwanlung konvertierten könne
            //-->Deswegen explizite Typumnwandlung

            System.out.println(fahrenheit + "\t \t " + celsiusGerunded);
        }


    }
}
