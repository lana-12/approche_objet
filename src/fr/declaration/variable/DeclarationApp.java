package fr.declaration.variable;

public class DeclarationApp {

    public static char escape = '\'';

    public static void main(String[] args) {

        // Type Byte
        byte var1 = 2;
        System.out.println(var1);

        // Type short
        short var2 = 12874;
        System.out.println(var2);

        // Type int
        int var3 = 20;
        System.out.println(var3);

        // Type long
        long var4 = 300000000L;
        System.out.println(var4);

        // Type float
        float var5 = 240.5f;
        System.out.println(var5);

        // Type double
        double var6 = 2563.52;
        System.out.println(var6);

        // Type char
        char var7 = '\n';
        System.out.println(var7);

        // Type String
        String var8 = "Hello Vivi";
        System.out.println(var8);

        String randomString = "Voici le résultat d’un calcul : " + var7 + "1+5=6";
        System.out.println(randomString);

    }
}
