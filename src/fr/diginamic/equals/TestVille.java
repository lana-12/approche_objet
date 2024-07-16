package fr.diginamic.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

    public static void main(String[] args) {

        Ville city1 = new Ville("Nice", 343000);
        Ville city2 = new Ville("Carcassonne", 47800);
        Ville city3 = new Ville("Narbonne", 53400);
        Ville city4 = new Ville("Lyon", 484000);
        Ville city5 = new Ville("Foix", 9700);
        Ville city6 = new Ville("Pau", 77200);
        Ville city7 = new Ville("Marseille", 850700);
        Ville city8 = new Ville("Tarbes", 40600);


        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(city1);
        villes.add(city2);
        villes.add(city3);
        villes.add(city4);
        villes.add(city5);
        villes.add(city6);
        villes.add(city7);
        villes.add(city8);

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
