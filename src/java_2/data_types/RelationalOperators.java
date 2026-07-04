package java_2.data_types;

public class RelationalOperators {
    int x = 10;
    int y = 20;

    public void compare() {
        System.out.println("x > y: " + (x > y));   // false
        System.out.println("x < y: " + (x < y));   // true
        System.out.println("x >= y: " + (x >= y)); // false
        System.out.println("x <= y: " + (x <= y)); // true
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
    }

    public static void main(String[] args) {
        RelationalOperators relOps = new RelationalOperators();
        relOps.compare();
    }
}
