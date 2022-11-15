package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis =new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileInputStream fos =new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        // Java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        // FileImputStream class'ıdan obje olusturup
        // o obje araciligiyla dosyayi kullanabiliriz

        // fis olustururken ulasmak istedigimiz dosyanin dosya yolunu
        // parametre olarak girmeliyiz

        /*
            Checked exception olusturma ihtimali olan kodlari yazdirdigimizda
            java compile time orada bir hata ihtimalini gorur ve kodun altini kirmizi olarak cizer

            bu durumda kirmizi cizgiyi kaldirmak icin iki yontem vardir
            1- exception'ı try catch blogu ile handle etmek
            2- Java'ya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimizi
                ve calismaya devam etmesini istedigimizi soylemek için
                method signature'a method declarasyonu ile curly braces arasına throws keyword
                ve beklenen exceptıon turu yazılabilir
         */
    }
}
