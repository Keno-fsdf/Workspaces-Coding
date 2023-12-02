
import java.util.Scanner;
import java.util.regex.Pattern;
public class VerständnisFürDenScannerZwei {
    
    public static void main(String[] args) {
  Scanner scnObj = new Scanner(System.in);
    System.out.println("enter 3 letters");
    String input1 = null;
    do {
        input1 = scnObj.next();
        if ((!Pattern.compile("[a-zA-Z]{1}").matcher(input1).matches())) {
            System.out.println("Please try again.");
        }
    } while (!Pattern.compile("[a-zA-Z]{1}").matcher(input1).matches());

    System.out.println("enter 2nd letter");
    }
}
