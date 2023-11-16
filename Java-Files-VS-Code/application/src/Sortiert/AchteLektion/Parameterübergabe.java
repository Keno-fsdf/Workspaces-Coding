package Sortiert.AchteLektion;

public class Parameterübergabe {
    

        public static void main (String[] args) throws Exception {
        
        if (args.length>2) {
        System.err.println("Bitte geben sie nur zwei werte ein");
        throw new Exception ("Bitte geben sie nur zwei Wert ein");
        //return;
        }
        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println (args[1]);
        
        
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int ergebnis = a*b;
        System.out.println(ergebnis);
        
        
        
        }
        }

