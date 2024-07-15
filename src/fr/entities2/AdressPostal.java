package fr.entities2;

public class AdressPostal {


    private int numero;
    private String libelle;
    private String zipCode;
    private String city;


    public AdressPostal(int numero, String libelle,String zipCode, String city){
        this.numero = numero;
        this.libelle = libelle;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "AdressPostal{" +
                "numero=" + numero +
                ", libelle='" + libelle + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
