package java_2.data_types;

public class StringBufferClass {
    static void main() {
        //* StringBuffer is Thread safe and mutable
        StringBuffer sb = new StringBuffer("Mohammad");

        sb.append(" Farhadi!");

        sb.deleteCharAt(16);
        sb.insert(8, " Java");
        sb.setLength(20);

        IO.println(sb);
        
        String str = sb.toString();
        
        IO.println(str);
    }
}
