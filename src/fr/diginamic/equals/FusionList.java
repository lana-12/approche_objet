package fr.diginamic.equals;

import java.util.ArrayList;
import java.util.List;

public class FusionList {

    public static void main(String args[]) {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

    //TODO Développements à réaliser ci-dessous

        List<String> liste3 = new ArrayList<String>();
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        for (String couleur : liste2) {
            liste3.add(couleur);
        }
        System.out.println(liste3);

    }
}
