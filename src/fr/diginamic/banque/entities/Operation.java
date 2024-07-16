package fr.diginamic.banque.entities;

public abstract class Operation {

    protected String dateOperation;
    protected int montant;

    public Operation(String dateOperation, int montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public abstract String getType();
}
