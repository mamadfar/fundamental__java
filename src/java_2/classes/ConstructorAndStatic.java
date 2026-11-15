package java_2.classes;

class Mobile {
    String brand;
    int price;
    static String name;

    //? First a class will be loaded in Class Loader, then an object will created, so first Static will be called then Constructor

    //* Static will be called only once per each class
    static {
        name = "Phone";
        IO.println("--- Static called ---");
    }
    
    Mobile() {
        brand = "";
        price = 200;
        IO.println("--- Constructor called ---");
    }

    public void show() {
        IO.println(brand + " : " + price + " : " + name);
    }

    public static void staticShow(Mobile obj) {
        IO.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class ConstructorAndStatic {
    static void main(String a[]) throws ClassNotFoundException {

        //* ForName will force a class to be loaded in Class Loader
        // Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;
        // Mobile.name = "Phone";

        // obj1.show();
        // obj2.show();

        // Mobile.staticShow(obj2);
    }
}
