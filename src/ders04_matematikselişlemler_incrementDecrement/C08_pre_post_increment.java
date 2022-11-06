package ders04_matematikselişlemler_incrementDecrement;

public class C08_pre_post_increment {

    public static void main(String[] args) {

        int x = 3;

        int y = 2* ++x;

        int z = 5 + y--;

        System.out.println(x+y+z);


        int a = 20;

        int b = ++a;

        int c = b--;

        int d = --c;

        System.out.println(a+b+c+d);
    }
}
