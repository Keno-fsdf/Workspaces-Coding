package Sortiert.NeunteLektion;



public class PizzaListe {
    public static void main(String[] args) {
        double[] durchmesserMagarita = {50, 60, 110};  //es ist falsch herum
        double[] preiseMagarita = {5, 7, 10};
        Pizza magarita = new Pizza("Magarita", durchmesserMagarita, preiseMagarita);
        magarita.berechnePreisLeistungsVerhältnis();

        double[] diametersPepperoni = {20, 50, 100};
        double[] pricesPepperoni = {3, 6, 12};
        Pizza pepperoni = new Pizza("Pepperoni", diametersPepperoni, pricesPepperoni);
        pepperoni.berechnePreisLeistungsVerhältnis();

        double[] diametersHawaiian = {35, 65, 95};
        double[] pricesHawaiian = {8, 10, 15};
        Pizza hawaiian = new Pizza("Hawaiian", diametersHawaiian, pricesHawaiian);
        hawaiian.berechnePreisLeistungsVerhältnis();

        double[] diametersVegetarian = {38, 68, 98};
        double[] pricesVegetarian = {7, 9, 13};
        Pizza vegetarian = new Pizza("Vegetarian", diametersVegetarian, pricesVegetarian);
        vegetarian.berechnePreisLeistungsVerhältnis();
    }
    
}
