package Sortiert.ElfteLektion;

public class ÜberladenVonMethoden {
    public static void main(String[] args) {
        ausgabe("s");
        ausgabe('s');
        //Unterscheidung der methoden durch die geforderten Argumente    
    }

    public static void ausgabe(String a) {
        System.out.println(a);
    }


        public static void ausgabe(char b) {
        System.out.println(b);
    }
    
}
