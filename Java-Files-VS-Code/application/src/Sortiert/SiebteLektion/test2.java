package Sortiert.SiebteLektion;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Anzahl der einzulesenden Werte:");
    int anzahlDerWerte = scanner.nextInt();
    System.out.println(anzahlDerWerte);

    int zahlen [] = new int[anzahlDerWerte];
    if (anzahlDerWerte<=0) {
        System.out.println("Eingebener Wert ist zu kleiner. Er muss größer als 0 sein");
        scanner.close();
        return;
    }
    int zwischenspeicher = 0;
    while (zwischenspeicher<anzahlDerWerte) {  //0<1
        System.out.println("Geben sie den " + (zwischenspeicher+1) + "ten Wert an: " );
        System.out.println(zwischenspeicher);
        
        zahlen[zwischenspeicher] = scanner.nextInt();
        

        zwischenspeicher++;
        
    }

    int minimum = zahlen[0];
    int maximum = zahlen[0];
    int summe = zahlen[0]; //Ist für mittelwert
    for (int i = zahlen.length-1; i>0; i--) {
        summe = summe+zahlen[i];
        if (zahlen[i]< minimum) minimum = zahlen[i];

        if (zahlen[i]> maximum) maximum = zahlen[i];


    }
    double mittelwert = (double)summe/zahlen.length;

    System.out.println(Arrays.toString(zahlen));
    System.out.println(mittelwert);
    System.out.println("maximum: " + maximum);
    System.out.println("minimum: " + minimum);
    System.out.println("Summe: " + summe);
    System.out.println("bla bla");



//     scanner.close();
}


// public static 
}
