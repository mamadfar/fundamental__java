# AbstractKeyword — abstract class and implementation

`Car` is abstract, so `main` cannot instantiate it directly. `ElectricCar`
implements the abstract `drive()` method. `main` stores an `ElectricCar` in a
`Car` reference, then calls the implementation and the inherited `playMusic()`.

```mermaid
flowchart TD
  car["abstract Car<br/>drive() abstract<br/>playMusic() concrete"]
  electric["ElectricCar extends Car<br/>implements drive()"]
  main["main()"]
  electric -->|"extends"| car
  main -->|"Car car = new ElectricCar()"| electric
  main -->|"car.drive()"| electric
  main -->|"car.playMusic()"| car
```
