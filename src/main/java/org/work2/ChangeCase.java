package org.work2;

import javax.swing.*;

public class ChangeCase {
    public static void main(String[] args) {

        String metin = JOptionPane.showInputDialog("Metin giriniz:");
        StringBuilder yeniMetin = new StringBuilder();

        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if (Character.isUpperCase(karakter)) {
                karakter = Character.toLowerCase(karakter);
            } else if (Character.isLowerCase(karakter)) {
                karakter = Character.toUpperCase(karakter);
            }
            yeniMetin.append(karakter);
        }

        System.out.println("Orijinal metin: " + metin);
        System.out.println("Küçük harfle dönüştürülmüş metin: " + yeniMetin.toString());
    }
}
