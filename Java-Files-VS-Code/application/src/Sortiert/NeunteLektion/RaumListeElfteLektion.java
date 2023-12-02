package Sortiert.NeunteLektion;

public class RaumListeElfteLektion {
    public static void main(String[] args) {
        //Raum
        RaumBelegungElfteLektion ersterRaum = new RaumBelegungElfteLektion("1.2.1", 7, 5);



        //Studenten
        StudentElfteLektion ersterStudent = new StudentElfteLektion("Rodrigo", "Sonnleiter", 5454599);
        StudentElfteLektion zweiterStudent = new StudentElfteLektion("Markus", "Fasku", 4958459);
        

        //Studenten betreten den Raum

        ersterRaum.betreteRaum(ersterStudent.getFirstName(), ersterStudent.getMatrikelnummer());
        ersterRaum.betreteRaum(zweiterStudent.getFirstName(), zweiterStudent.getMatrikelnummer());
        String roomPlan = ersterRaum.createCurrentRoomPlan(true);

        

        System.out.println(roomPlan);
        // System.out.println(ersterStudent.getFirstName());



    }
    
}
