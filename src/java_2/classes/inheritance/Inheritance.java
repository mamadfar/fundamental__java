package java_2.classes.inheritance;

import java_2.classes.inheritance.packages.*; //? Import all the files inside the packages folder (only the files, not folders)


public class Inheritance {
    static void main() {
        
        VeryAdvCalc calc = new VeryAdvCalc();

        int r1 = calc.add(4, 2);
        int r2 = calc.sub(8, 3);
        int r3 = calc.multi(3, 5);
        int r4 = calc.div(20, 4);
        double r5 = calc.power(2, 3);

        IO.println(r1 + " | " + r2 + " | " + r3 + " | " + r4 + " | " + (int) r5);
    }
}
