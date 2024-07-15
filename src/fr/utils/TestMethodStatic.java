package fr.utils;

public class TestMethodStatic {

    public static void main(String[] args) {

        String chaine ="12";
        int result = Integer.parseInt(chaine);

        System.out.println(result);
        System.out.println(chaine);


        int a = 20;
        int b = 10;
        int max = Integer.max(a, b);
        System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);


    }


}
