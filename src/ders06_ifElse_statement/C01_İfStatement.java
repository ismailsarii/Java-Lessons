package ders06_ifElse_statement;

import java.util.Scanner;

public class C01_İfStatement {
    public static void main(String[] args) {


        Scanner scan  = new Scanner(System.in);

        System.out.println("lütfen ay isminin ilk harfini yazın");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O') {
            System.out.println("Ocak");
        }

        if (ilkHarf=='ş' || ilkHarf=='Ş') {
            System.out.println("Şubat");
        }
        if (ilkHarf=='m' || ilkHarf=='M') {
            System.out.println("Mart veya Mayıs");
        }

        if (ilkHarf=='n' || ilkHarf=='N') {
            System.out.println("Nisan");
        }

        if (ilkHarf=='h' || ilkHarf=='H') {
            System.out.println("Haziran");
        }

        if (ilkHarf=='t' || ilkHarf=='T') {
            System.out.println("Temmuz");
        }

        if (ilkHarf=='a' || ilkHarf=='A') {
            System.out.println("Ağustos veya Aralık");
        }

        if (ilkHarf=='e' || ilkHarf=='E') {
            System.out.println("Eylül ve Ekim");
        }

        if (ilkHarf=='k' || ilkHarf=='K') {
            System.out.println("Kasım");
        }
    }
}
