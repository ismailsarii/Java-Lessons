package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();

        // 10.satirdan sonra map uzerinde yapacagimiz her degisiklik bu calss'daki
        // ogrencimap'i etkiler.

        // map'in bu halini gorelim
        System.out.println(ogrenciMap);

        // map'e 1 tane yeni element ekleyelim

        ogrenciMap.put(110,"Fatih-Yan-10-T-MF");

        // 102 numarali ogrenciyi update edelim

        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");

        System.out.println(ogrenciMap);

        // 103 nolu ogrencinin isim ve soyismini yazdirin

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103)); // Ali Cem

        // 105 numarali ogrencinin subesini "T" yapin

        ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"T");
        System.out.println(ogrenciMap);


    }
}
