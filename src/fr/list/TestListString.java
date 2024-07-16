package fr.list;

import fr.diginamic.equals.Ville;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListString {

    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>();
            villes.add("Nice");
            villes.add("Carcassonne");
            villes.add("Narbonne");
            villes.add("Lyon");
            villes.add("Foix");
            villes.add("Pau");
            villes.add("Marseille");
            villes.add("Tarbes");

        String villePlusLongue = "";
        for (String ville : villes) {
            if (ville.length() > villePlusLongue.length()) {
                villePlusLongue = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villePlusLongue);


        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()) {
            String v = iterator.next();
            if (v.startsWith("N")) {
                iterator.remove();
            }
        }

        System.out.println("Result du ArrayList Final " + villes);
    }
}
