package ders06_ifElse_statement;

import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");
        char krk = scan.next().charAt(0);

        if (krk >='a' && krk <='z'){
            System.out.println((char)(krk-32));

        }
        else {
            System.out.println(krk);

        }

    }
}
