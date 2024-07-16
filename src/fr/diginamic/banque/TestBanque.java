package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBanque {

    public static void main(String[] args) {

        Compte perso1 = new Compte(123456, 500);
//        System.out.println(perso1); //fr.diginamic.banque.entities.Compte@5f184fc6
//        System.out.println(perso1.getSolde());

        CompteTaux perso2 = new CompteTaux(145698, 800, 5);

        System.out.println(perso1.getSolde());
        System.out.println(perso2.getSolde());

        List<Compte> comptes = new ArrayList<>();
        comptes.add(perso1);
        comptes.add(perso2);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }

    }
}
