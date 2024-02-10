package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        int zahl = liesZahl();
        System.out.println("Eingelesene Zahl: " + zahl);
    }


    public static int liesZahl  () {
Scanner scanner = new Scanner (System.in);

while (true) {
try {
String eingabe = scanner.nextLine();
int a = Integer.valueOf(eingabe);
return a;


}

catch (Exception e) {
System.out.println("Ungültige Eingabe");

}



}


}
}
