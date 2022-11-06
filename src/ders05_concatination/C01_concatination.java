package ders05_concatination;

public class C01_concatination {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "güzeldir";
        String s3 = "";
        String s4 = " ";

        int sayi1=4;
        int sayi2=3;


        System.out.println(s3+sayi2+sayi1+s4+s1);

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

        // java güzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));

    }
}
