package fr.declaration.tableaux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciceTableauChaines {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Montpellier", "Candillargues", "Mauguio", "Mudaison", "Lansargues"));

        for (String element : cities){
            System.out.println(element + '\n');
        }

        //Display size of the cities
        System.out.println("Longueur du Array cities : " + cities.size());

        //Modif element  index [3]
        System.out.println(cities.get(3));
        cities.set(3, "Reims");

        // Display cities after modif
        System.out.println("Cities après modification : " + cities);

    }
}
