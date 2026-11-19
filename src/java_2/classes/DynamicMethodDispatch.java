package java_2.classes;

class Computer {
    public void show() {
        IO.println("Computer");
    }
}

class Laptop extends Computer {
    public void show() {
        IO.println("Laptop");
    }
}

class PC extends Computer {
    public void show() {
        IO.println("PC");
    }
}

class Phone {}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        //! Runtime Polymorphism - Dynamic Method Dispatch

        Computer obj = new Computer();
        obj.show();
        
        obj = new Laptop();
        obj.show();

        obj = new PC();
        obj.show();

        // obj = new Phone(); //? The class must be a subclass
    }
}
