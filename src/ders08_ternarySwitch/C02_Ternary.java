package ders08_ternarySwitch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1 = "ALİ";
        String str2 = "ali";

        if (str1.equals((str2))){
            System.out.println("metinler aynı");
        }else {
            System.out.println("metinler farklı");
        }


        System.out.println(str1.equals((str2)) ? "metinler aynı" : "metinler farklı");
    }
}
