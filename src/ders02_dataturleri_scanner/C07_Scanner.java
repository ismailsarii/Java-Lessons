package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String  soyisim=scan.nextLine();

        System.out.println("yaşınızı giriniz");
        double yas=scan.nextDouble();

        System.out.println("isim : " + (isim) +   "\nsoyisim : " + (soyisim) + "\nyaş : " + (yas) +
                "\nKaydınız Başarıyla Gerçekleşti");
    }
}
