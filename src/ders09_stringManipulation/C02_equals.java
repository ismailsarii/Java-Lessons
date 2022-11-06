package ders09_stringManipulation;

public class C02_equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3=new String("Ali");
        String str4="Ali";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false

        System.out.println(str1==str4); // true

        /*
        == String'leri karşılaştırırken beklediğimz sonuçları
        vermeyebilir. Stringlerde metinlerin aynı olup olmadığını
        karşılaştırmak için == yerine equals() kullanılır.
         */


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
