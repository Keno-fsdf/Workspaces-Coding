package Sortiert.SechsteLektion;

public class Sprünge {
    public static void main (String[]args) {
        System.out.println(springenInMehrerenSprüngen(4, 1, 2));  // 1 + 1 + 1 ,     1 + 2  ,  2 + 1   --> 1 +1  / 2
   }
   public static int springenInMehrerenSprüngen (int Distanz, int Sprungweite1, int Sprungweite2) {
    int möglichkeiten = 0;
    int summe = 0;
    int summe2 = 0;
    int a = 0;
    int b = 0;
    boolean schaltergesamt = true;
    // boolean schlater1 = true;
    // boolean schalter2 = true;
    //4 mal die while schleife wiederholen
    while (summe<=Distanz) {  //addieren von schritt 1
        summe = summe + Sprungweite1;  // 0 = 0 + 1  --> 1 = 1+1 --> 2              //Addiere alles auf bis auf 4
        summe = summe + (a*Sprungweite2);  // 0 = 0 + (0*2) --> 2 + (1*2) =4 --->
        // System.out.println(summe);
        // System.out.println(summe);
            // boolean schalter = true;
        if (summe ==Distanz) { möglichkeiten++;

        }
        if (summe>=Distanz) {
            a ++;
            summe = 0+a;
            // a ++;
            System.out.println(summe);


        }




    }

    // summe=0;
    //     while (summe2<=Distanz) {  //addieren von schritt 1
    //     summe2 = summe2 + Sprungweite2;  // 0 = 0 + 1  --> 1 = 1+1 --> 1
           
    //         // boolean schalter = true;
    //     if (summe2 ==Distanz) { möglichkeiten++;

            
    //     }
    //     if (summe2>Distanz) {
    //                 b ++;
    //         summe2 = 0+b;
    //     }

    //     }
    
    //while addieren von schritt 2



    return möglichkeiten;

   }




}
