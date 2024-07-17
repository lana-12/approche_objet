package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {

        Saison[] saisons = Saison.values();
        String nom = "ETE" ;
        String libelle = "Hiver";

        System.out.println(Saison.valueOf(nom));

        Saison saisonHiver = Saison.getByName(libelle);
        System.out.println(saisonHiver);

        for (Saison saison : saisons){
            System.out.println(saison.getName());
        }
    }
}
