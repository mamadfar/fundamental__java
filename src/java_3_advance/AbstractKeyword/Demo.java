package java_3_advance.AbstractKeyword;

//* Abstract methods must be inside an abstract class
abstract class Car {
    public abstract void drive();

    public void playMusic() {
        IO.println("Playing music");
    }
}

//* Abstract methods must be implemented by subclasses
class ElectricCar extends Car { //? Concrete subclass

    @Override
    public void drive() {
        IO.println("Driving electric car");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Car car = new Car(); //? This line will cause an error because Car is abstract
        Car car = new ElectricCar();
        car.drive();
        car.playMusic();
    }
}