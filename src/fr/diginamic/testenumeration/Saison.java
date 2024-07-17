package fr.diginamic.testenumeration;

import fr.diginamic.equals.Ville;

public enum Saison {

    PRINTEMPS("Printemps",0),
    ETE("Eté",1),
    AUTOMNE("Automne",2),
    HIVER("Hiver",3);

    private String name;
    private int order;

    private Saison(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }


    public static Saison getByName(String libelle) {
        if(libelle != null){
            for (Saison saison : Saison.values()) {
                if (saison.getName().equalsIgnoreCase(libelle)) {
                    return saison;
                }
            }

        }
        return null;
    }
}
