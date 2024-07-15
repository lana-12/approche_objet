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


    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
