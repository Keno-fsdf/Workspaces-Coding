package Sortiert.NeuesKlausurübungsaufgaben;

public class ToolBox {
    public static void prettyPrint (String a, String b) {
    String ergebnis ="";
    if (a.compareTo(b)>0) { ergebnis += a+b; } 
    else {ergebnis += b+a; }
    System.out.println (ergebnis); }
    
    public static void main (String [] args) { 
    prettyPrint ("hallof", "apfelff"); }}
