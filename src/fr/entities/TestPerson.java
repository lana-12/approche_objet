package fr.entities;

import fr.entities2.AdressPostal;
import fr.entities2.Person;

public class TestPerson {


    public static void main(String[] args) {

        AdressPostal adr1 = new AdressPostal(3, "rue de la tarte", "34130", "Mudaison");
        AdressPostal adr2 = new AdressPostal(6, "rue de la tartus", "34131", "Candillargues");
        Person pers1 = new Person("Giac", "Vivi", adr1);


        Person pers2 = new Person("Giaco", "Lana", adr2);
        adr2.setCity("Mauguio");


        pers1.displayMaj();
        pers1.displayMaj1();

        System.out.println(pers2.getAddress());
    }

}
