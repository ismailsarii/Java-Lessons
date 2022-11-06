package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini alıp büyük harflerle yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen adinizi giriniz");

        String kullaniciAdi= scan.next();


        System.out.println(kullaniciAdi.toUpperCase());
    }
}
