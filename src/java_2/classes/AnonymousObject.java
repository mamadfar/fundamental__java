package java_2.classes;

class Test {
    Test() {
        IO.println("Object created!");
    }

    void show() {
        IO.println("Show...");
    }
}

public class AnonymousObject {

    static void main() {
        Test test = new Test(); //? Referenced Object
        test.show();

        new Test().show(); //? Anonymous Object - Only use when you wanna call something once and don't call the class again
    }

}
