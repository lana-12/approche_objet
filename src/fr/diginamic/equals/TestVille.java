package fr.diginamic.equals;

import fr.diginamic.testenumeration.Continent;
import fr.tri.VilleComparableName;
import fr.tri.VilleComparableNbrHabitant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVille {

    public static void main(String[] args) {

        Ville city1 = new Ville("Nice", 343000, Continent.EUROPE);
        Ville city2 = new Ville("Carcassonne", 47800, Continent.EUROPE);
        Ville city3 = new Ville("Narbonne", 53400, Continent.EUROPE);
        Ville city4 = new Ville("Lyon", 484000, Continent.EUROPE);
        Ville city5 = new Ville("Foix", 9700, Continent.EUROPE);
        Ville city6 = new Ville("Pau", 77200, Continent.EUROPE);
        Ville city7 = new Ville("Marseille", 850700,Continent.EUROPE);
        Ville city8 = new Ville("Tarbes", 40600, Continent.EUROPE);


        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(city1);
        villes.add(city2);
        villes.add(city3);
        villes.add(city4);
        villes.add(city5);
        villes.add(city6);
        villes.add(city7);
        villes.add(city8);

        Collections.sort(villes, new VilleComparableNbrHabitant());
        System.out.println("Tri par nbr habiants " + villes);

        Collections.sort(villes, new VilleComparableName());
        System.out.println("Tri par Name " + villes);

        System.out.println("Début du programme " + villes.size());

        // Recherché la ville la plusPeuplé
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbrHabitant() > villePlusPeuplee.getNbrHabitant() ) {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);


        // Recherché la ville la moinPeuplé
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbrHabitant() < villePlusPeuplee.getNbrHabitant() ) {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("Ville la moin peuplée : " + villeMoinsPeuplee);

        // Supprimé la ville la moinPeuplé
        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext()) {
            Ville v = iterator.next();
            if (v.equals(villeMoinsPeuplee)) {
                iterator.remove();
            }
        }


        for (Ville ville : villes) {
            if (ville.getNbrHabitant() > 100000) {
                ville.setName(ville.getName().toUpperCase());
            }
        }


        for (Ville v : villes){
            System.out.println("Array Final " + v);

        }
        System.out.println("Fin du programme " + villes.size());
    }
}
