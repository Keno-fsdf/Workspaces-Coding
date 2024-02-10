package Sortiert.NeuesKlausurübungsaufgaben;

import java.util.Scanner;

public class Ubung {
    public static void main(String[] args) {
        String a = "388";
int b = Integer.valueOf(a);
b++;
System.out.println (b); // sollte 389;


int d = 555;
String e = String.valueOf(d);
e += "a";
System.out.println (e);
test();
}



public static int test () {
Scanner scanner = new Scanner (System.in);
while (true) {
try {
String eingabe = scanner.nextLine();
int a = Integer.valueOf(eingabe);
return a; }
catch (Exception e) {
System.out.println ("Ungültige eingabe");
}

    }
}
    }