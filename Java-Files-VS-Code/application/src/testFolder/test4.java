package testFolder;
import java.lang.Math;
public class test4 {
    public static void main (String[]args) {
       
    int obergrenze = 6;
    int untergrenze = 1;

    int rand;
   for (int i = 0; i<25; i++) {
    rand = (int) (Math.random()*((obergrenze-untergrenze)+1) + untergrenze);
    System.out.println(rand);


   }

    

}       
// 0 -->9, weil es ungenau
//ich will die nachkommastelle auf 1 haben, also bspw. 10000
}
