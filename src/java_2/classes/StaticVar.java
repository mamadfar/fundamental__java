package java_2.classes;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        IO.println(brand + " : " + price + " : " + name);
    }

    public static void staticShow(Mobile obj) {
        IO.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticVar {
    static void main() {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.staticShow(obj2);

    }
}
