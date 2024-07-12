package fr.algorithmie;

import fr.declaration.variable.DeclarationApp;

public class AffichageIdentite {

    public static void main(String[] args) {

        String lastName = "Giacometti";
        String firstName = "Virginie";

        int nbrDisplay = 10;

        for(int i = 0; i < nbrDisplay; i++){
            System.out.println("Je m" + DeclarationApp.escape + lastName + firstName);
        }
    }
}
