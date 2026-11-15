package java_2.classes;

class Human {
    private int age;
    private String name;
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

public class PrivateAndGetterSetter {
    static void main() {
        Human human = new Human();

        human.setAge(30);
        human.setName("mamad");

        IO.println(human.getName() + " : "+ human.getAge());
    }
}
