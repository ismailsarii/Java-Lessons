package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir tam sayı giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lütfen ikinci bir tam sayı giriniz");
        int sayi2=scan.nextInt();

        int bos;

        bos=sayi1;

        sayi1=sayi2;

        sayi2=bos;


        System.out.println(sayi1);
        System.out.println(sayi2);
    }
}
