package Sortiert.FünfteLektion;

public class NamenFormatieren {
    public static void main (String[]args) {
        System.out.println(formatName("Joe", "Dow"));
        System.out.println(formatNameWithMatriculationNr("Joe", "Dow", 3059688));
        System.out.println(formatNameWithMatriculationNrAndMail("Joe", "Dow", 3059688, "k.schuerger2004@gmail.coom"));

    }
    
    public static String formatName (String firstName, String secondName) {
        return (firstName + ", " + secondName);
    }

    public static String formatNameWithMatriculationNr (String firstName, String secondName, int matriculationNr) {
        return (firstName + ", " + secondName + " (" + matriculationNr + ")");
    }

    public static String formatNameWithMatriculationNrAndMail (String firstName, String secondName, int matriculationNr,String email) {
        return (firstName + ", " + secondName + " (" + matriculationNr + "): " + email);
    }


}
