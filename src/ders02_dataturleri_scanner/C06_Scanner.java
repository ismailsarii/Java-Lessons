package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("dikdörtgenin uzun ve" +
                "\n kısa kenar uzunluğunu giriniz");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("dikdörtgenin alanı : " + (kenar1*kenar2));



        System.out.println("üçgenin kenar uzunluklarını giriniz");

        double kenar5=scan.nextDouble();
        double kenar6=scan.nextDouble();
        double kenar7=scan.nextDouble();

        System.out.println("ügenin alanı : " + (kenar5*kenar6*kenar7));

    }
}
