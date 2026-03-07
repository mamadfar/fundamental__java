package java_2.data_types;

public class primitives {
    byte myByte = 100;          // Byte - 1 byte --> -128 to 127
    short myShort = 5000;       // Short - 2 bytes --> -32,768 to 32,767 (-2^15 to 2^15-1)
    int myNum = 5;              // Integer - 4 bytes --> -2^31 to 2^31-1
    long myLong = 15000000000L; // Long - 8 bytes --> -2^63 to 2^63-1

    float myFloatNum = 5.99f;   // Floating point number - 4 bytes --> 6 to 7 decimal digits
    double myDoubleNum = 10.99; // Double precision floating point number - 8 bytes --> 15 decimal digits

    char myLetter = 'D';        // Character - 2 bytes --> single character or Unicode character

    boolean myBool = true;      // Boolean - 1 bit --> true or false

    static void main(String[] args) {
        primitives p = new primitives();
        System.out.println("Byte value: " + p.myByte);
        System.out.println("Short value: " + p.myShort);
        System.out.println("Integer value: " + p.myNum);
        System.out.println("Long value: " + p.myLong);

        System.out.println("Float value: " + p.myFloatNum);
        System.out.println("Double value: " + p.myDoubleNum);

        System.out.println("Character value: " + p.myLetter);
        
        System.out.println("Boolean value: " + p.myBool);
    }
}
