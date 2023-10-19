package testFolder;
public class test2 {
    public static  void main(String[]args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a= scanner.nextInt();

        int ganzzahligTeilbar = 7%a;
        System.out.println("");



        System.out.println(ganzzahligTeilbar);
        System.out.println("");
        countUP(1, 5);
        

        scanner.close();
}





public static int countUP(int n1, int n2){
    if (n1==n2) {
        System.out.println(n1);
        return 0; //End Statement -->We dont need to return a particular value, thats why "0"


    }
    else {
        System.out.println(n1);
        return countUP(n1+1, n2);
    }
    

}



}
