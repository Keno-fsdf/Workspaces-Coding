package Sortiert.KlausurÜbungsaufgabenZwe;

public class Polonaise {
    Roboter kopf;

    public Polonaise() {

    }

    public void anhaengen(Roboter roboter) {
        if (kopf == null || kopf.getGroeße() > roboter.getGroeße()) {
            roboter.setNachfolger(kopf);
            kopf = roboter;
            
        } else {
            Roboter current = kopf;
            while (current.getNachfolger() != null && current.getNachfolger().getGroeße() < roboter.getGroeße()) {
                current = current.getNachfolger();
            }
            roboter.setNachfolger(current.getNachfolger());
            current.setNachfolger(roboter);
        }
    }
    

    public void vorstellen() {
        Roboter current = kopf;
        while (current!=null) {
            System.out.println(current);
            current = current.getNachfolger();

        }

    }


    public static void main(String []args) {
        Roboter ersterRoboter = new Roboter("Kaka", 190);
        Roboter zweiterRoboter = new Roboter("Melinaaa", 180);
        Roboter dritterRoboter = new Roboter("Markus", 175);
        Polonaise schlange = new Polonaise();
       
        schlange.anhaengen(ersterRoboter);
        schlange.anhaengen(zweiterRoboter);
         schlange.anhaengen(dritterRoboter);
        schlange.vorstellen();

    }
    
    
}
