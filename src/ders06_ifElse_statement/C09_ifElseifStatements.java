package ders06_ifElse_statement;

import java.util.Scanner;

public class C09_ifElseifStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir tam sayı girin");

        int s1=scan.nextInt();

        if (s1<0) {
            System.out.println("geçersiz sayı");
        }
        else if (s1<10) {
            System.out.println("rakam");
        }
        else if (s1<100) {
                System.out.println("iki basamaklı sayı");
            }
        else {
                System.out.println("büyük sayı");
            }

        }
    }

