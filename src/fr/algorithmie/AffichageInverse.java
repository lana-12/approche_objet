package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AffichageInverse {

    public static void main(String[] args) {

        List<Integer> arrays = new ArrayList<>(Arrays.asList(1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4));

        System.out.println("Affichage du arrays :");
        for (int element : arrays){
            System.out.println(element);
        }

        // Display Array Inverse
        reverseArray(arrays);

        // Copy arrays inversé
        copiArray(arrays);

    }

    /*
     * Display reverse Arrays
     * */
    public static void reverseArray(List<Integer>  array){
        System.out.println("Début function reverseArray");
        Collections.reverse(array);
        System.out.println("Affichage du arrays dans l'ordre inverse :");
        for (int element : array){
            System.out.println(element);
        }
        System.out.println("***********************");
    }

    /*
     * Display reverse Arrays
     * */
    public static void copiArray(List<Integer> array){
        System.out.println("Début function copiArray");
        List<Integer> copiedArrays = new ArrayList<>(array);
        System.out.println("Affichage de la copi :");
        for (int element : copiedArrays){
            System.out.println(element);
        }
        System.out.println("***********************");
    }


}
