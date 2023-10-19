package Unsortiert;
public class Countdown {
    public static void main (String[]args) throws InterruptedException {
    int countdown = 15;
    while (countdown>0) {
        System.out.println(countdown);
        Thread.sleep(1000); //1000 milliseconds equals 1 second
        countdown--;  //bedeutet countdown = countdown - 1


    }

    }
}
