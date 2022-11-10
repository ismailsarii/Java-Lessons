package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {


    DCamry(String pc){
        super("deniz");
        System.out.println("String Parametreli Camry");
    }
    DCamry(){
    }
    public static void main(String[] args) {
        // Eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur
        DCamry camry2=new DCamry("celal");


        System.out.println("============");
        DCamry camry1=new DCamry();
        // Parametresiz Araba constructor
        // Parametresiz Toyota Constructor
    }

}
