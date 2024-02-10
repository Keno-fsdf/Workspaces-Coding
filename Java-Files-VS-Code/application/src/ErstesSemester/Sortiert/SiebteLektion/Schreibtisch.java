package Sortiert.SiebteLektion;

public class Schreibtisch {
    //KEINE AHNUNG WAS GENAU JETZT IN DER AUFGABENSTELLUNG ERWARTET WIRD. was zum fick soll man da simulieren, wenn es einfach eine 50% wahrscheinlichkeit ist, wenn klar ist, 
    //,dass in ersten beiden kein Euro drin ist, dann ist ja automatisch in der 3 der euro drinn, wenn überhaupt ein Euro im Schrank ist. Also: 0.5 * 1 = 0.5
    //Ich könnte ja dann auch einfach^meine Methode ProzentfivityFivty in einer while-Schleife laufen lassen und zählen lassen wie oft "false" und "true" rauskommt
    //dann hätte ich eigentlich die lösung. Also k.a ob das so gedacht ist. Finde die aufgabenstellung mies dumm


    //hab jetzt einfach eine andere wahrscheinlichkeit ausgerechnet, nämlich die  wie hoch die wahrscheinlichkeit ist, dass in der 3ten Schublade bei einem schrank ein euro drin ist
    // wahrscheinlichkeit = 0.5*0.77*0.77*0.33 =  2/27
    public static void main(String[] args) {
        // System.out.println(ProzentfivtyFivty());
        int zählerFürDieWahrscheinlichkeit = 0;  
        for (int d = 10000; d>0; d--) {
        boolean a = ProzentfivtyFivty();
        if (a==false) System.out.println("In der ersten Schublade ist kein Euro drin \n" +"In der zweiten Schublade ist kein Euro drin \n" + "In der dritten Schublade ist kein Euro drin \n");
          

        if (a==true) {
            int b= 1;
            boolean schalter =true;
            while (b<=3) {
                
            switch (b) {
                case 1:
                    
                    if (ProzentDreiunddreißig()==true) {
                        System.out.println("In der ersten Schublade ist ein Euro drin");
                        schalter =false;
                    } else {
                        System.out.println("In der ersten Schublade ist KEIN Euro drin");
                    }
                    
                    break;

                case 2:
                    
                    if (ProzentDreiunddreißig()==true && schalter ==true) {
                        System.out.println("In der zweiten Schublade ist ein Euro drin");
                        schalter =false;
                    } else {
                        System.out.println("In der zweiten Schublade ist KEIN Euro drin");
                    }
                    
                    break;
            
                
                case 3:
                    
                    if (ProzentDreiunddreißig()==true && schalter ==true) {
                        System.out.println("In der dritten Schublade ist ein Euro drin");
                        zählerFürDieWahrscheinlichkeit++;
                        schalter =false;
                    } else {
                        System.out.println("In der dritten Schublade ist KEIN Euro drin");
                    }
                    
                    break;
            }
             b++;
        }

        }
        System.out.println();
        

    }
    System.out.println(zählerFürDieWahrscheinlichkeit);
    


        
    }

    public static boolean ProzentfivtyFivty () {

        double a = Math.random();
        if (a<=0.5) return true;



        return false;


    }

    public static boolean ProzentDreiunddreißig() {
        double a = Math.random();
        if (a<=1/Math.PI) return true;
        return false;


    }
    
}
