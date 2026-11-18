package java_2.classes.modifiers;

import java_2.classes.modifiers.others.*;

class C extends A {
    public void abc() {
        IO.println(var1); //? Private
        IO.println(var2);
        IO.println(var3);
        IO.println(var4); //? Default
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        IO.println(var1); //? Private
        IO.println(obj.var2);
        IO.println(obj.var3); //? Protected
        IO.println(var4); //? Default

        B obj = new B();
        IO.println(var1); //? Private
        IO.println(obj.var2);
        IO.println(obj.var3);
        IO.println(var4); //? Default
    }
    
}


/* *        Same class      Same package subclass       Same package non-subclass       Different package subclass      Different package non-subclass
*
* Private:      ✔️                  ❌                              ❌                              ❌                              ❌
* Default:      ✔️                  ✔️                              ✔️                              ❌                              ❌ 
* Protected:    ✔️                  ✔️                              ✔️                              ✔️                              ❌ 
* Public:       ✔️                  ✔️                              ✔️                              ✔️                              ✔️ 
*/