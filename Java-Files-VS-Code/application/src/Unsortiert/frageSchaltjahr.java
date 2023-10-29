package Unsortiert;

import java.util.Scanner;

public class frageSchaltjahr {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("7");
        int Jahr = scanner.nextInt();
        if ((Jahr%4==0)&& (Jahr % 100 ==0)&& (Jahr % 400 ==0)) {      
            System.out.println(Jahr + " ist ein Schaltjahr"); 

        }
        else if ((Jahr%4==0)&& (Jahr % 100 !=0)&& (Jahr % 400 !=0)) {
            System.out.println(Jahr + " ist ein Schaltjahr");

        }
        else System.out.println(Jahr + " ist kein Schaltjahr");

        scanner.close();
    }
}
