package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.Credit;
import fr.diginamic.banque.entities.Debit;
import fr.diginamic.banque.entities.Operation;

import java.util.ArrayList;
import java.util.List;

public class TestOperation {

    public static void main(String[] args) {

        Operation[] operations = new Operation[4];

        operations[0]= new Credit("16/07/2024", 300);
        operations[1]= new Credit("18/07/2024", 800);
        operations[2]= new Debit("16/07/2024", 1000);
        operations[3]= new Debit("18/07/2024", 200);


        double montantTotal = 0.0;
        for (Operation operation : operations) {
            System.out.println("Date: " + operation.getDateOperation());
            System.out.println("Date: " + operation.getMontant());
            System.out.println("Date: " + operation.getType());

            if (operation instanceof Credit){
                montantTotal += operation.getMontant();
            } else if (operation instanceof Debit){
                montantTotal -= operation.getMontant();
            } else {
                System.out.println("Erreur");
            }
        }
        System.out.println("Montant global des opérations: " + montantTotal);

    }
}
