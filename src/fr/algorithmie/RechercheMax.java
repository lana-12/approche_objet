package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RechercheMax {

    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>(Arrays.asList(1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4));

        System.out.println("Le maximum est: "+ Collections.max(myArray));


    }
}
