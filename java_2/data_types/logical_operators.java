package java_2.data_types;

public class logical_operators {
    int a = 5;
    int b = 10;
    int c = 15;
    int d = 20;

    public void logicalOps() {
        //? Logical AND (&&)
        System.out.println("Logical AND (&&): " + ((a < b) && (c > d))); // false

        //? Logical OR (||)
        System.out.println("Logical OR (||): " + ((a < b) || (c > d))); // true

        //? Logical NOT (!)
        System.out.println("Logical NOT (!): " + !(a < b)); // false
    }

    public static void main(String[] args) {
        logical_operators ops = new logical_operators();
        ops.logicalOps();
    }
}
