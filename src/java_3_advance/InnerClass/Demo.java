package java_3_advance.InnerClass;

class OuterClass {
    
    int age;

    public void show() {
        IO.println("Outer class show method");
    }

    class InnerClass {
        public void display() {
            IO.println("Inner class display method");
        }
    }

    //* Only the inner class can be defined as static if needed
    static class StaticInnerClass {
        public void display() {
            IO.println("Static inner class display method");
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.show();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();
    }
}
