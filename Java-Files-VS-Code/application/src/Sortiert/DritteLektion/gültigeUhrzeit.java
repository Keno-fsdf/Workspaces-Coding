

public class gültigeUhrzeit {
    public static void main(String[] args)  {
        System.out.println("Geben sie die Uhrzeit ein: ");
        System.out.println("hh mm ss");  
   
        
    
        java.util.Scanner scanner = new java.util.Scanner(System.in);
     ;
        
        
        int stunden = scanner.nextInt();
        int minuten = scanner.nextInt();
        int sekunden = scanner.nextInt();
        if (stunden<24 && minuten<60 && sekunden<60)
            System.out.println("Es handelt sich um eine gültig Uhrzeit");
        if (stunden>24 || minuten>60 || sekunden>60){
            System.out.println("Es handelt sich um keine gültige Uhrzeit");
        }


        scanner.close();
} }
