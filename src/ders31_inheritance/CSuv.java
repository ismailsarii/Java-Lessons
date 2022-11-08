package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1 = new CSuv();

        System.out.println(suv1.marka); // Binek aracların markasi vardir
        System.out.println(suv1.model); // Binek araclari modeli olur
        System.out.println(suv1.motor); // Tum araclar motor kullanir
        System.out.println(suv1.plaka); // Tum aracların plakasi olur
        System.out.println(suv1.yakit); // Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil);   // 1900

        suv1.hiz("benzin"); // binek araclarin hizi modele gore degisir
        suv1.teker(); // bine araclarin 4 tekeri olur

        CSuv suv2 = new CSuv();
        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.yakit="Benzin";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);

    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli SUV'lar max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'lar max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'lar max 300 km hiz yapar");
        }else {
            System.out.println("yakit beli degil, max hiz soylemem");
        }
    }

}
