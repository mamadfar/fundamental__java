package java_2.classes;

class Calc2 {
    int add(int n1, int n2) {
        return n1+n2;
    }
}

class AdvCalc2 extends Calc2 {
    int add(int n1, int n2) {
        return n1+n2+1;
    }
}

public class Overriding {
    public static void main(String[] args) {
        AdvCalc2 calc = new AdvCalc2();
        IO.println(calc.add(3, 4));
    }
}
