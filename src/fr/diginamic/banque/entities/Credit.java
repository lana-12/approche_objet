package fr.diginamic.banque.entities;

public class Credit extends Operation{

    public Credit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType(){

        return "CREDIT";
    }

}
