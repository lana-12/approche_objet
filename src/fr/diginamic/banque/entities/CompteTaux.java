package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{

    private double taux;

    public CompteTaux(int numeroCompte, double solde, double taux) {
        super(numeroCompte, solde);
        this.taux = taux;
    }


    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " avec un taux à " + this.taux;
    }



}
