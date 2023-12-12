package Sortiert.ZwölfteLektion.Übung;

public class ProgrammTester {
    public static void main(String[] args) {
        BinärBäumchen baum = new BinärBäumchen();

        baum.einfuegen(4);
         baum.einfuegen(3);
          baum.einfuegen(2);
           baum.einfuegen(1);
           baum.einfuegen(6);
           baum.einfuegen(5);
            baum.einfuegen(7);

        baum.deleting(6);
        baum.display();
    }
    
}
