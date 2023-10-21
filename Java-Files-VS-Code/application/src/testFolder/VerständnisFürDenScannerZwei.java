package testFolder;

public class VerständnisFürDenScannerZwei {
    public static void main (String[]args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // int line = scanner.nextInt();
        // int lineZwei = scanner.nextInt();
        // System.out.println(line);
        // System.out.println(lineZwei);

        String line = scanner.nextLine();
        char c = line.charAt(0);
        System.out.println(c);

        scanner.close();


    }
}
