package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {

        //Loop for
        displayNbr(10);
        displayNbrPair(10);
        displayNbrImpair(9);

        //Loop While
        displayNbrWithWhile(10);
        displayNbrPairWithWhile(10);
        displayNbrImpairWithWhile(9);

    }

    /*
    * Display nbre 1 à 10 with loop for
    * */
    public static void displayNbr(int nbr){
        System.out.println("Début function displayNbr");
        for (int i=1; i <= nbr; i++){
            System.out.println(i);
        }
        System.out.println("***********************");
    }

    /*
     * Display nbrePair with loop for
     * */
    public static void displayNbrPair(int nbr){
        System.out.println("Début function displayNbrPair");
        for (int i=1; i <= nbr; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("***********************");
    }

    /*
     * Display nbreImpair with loop for
     * */
    public static void displayNbrImpair(int nbr){
        System.out.println("Début function displayNbrImpair");
        for (int i=1; i <= nbr; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        System.out.println("***********************");
    }

    /*
     * Display nbre 1 à 10 with loop while
     * */
    public static void displayNbrWithWhile(int nbr){
        System.out.println("Début function displayNbrWithWhile");
        int x =1;

        while (x <= nbr){
            System.out.println(x);
            x++;
        }
        System.out.println("***********************");
    }

    /*
     * Display nbrePair with loop while
     * */
    public static void displayNbrPairWithWhile(int nbr){
        System.out.println("Début function displayNbrPairWithWhile");
        int x =1;

        while (x <= nbr){
            if(x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }
        System.out.println("***********************");
    }

    /*
     * Display nbreImpair with loop while
     * */
    public static void displayNbrImpairWithWhile(int nbr){
        System.out.println("Début function displayNbrImpairWithWhile");
        int x =1;

        while (x <= nbr){
            if(x % 2 == 1){
                System.out.println(x);
            }
            x++;
        }
        System.out.println("***********************");
    }

}
