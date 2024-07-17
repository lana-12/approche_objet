package fr.diginamic.testenumeration;

import fr.diginamic.equals.Ville;

import java.util.ArrayList;

public class TestContinentAvecEnum {

    public static void main(String[] args) {
        Ville capital1 = new Ville("New York", 343000, Continent.AMERIQUE);
        Ville capital2 = new Ville("Paris", 47800, Continent.EUROPE);
        Ville capital3 = new Ville("Pékin", 53400, Continent.ASIE);
        Ville capital4 = new Ville("Moscou", 484000, Continent.EUROPE);
        Ville capital5 = new Ville("Berlin", 9700, Continent.EUROPE);
        Ville capital6 = new Ville("Sydney", 77200, Continent.OCEANIE);
        Ville capital7 = new Ville("Sao Paulo", 850700,Continent.AMERIQUE);
        Ville capital8 = new Ville("Dakar", 40600, Continent.AFRIQUE);


        ArrayList<Ville> capitales = new ArrayList<>();
        capitales.add(capital1);
        capitales.add(capital2);
        capitales.add(capital3);
        capitales.add(capital4);
        capitales.add(capital5);
        capitales.add(capital6);
        capitales.add(capital7);
        capitales.add(capital8);


        for (Ville capital : capitales ) {
           //System.out.println(capital);
            //System.out.println(capital.getContinent());
            String str1 = String.format("La capital %s  se situe sur le continent %s et elle possède %f de nombre d'habitant.", capital.getName(), capital.getContinent(), capital.getNbrHabitant());
            System.out.println(str1);

            //System.out.println("La capital " + capital.getName() + " se situe sur le continent " + capital.getContinent() +", elle possède " + capital.getNbrHabitant() +" de nombre d'habitant. ");
        }
    }
}
