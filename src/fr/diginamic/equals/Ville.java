package fr.diginamic.equals;


import fr.diginamic.testenumeration.Continent;

public class Ville {

    private String name;
    private double nbrHabitant;
    private Continent continent;

    public Ville(String name, double nbrHabitant, Continent continent) {
        this.name = name;
        this.nbrHabitant = nbrHabitant;
        this.continent = continent;
    }



    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Ville ville)) return false;

        // avec cette facon avec Objects.equals il va gérer le cas ou null
       // return Double.compare(nbrHabitant, ville.nbrHabitant) == 0 && Objects.equals(name, ville.name);

        Ville other = (Ville) object;

        return this.name.equals(other.getName()) && this.nbrHabitant == other.getNbrHabitant();

    }


    @Override
    public String toString() {
        return "Ville{" +
                "name='" + name + '\'' +
                ", nbrHabitant=" + nbrHabitant +
                ", continent=" + continent +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNbrHabitant() {
        return nbrHabitant;
    }

    public void setNbrHabitant(double nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
