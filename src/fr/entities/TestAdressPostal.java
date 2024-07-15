package fr.entities;

public class TestAdressPostal {

    public static AdressPostal lot1;
    public static AdressPostal lot2;

    public static void main(String[] args) {

        AdressPostal lot1 = new AdressPostal(3, "rue de la tarte", "34130", "Mudaison");
        AdressPostal lot2 = new AdressPostal(6, "rue de la tartus", "34131", "Candillargues");


        System.out.println(lot1.getCity());
    }
}
