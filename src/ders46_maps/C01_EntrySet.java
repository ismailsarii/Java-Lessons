package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        // ogrenci map'inde sirali olarak tum ogrencilerin
        // bolum, sinif, sube,  isim soyisim, numaralarini yazdirin

        // onceki iki derste key(Set) ve value(Collection) degrlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde bu islemi yapmak zor olur

        // Bunun icin Java Entry İnterface'ini olusturmustur
        // Entry'ler Key=Value ikilisini 1 Entry olarak kabul ederler


        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6

        ogrenciMap.put(108,"Mehmet-Erkan-12-K-MF");

        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);

        /*
        [
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        ]

        aralarindaki farklar
        1- yukaridaki map, bu set
        2- yukaridakinde {} kullaniyor, bu ise []
        3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
            Entry'de ise key=value ikisi birlikte bir element olusturuyor
         */

        // entry seti icerisindeki entry'leri biz de sira numarasi vererek yazdiralim

        int siraNo=1;

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            System.out.println(siraNo + "-  " + eachEntry);
            siraNo++;

        }

        // Entry'leri kullanarak key'leri yazdirin

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            System.out.println(eachEntry.getKey());

        }


        // Entyr'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa map'ten cikarin

        // tum entry'leri elden gecirelim

        String entryValue;
        String[] entryValueArr;

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {
            // herbir entry'deki value'yu alip parcalayip istenen update'i yapip yeniden map'e eklememiz lazım,

            entryValue=eachEntry.getValue(); // Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-"); // [Ali, Can, 10, H-, F]


            if (entryValueArr[2].equals("12")){
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun Oldu");



            }else {
                // ogrencinin sinifi 12 degilse
                int sinif =Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+""; // "" hiclikle String'e cevirdik [Ali, Can, 11, H-, F]
                eachEntry.setValue( entryValueArr[0]+"-"+
                                    entryValueArr[1]+"-"+
                                    entryValueArr[2]+"-"+
                                    entryValueArr[3]+"-"+
                                    entryValueArr[4]);

            }

        }
        System.out.println(ogrenciMap);

    }
}