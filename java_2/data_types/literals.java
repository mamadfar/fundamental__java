package java_2.data_types;

public class literals {
    public static void main (String[] args) {
        int num1 = 100;
        int num2 = 0b101; // Binary literal (5 in decimal)
        int num3 = 0x1A;  // Hexadecimal literal (26 in decimal)
        int num4 = 0_123; // Underscore for readability (123 in decimal)

        double pi = 56;
        double e = 12e10; // Scientific notation (12 * 10^10)

        boolean isJavaFun = true; // Boolean literal
        boolean isFishTasty = false;

        char a = 'A'; // Character literal
        a++;
        System.out.println(a); // Output: B
    }
}
