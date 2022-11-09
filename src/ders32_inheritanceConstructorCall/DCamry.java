package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {


    DCamry(String pc){
        super("deniz");
    }

    public static void main(String[] args) {
        // Eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur
        DCamry camry1=new DCamry();

    }

}
