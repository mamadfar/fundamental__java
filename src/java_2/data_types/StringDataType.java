package java_2.data_types;

public class StringDataType {
    static void main() {
        String name1 = new String("mamad 1");
        String name2 = "mamad 2";

        IO.println(name1 + " | " + name2);

        IO.println("--------------------------------------------");

        //*  We have a special area in the Heap for only strings and it's called String Constant Pool
        //* String by default is Immutable and we can not change it, we simply create another object
        String str1 = "Mohammad";
        str1 = str1 + " Farhadi";
        IO.println("Hello " + str1);

        String s1 = "mohammad";
        String s2 = "mohammad";
        String s3 = "Mohammad";

        IO.println(s1 == s2);
        IO.println(s1 == s3);
        IO.println(s3 == str1);
    }
}
