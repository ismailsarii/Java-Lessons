package ders31_inheritance;

public class BinekArac extends Arac{

    protected String marka ="Binek aracların markasi vardir";
    protected String model = "Binek araclari modeli olur";
    protected  int yil = 1900;

    protected void hiz(){
        System.out.println("binek araclarin hizi modele gore degisir");
    }

    protected void teker(){
        System.out.println("binek araclarin 4 tekeri olur");
    }
}
