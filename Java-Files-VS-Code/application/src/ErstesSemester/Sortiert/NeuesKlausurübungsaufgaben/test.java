package Sortiert.NeuesKlausurübungsaufgaben;

public class test {
    public static void main(String[] args) {
    // String str = "1-23-5555-88";
    // int intValue = Integer.valueOf(str);
    // System.out.println(intValue);


































    int b = 24589; //die 8 soll weg
    String c = String.valueOf(b);
    // c+= "k";
    System.out.println(c);

    char[] ziffern = c.toCharArray();
    String d = "";

    for (char element: ziffern) {
        if (element!='8') {
            d+=element;

        }
    }

    int e = Integer.valueOf(d);
    System.out.println(e+ 2);































    // String a = "";

    // char[] array = str.toCharArray();
    // for (char element : array) {
    //     if (element!= '-') {
    //         a+=element;

    //     }

    // }

    // System.out.println(a);



    }
}
