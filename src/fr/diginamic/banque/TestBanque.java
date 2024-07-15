package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {

    public static void main(String[] args) {

        Compte perso1 = new Compte(123456, 500);
        System.out.println(perso1); //fr.diginamic.banque.entities.Compte@5f184fc6

        System.out.println(perso1.getSolde());
    }
}
