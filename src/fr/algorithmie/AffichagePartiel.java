package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AffichagePartiel {

    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>(Arrays.asList(1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4));

        // Display element >3
        for (int element : myArray){
            if(element > 3 ){
                System.out.println(element);
            }
        }
        System.out.println(" ********** ");

        // Display element >3 et pairs
        for (int element : myArray){
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        System.out.println(" ********** ");
        // Display element >3 et pairs
        for (int element : myArray){
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        System.out.println(" ********** ");
        // Display element with index = pair
        for (int i = 0; i < myArray.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(myArray.get(i));
            }
        }



        System.out.println(" ********** ");

        // Display element pairs
        for (int element : myArray){
            if (element % 2 == 1) {
                System.out.println(element);
            }
        }
        System.out.println(" ********** ");



    }


}
