package fr.declaration.tableaux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciceDeclarationTab {

    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>(Arrays.asList(8, -7, 12, 1, -2, 14, 17, 9));

        System.out.println(myArray);

        //Display index [0] => .get(index souhaité)
        System.out.println("Élément à l'index 0 : " + myArray.getFirst());

        //Display size of the myArray
        System.out.println("Longueur de la liste : " + myArray.size());

        //Display last index of the myArray =>myArray.get(myArray.size() - 1));
        System.out.println("Élément au dernier index : " + myArray.getLast());
    }

}
