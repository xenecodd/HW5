package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String metin = "Merhaba";
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if(Character.isUpperCase(karakter)){

            }
            System.out.println(karakter);
        }

    }
}