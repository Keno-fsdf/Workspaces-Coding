package Sortiert.ElfteLektion;

public class testMathrandom {
    public static void main(String[] args) {
        int a = 0;
        boolean c = false;
        while (a<1000) {
        a++;
        int b = (int) (Math.random()*49+1);
        if (b==49)  c = true;
        System.out.println(b);}

        System.out.println(c);

    }
    
}
