package java_2.classes;

class Human {
    private int age;
    private String name;

    public Human() { //? Default Constructor
        this.age = 12;
        this.name = "kalim";
    }
    public Human(int age, String name) { //? Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class ConstructorOverloading {
    static void main() {
        Human human1 = new Human();
        Human human2 = new Human(30, "mamad");

        IO.println(human1.getAge() + " : " + human1.getName());
        IO.println(human2.getAge() + " : " + human2.getName());
    }
}
