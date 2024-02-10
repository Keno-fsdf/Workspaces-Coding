package Sortiert.AchteLektion;

public class einfacherRechner {

    


    public static void main(String[] test) {  //"test" in args umwändern und den kommentar darunter ent-kommentieren, um es innerhalb einer IDE laufen zu lassen. 

        // String[] test = {"650", "5", "5", "-"};
       

        

        boolean ersteRechnung = true; 
        int letzterParameter = test.length - 1;
        String rechenOperator = test[letzterParameter];

        int summe = 0;
        int j = 0;
        //immernoch alles gleich
        if (rechenOperator == "+") {
            for (; j < letzterParameter; ) {
                if (ersteRechnung) {
                    int a = getNumber(test[j]);
                    int b = getNumber(test[j + 1]);
                    summe = a + b;
                    j += 2;
                    ersteRechnung = false;
                } else {
                    int a = getNumber(test[j]);
                    summe += a;
                    j++;
                }
            }
        }
        if (rechenOperator == "-") {
            for (; j < letzterParameter; ) {
                if (ersteRechnung) {
                    int a = getNumber(test[j]);
                    int b = getNumber(test[j + 1]);
                    summe = a - b;
                    j += 2;
                    ersteRechnung = false;
                } else {
                    int a = getNumber(test[j]);
                    summe -= a;
                    j++;
                }
            }
        }

        System.out.println(summe);
    }



    private static int getNumber(String s) {
        int result = 0;
        //650
        //digit 1 = 6 , digit 2 = 5, digit 3 = 0
        for (char digit : s.toCharArray()) {  //für jedens digit in dem string .
            result = result * 10 + (digit - '0');
            //0    = 0*10 +  (6-ascci-wert) -->6
            //6 = 6*10 + (5) = 65
            //65 = 65*10 + (0) = 650
        }
        return result;
    }
    
}
