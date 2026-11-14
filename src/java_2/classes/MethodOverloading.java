package java_2.classes;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, int b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println("Result: " + result);
    }
}
