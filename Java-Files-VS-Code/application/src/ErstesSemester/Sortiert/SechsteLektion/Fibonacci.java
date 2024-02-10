package Sortiert.SechsteLektion;

public class Fibonacci {
    public static void main (String[]args) {

        fibonacci(25);

    }


    public static void fibonacci (int Usereingabe) {

        int anfang = 0;

        while (anfang<2 && anfang<Usereingabe) { // Gibt die "zwei 1er aus" und stellt den anfang auf 2
            if (anfang==0) {
                System.out.print(anfang + " ");
                anfang++;
            }
            if (anfang==1) {
               for (int zweimal = 0; zweimal<2; zweimal++) {
                System.out.print(anfang + " ");
               }
               anfang++;
            }
            //Hier ist Anfang = 2
            
        }
        System.out.print(anfang + " ");  //gibt die zwei aus


        int zwischenspeicher = 1;
        int zwischenspeicher2 = 2;
        boolean schalter = false;
        while (anfang<Usereingabe) {
            // Anfang ist = 2

            //Ich hab hierfür zwei zwischenspeicher benutzt um das ganze zum laufen zu bekommen, und die zwischenspeicher müssen abwechselnd benutzt werden, daher auch den boolean-schalter bei der if-schleife

            if (schalter==false) {
           
            anfang = anfang + zwischenspeicher;  // anfang = 2 + 1
            if (anfang<Usereingabe)  System.out.print(anfang + " ");
            
            zwischenspeicher = anfang;  // zwischenspeicher = 3
            schalter=true;
            }




            if (schalter==true) {
            // zwischenspeicher2 = anfang;
            anfang = anfang + zwischenspeicher2;
            zwischenspeicher2 = anfang;
            if (anfang<Usereingabe)  System.out.print(anfang + " ");
            schalter =false;
            }

            //anfang = anfang + zwischenspeicher 1
            //anfang = zwischenspeicher2 = 2
            // 2 = 2 + 1  -->3
            // 2 = 2 + zwischenspeicher 1 
            // anfang = zwischenspeicher 1 -->zwischenspeicher 1 = 3

            //hier dazwischen ein boolean-switch

            // 3 = 3 + 2
            // 3 = 3 + zwischenspeicher 2
            // anfang = zwischenspeicher 2

            // 5 = 5 + Zwischenspeicher 1

            //zwischenspeicher1 = 1
            //zwischenspeicher2 = 2
            //zwischenspeicher1 = 3
            //zwischenspeicher2 = 5



            //5 = 5 + zwischenspeicher 1
            //8 = 8 + zwischenspeicher 2

            //2 = 2 + 2
            //wir müssen eine variable für die variable davor irgendwo speichern
            // anfang = anfang + anfang;
            
        }


        // System.out.println(anfang);

    }


    
    }
