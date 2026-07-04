package java_2;

public class Conditions {
    public static void main(String[] args) {
        int x = 10, y = 21;
        String resutl = y%x==0 ? "Ok" : "not OK";

        System.out.println(resutl);

        if (x > 10) {
            System.out.println("Hello, World!");
            System.out.println("Nice!");
        } else if (y > x)
            System.out.println(String.format("The %s is bigger than %s", y, x));
        else
            System.out.println("Bye, World!");

    }
}