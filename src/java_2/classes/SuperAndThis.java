package java_2.classes;

class A extends Object { //? All classes by default extends from Object

    A() {
        super(); //? super() and default constructor are always there even we don't write them
        IO.println("A - Default Constructor");
    }
    A(int n) {
        super();
        IO.println("A - Parameterized Constructor : " + n);
    }
}

class B extends A{

    B() {
        super();
        IO.println("B - Default Constructor");
    }
    B(int n) {
        // super(n);
        this();
        IO.println("B - Parameterized Constructor : " + n);
    }
}

public class SuperAndThis {
    static void main() {
        B b1 = new B();
        B b2 = new B(10);
    }
}
