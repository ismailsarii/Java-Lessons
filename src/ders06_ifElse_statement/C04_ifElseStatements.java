package ders06_ifElse_statement;

import java.util.Scanner;

public class C04_ifElseStatements {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");
        char krk = scan.next().charAt(0);

        if (krk >='A' && krk <='Z'){
            System.out.println("karakter büyük harf");
        } else {
            System.out.println("karaketr büyük harf değil");
        }

    }
}
