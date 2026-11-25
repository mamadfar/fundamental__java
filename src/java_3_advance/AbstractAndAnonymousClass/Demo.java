package java_3_advance.AbstractAndAnonymousClass;

abstract class Car {
    public abstract void drive();

    public abstract void playMusic();
}

public class Demo {
    public static void main(String[] args) {
        // Car car = new Car(); //? This line will cause an error because Car is
        // abstract
        Car car = new Car() {

            @Override
            public void drive() {
                IO.println("Driving anonymous car");
            }

            @Override
            public void playMusic() {
                IO.println("Playing music in anonymous car");
            }
        };
        car.drive();
        car.playMusic();
    }
}