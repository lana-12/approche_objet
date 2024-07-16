package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        String nom = "Vivi";
        int age = 26;

        StringBuilder builder = new StringBuilder();
        builder.append("bonjour je suis ").append(nom);
        String chaine = builder.toString();
        System.out.println(chaine);

        // Avec StringBuilder
        long startTimeSb = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long endTimeSb = System.currentTimeMillis();
        long durationSb = endTimeSb - startTimeSb;

        System.out.println("Temps avec StringBuilder: " + durationSb + " ms");

        // Avec String
        long startTimeStr = System.currentTimeMillis();

        String str = "";
        for (int i = 1; i <= 100000; i++) {
            str += i;
        }

        long endTimeStr = System.currentTimeMillis();
        long durationStr = endTimeStr - startTimeStr;

        System.out.println("Temps avec String: " + durationStr + " ms");
    }
}
