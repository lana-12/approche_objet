package fr.tri;

import fr.diginamic.equals.Ville;

import java.util.Comparator;

public class VilleComparableName implements Comparator<Ville>{


    public int compare(Ville o1, Ville o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
