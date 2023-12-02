
import java.util.Scanner;
import java.lang.Math;
public class test4 extends Exception{
   
       
    public static void main(String []zahlen) throws zahlNichtZweiExecption {
        int x = 121; 
        String a = Integer.toString(x);
        char [] liste = a.toCharArray();
        int länge = liste.length;
        char [] vergleichsListe = new char[länge];
        int c = 0;
        for (int i =0; i<länge; i++) {
            vergleichsListe [i] = liste [länge-1-c];
            c++;


        }
        System.out.println(java.util.Arrays.toString(vergleichsListe));
       
    }   
}       
// 0 -->9, weil es ungenau
//ich will die nachkommastelle auf 1 haben, also bspw. 10000

