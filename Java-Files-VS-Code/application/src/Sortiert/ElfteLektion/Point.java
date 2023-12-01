package Sortiert.ElfteLektion;

public class Point {
    // Attribute
    private double x;
    private double y;

    // Konstruktor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter für x-Koordinate
    public double getX() {
        return x;
    }

    // Getter für y-Koordinate
    public double getY() {
        return y;
    }

    // Beispiel für die Verwendung der Klasse
    public static void main(String[] args) {
        // Ein Punkt mit den Koordinaten (2.5, 3.0) erstellen
        Point point = new Point(2.5, 3.0);

        // Die Koordinaten abrufen und ausgeben
        System.out.println("X-Koordinate: " + point.getX());
        System.out.println("Y-Koordinate: " + point.getY());
    }
}

