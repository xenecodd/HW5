package org.;

public class ChangeCase {
    public static void changeCase(String[] args) {

        String metin = "Merhaba";
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if(Character.isUpperCase(karakter)){

            }
            System.out.println(karakter);
        }

    }
}