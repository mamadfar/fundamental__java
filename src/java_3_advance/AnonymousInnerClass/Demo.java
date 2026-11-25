package java_3_advance.AnonymousInnerClass;

class OuterClass {
    public void show() {
        IO.println("Outer class show method");
    }
}

public class Demo {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass() {
            @Override
            public void show() {
                IO.println("Anonymous inner class show method");
            }
        };
        outer.show();
    }
}
