package ders06_ifElse_statement;

import java.util.Scanner;

public class C05_ifElseStatement {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextInt();

        if (yas>=65) {
            System.out.println("yaşınız emeklilik için yeterli");
        }
        else
        System.out.println("yaşınız emeklilik için yeterli değildir" +"\n" + (65-yas) + " yıl daha çalışmalısınız");
    }
}
