package Sortiert.KlausuraufgabenÜbung;

public class Post {
    String text;
    String absender;
    String empfänger;
    Post next;

    public Post (String text, String absender, String empfänger) {
        this.text = text;
        this.absender = absender;
        this.empfänger = empfänger;
    }

}
