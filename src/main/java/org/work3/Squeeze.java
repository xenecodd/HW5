package org.work3;

import javax.swing.*;

public class Squeeze {
    public static void main(String[] args) {
        String metin = JOptionPane.showInputDialog("Metin giriniz:");
        String metin2 = JOptionPane.showInputDialog("Metin giriniz:");
        StringBuilder yeniMetin = new StringBuilder();

        for (int j = 0; j < metin.length(); j++) {
            char karakter2='.';
            char karakter = metin.charAt(j);
            boolean exist = false;
            for (int i = 0; i < metin2.length(); i++) {
                karakter2 = metin2.charAt(i);
                if (karakter == karakter2) {
                    exist = true;
                }
            }
            if (!exist) {
                yeniMetin.append(karakter);
            }
        }
        System.out.println(yeniMetin);
    }
}
