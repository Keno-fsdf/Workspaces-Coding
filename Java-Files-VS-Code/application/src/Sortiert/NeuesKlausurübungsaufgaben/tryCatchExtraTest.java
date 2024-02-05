package Sortiert.NeuesKlausurübungsaufgaben;
import java.util.Scanner;
public class tryCatchExtraTest {
    

    public static void main(String[] args) throws Exception {
        System.out.println(alter());
    }

    public static int alter ()throws Exception {
        Scanner scanner = new Scanner (System.in);
        int alter = scanner.nextInt();
        if (alter<18) {
            throw new Exception();

        }
        return alter;
       


        }


    }



