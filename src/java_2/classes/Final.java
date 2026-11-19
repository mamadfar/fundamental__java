package java_2.classes;

// final class Calc {
class Calc {
    public final void show() {
        IO.println("In Mohammad");
    }

    public void add(int a, int b) {
        IO.println(a + b);
    }
}

// class AdvCalc extends Calc {}
class AdvCalc extends Calc {
    public void show() {
        IO.println("In John");
    }
}

public class Final {
    public static void main(String[] args) {
        final int num = 8;
        // num = 9;
        IO.println(num);

        AdvCalc obj = new AdvCalc();
        obj.show();
    }
}

//* Stopping Inheritance
//? fianl classes can not be extended
//? final methods can not be overrriding
//? final variables can not be re-assigned