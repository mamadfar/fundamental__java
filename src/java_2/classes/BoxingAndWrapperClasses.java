package java_2.classes;

public class BoxingAndWrapperClasses {
    public static void main(String[] args) {
        
        int num = 7;
        Integer num1 = num; //? It is called boxing (Autoboxing) and it happens when we assign a Primitive type value to an Object (which Java will do it by default)

        int num2 = num1.intValue(); //? Unboxing - Java will do it automatically like line below
        num2 = num1; //? Auto-Unboxing

        IO.println(num1);
        IO.println(num2);
        
        String str = "12";
        int num3 = Integer.parseInt(str);
        IO.println(num3);
    }
}
