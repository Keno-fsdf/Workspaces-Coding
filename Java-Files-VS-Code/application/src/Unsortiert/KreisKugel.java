package Unsortiert;
public class KreisKugel {
    public static void main(String[] args)  {
        int r = 5;  //radius vom Kreis
        double kreisfläche = Math.PI*Math.pow(r,2);  //Math.Pi = 3.14...    Math.pow  = radius hoch 2

        System.out.println("Die Kreisfläche des Kreises mit dem Radius   " + r + " beträgt: " + kreisfläche);  //Ich gebe das Ergbnis von der Kreisfläche im Terminal aus. 

        double kugelvolumen = 4/3*Math.PI*Math.pow(r,3); // ich hab den datentyp double benutzt, da die "Math.pow"-Funktion -->double Werte erwartet

        System.out.println("Das Kugelvolumen mit dem Radius " + r + " beträgt: " + kugelvolumen);  //Ich gebe das Ergbnis von der Kreisfläche im Terminal aus. 

    }    
    
}

    

