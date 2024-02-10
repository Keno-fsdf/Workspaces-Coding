package Sortiert.NeunteLektion;

public class Pizza {
    public static double[] preisLeistungsVerhältnis;
    private String name;
    private double [] durchmesser;
    private double [] preis;

    //noch was für das beste PreisLeistungsVerhältnis machen

    public Pizza(String name, double []durchmesser, double [] preis) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    //Würde hier auch sinn Machen "void" anstatt double[] zu machen
    public double[] berechnePreisLeistungsVerhältnis () { //double durchmesser[], double[] preis
        int zwischenspeicherFürBesteKombination = 0;
        double bestesPreisLeistungsVH =durchmesser[0] /preis[0]; // wir sagen jetzt zunächst das der erste wert das beste Preisleistungsverhältnis hat
        for (int i = 1; i<durchmesser.length; i++) {
            double PreisLeistungsVH = preis[i]/durchmesser[i];
            if (bestesPreisLeistungsVH>PreisLeistungsVH) {
                bestesPreisLeistungsVH = PreisLeistungsVH;
                zwischenspeicherFürBesteKombination = i;
            }
            

        }
        double[] pizzaBestesPreisLeistung = {preis[zwischenspeicherFürBesteKombination], durchmesser[zwischenspeicherFürBesteKombination]};
        System.out.println(name +"pizza mit bestem PLVH hat einen Preis von: " + pizzaBestesPreisLeistung[0] +" Euro"+ " und einen Durchmesser von: " + pizzaBestesPreisLeistung[1]+ "cm");
        return pizzaBestesPreisLeistung;

    }

}
