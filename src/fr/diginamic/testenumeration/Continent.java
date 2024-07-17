package fr.diginamic.testenumeration;

public enum Continent {

    EUROPE("Europe"),
    AMERIQUE("Amérique"),
    OCEANIE("Océanie"),
    ASIE("Asie"),
    AFRIQUE("Afrique");

    private String libelle;

    private Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
