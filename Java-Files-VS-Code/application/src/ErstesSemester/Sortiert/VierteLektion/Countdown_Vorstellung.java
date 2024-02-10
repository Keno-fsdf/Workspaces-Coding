package Sortiert.VierteLektion;

public class Countdown_Vorstellung {
    public static void main (String[]args) throws InterruptedException {
        for (int Countdown = 15; Countdown>=0; Countdown--) {
        System.out.println(Countdown);
        Thread.sleep(1000);  // 1 sekunde = 1000 milli-seconds
        }




    }
    
}
