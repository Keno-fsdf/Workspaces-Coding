package Sortiert.testFolder;

import java.util.*;
public class VerständnisVergleichStrings {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben sie den ersten String ein");
    String firstString = scanner.nextLine();
    System.out.println("Geben sie den zweiten String ein");
    String secondString = scanner.nextLine();
    if (firstString.equals(secondString)) {
        System.out.println("Die beide Strings sind gleich");
    }
    else System.out.println("Die Strings sind nicht gleich");
    System.out.println(firstString.equals(secondString)); //gibt entweder false oder true aus
    System.out.println(firstString.compareTo(secondString));


    scanner.close();


    }
    
}
