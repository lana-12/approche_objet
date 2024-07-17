package fr.tri;

import fr.diginamic.equals.Ville;
import java.util.Comparator;

public class VilleComparableNbrHabitant implements Comparator<Ville>{


    public int compare(Ville o1, Ville o2) {
        if(o1.getNbrHabitant() > o2.getNbrHabitant()) {
            return 1;
        }if(o1.getNbrHabitant() < o2.getNbrHabitant()) {
            return -1;
        }
        return 0;
    }
}
