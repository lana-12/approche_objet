package fr.algorithmie;

public class SommeDeTableaux {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int sommeArray1 = 0;
        int sommeArray2 = 0;

        for (int element : array1) {
            sommeArray1 += element;
        }
        System.out.println("Le Total de array1 est : " + sommeArray1);

        for (int element : array2) {
            sommeArray2 += element;
        }
        System.out.println("Le Total de array2 est : " + sommeArray2);

        double totalArrays = (double) sommeArray1 + sommeArray2 ;
        System.out.println("Le Total des arrays est : " + totalArrays);

    }
}
