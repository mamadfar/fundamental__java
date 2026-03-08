package java_2.data_types;

public class conversion_and_casing {
    public static void main(String[] args) {
        byte myByte1 = 100;
        int myInt1 = myByte1; // Implicit conversion (byte to int)

        int myInt2 = 1000;
        byte myByte2 = (byte) myInt2; // Explicit conversion (int to byte)

        int myInt4 = 10;
        float myFloatNum2 = myInt4; // Implicit conversion (int to float)

        float myFloatNum1 = 5.99f;
        int myInt3 = (int) myFloatNum1; // Explicit conversion (float to int)

        System.out.println("Implicit conversion (byte to int): " + myInt1);
        System.out.println("Explicit conversion (int to byte): " + myByte2);
        System.out.println("Implicit conversion (int to float): " + myFloatNum2);
        System.out.println("Explicit conversion (float to int): " + myInt3);
    }
    
}
