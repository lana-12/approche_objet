package fr.diginamic.banque.entities;

public class Debit extends Operation{

    public Debit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType(){
        return "DEBIT";
    }
}
