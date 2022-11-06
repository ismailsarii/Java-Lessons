package ders09_stringManipulation;

public class C04_charAt {
    public static void main(String[] args) {


        String str="Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi verir

        System.out.println(str.charAt(5)); // 5.indeks'deki char'ı bize verir


        System.out.println(str.charAt(10));  // sonuncu karakteri yazdırın

        /*
        Bir metindeki karakter sayısı ile
        son indeks arasında bir fark vardır.
        Bu metin için karakter sayısı : 11
                       son indeks : 10'dur.
         */


        System.out.println(str.charAt(11)); // hata verir


    }
}
