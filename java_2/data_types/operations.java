package java_2.data_types;

public class operations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        System.out.println("Increment num1: " + num1++);
        System.out.println("Decrement num1: " + num1--);
        System.out.println("Increment num1 by 2: " + (num1 += 2));
        System.out.println("Decrement num1 by 2: " + (num1 -= 2));
        System.out.println("Multiply num1 by 2: " + (num1 *= 2));
        System.out.println("Divide num1 by 2: " + (num1 /= 2));

        int num3 = 15;
        int postIncrement = num3++;
        int preIncrement = ++num3;
        System.out.println("Post-increment: " + postIncrement); // fetches the value before incrementing
        System.out.println("Pre-increment: " + preIncrement);   // increments the value before fetching it
    }
}
