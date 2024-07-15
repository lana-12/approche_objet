package fr.utils;

public class TestMethodStatic {

    public static void main(String[] args) {

        String chaine ="12";
        caster(chaine);

        int a = 20;
        int b = 10;
        trouverMax(a,b);

    }

    public static int caster(String chaine) {
        int result = Integer.parseInt(chaine);
        System.out.println(result);
        return result;
    }

    public static int trouverMax(int a, int b) {
        int max = Integer.max(a, b);
        System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);
        return max;
    }


}
