package ders02_dataturleri_scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen bir tam sayı giriniz");
        int tamSayi=scan.nextInt();

        System.out.println("ondalıklı sayi");
        double ondalikliSayi=scan.nextDouble();

        System.out.println("iki sayı çarpımı : " + (tamSayi*ondalikliSayi));

        System.out.println("iki sayı toplamı : " +(tamSayi+ondalikliSayi));

    }
}
