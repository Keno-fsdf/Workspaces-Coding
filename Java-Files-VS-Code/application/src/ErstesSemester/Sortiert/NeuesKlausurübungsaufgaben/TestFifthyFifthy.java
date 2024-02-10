package Sortiert.NeuesKlausurübungsaufgaben;

public class TestFifthyFifthy {

    public static boolean fifthy() {
        return Math.random()<0.5;}
    public static void main(String[] args) {
        int wahr = 0;
    int falsch = 0;
    for (int i = 1; i<=1000000000;i++) {
    if (fifthy())  wahr++;
    else  falsch++; }

    System.out.println("Wahr: " + wahr);
    System.out.println("Falsch: " + falsch);
    }
}
