package fr.entities2;

import fr.entities.AdressPostal;

public class Person {

    private String name;
    private String prenom;
    private AdressPostal address;


    public Person(String name,String prenom, AdressPostal address){

        this.name = name;
        this.prenom = prenom;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressPostal getAddress() {
        return address;
    }

    public void setAddress(AdressPostal address) {
        this.address = address;
    }




}
