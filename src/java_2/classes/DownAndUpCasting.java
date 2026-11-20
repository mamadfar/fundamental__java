package java_2.classes;

class C {
    public void show1() {
        IO.println("In C Show");
    }
}

class D extends C {
    public void show2() {
        IO.println("In D Show");
    }
}

//* Down casting and Up casting call Type Casting

public class DownAndUpCasting {
    public static void main(String[] args) {
        C obj1 = (C) new D(); //? Up Casting (from subclass to superclass)
        obj1.show1();

        C obj2 = new D();
        obj2.show1();

        D obj3 = (D) obj2; //? Down Casting (from superclass to subclass)
        obj3.show2();
    }
}
