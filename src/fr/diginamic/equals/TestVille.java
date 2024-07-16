package fr.diginamic.equals;

public class TestVille {

    public static void main(String[] args) {

        Ville city1 = new Ville("Montpellier", 123698);
        Ville city2 = new Ville("Montpellier", 123698);

        boolean result = city1.equals(city2);
        System.out.println(result);
    }
}
