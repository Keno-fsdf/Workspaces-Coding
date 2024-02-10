package Sortiert.KlausuraufgabenÜbung;

public class Timeline {
    Post juengesterPost;


    public void fuegePostEin(Post neuerPost) {
        if (juengesterPost==null)
        juengesterPost = neuerPost;

        else {
            neuerPost.next = juengesterPost;
            juengesterPost = neuerPost;

        }

    }
    public void gibAus () {
        Post current = juengesterPost;
        while (current!=null) {
            System.out.println(current.absender + " -> " + current.empfänger + "\n" + current.text );
            System.out.println();
            current = current.next;
        }

    }


    public static void main(String[] args) {
        Timeline timeline = new Timeline();
    
       
        Post dritterPost = new Post("Frohe Weihnachten", "Alice", "Bob");
        timeline.fuegePostEin(dritterPost);

            Post zweiterPost = new Post("Danke! Guten Rutsch ins Jahr", "Bob", "Alice");
        timeline.fuegePostEin(zweiterPost);

         Post ersterPost = new Post("Gutes neues Jahr!", "Alice", "Bob");
        timeline.fuegePostEin(ersterPost);
     
        timeline.gibAus();



    }
    
}
