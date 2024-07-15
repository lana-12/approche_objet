package fr.entities2;



public class Person {

    private String name;
    private String prenom;
    private AdressPostal address;


    public Person(String name, String prenom, AdressPostal address ){

        this.name = name;
        this.prenom = prenom;
        this.address = address;
    }

    public String displayMaj() {
           String maj = this.name.toUpperCase() + " " + this.prenom;
           System.out.println(maj);
            return maj;
    }

    public void displayMaj1() {
     System.out.println(this.name.toUpperCase() + " " + this.prenom);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", address=" + address +
                '}';
    }


}
