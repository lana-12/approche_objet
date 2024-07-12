package fr.algorithmie;


public class InversionContenu {

    public static void main(String[] args) {

        int[] arrays = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Display arrays
        System.out.println("Éléments du tableau original :");
        for (int element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Display arraysCopi
        reverseArrayCopi(arrays);

    }


    /*
     * Create arrays ds le sens inverse
     * */
    public static void reverseArrayCopi(int[] array){
        System.out.println("Début function reverseArray");
        int[] arraysCopi = new int[array.length];

        // Copie du arrays
        for (int i = 0; i < array.length; i++) {
            arraysCopi[i] = array[array.length - 1 - i];
        }
        //Display ArrayCopi
        for (int element : arraysCopi) {
            System.out.print(element + " ");
        }
    }

}
