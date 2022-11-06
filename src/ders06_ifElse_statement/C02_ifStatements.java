package ders06_ifElse_statement;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin");
        int k1=scan.nextInt();
        int k2=scan.nextInt();
        int k3=scan.nextInt();

        if (k1==k2 && k2==k3) {
            System.out.println("eşkenar üçgen");
        }

    }
}
