package testFolder;

import java.io.IOException;

public class printE {

    public static void main(String[] args) throws IOException  {
        int ueberpruefung1 = 6513435 %10000000/1000000; 
        int ueberpruefung2 = 6513435 %1000000/100000; 
        System.out.println(ueberpruefung1);
        System.out.println(ueberpruefung2); //Das ganze mit nem & Operator verknüpfen und wir haben es 
    }    
    
}
