package fr.diginamic.banque.entities;

public class Compte {

    private int numeroCompte;
    private double solde;


    public Compte(int numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }



    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    @Override
    public String toString() {
        return "Votre numéro de Compte est " + numeroCompte + "votre solde est de " + solde + " €";
    }
}
