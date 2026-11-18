# Polymorphism

Polymorphism means many behaviours. One name can act in more than one way.

Overloading is compile time. The same class has `add(int, int)` and `add(int)`. The compiler picks from the number of inputs. `add(2, 3)` uses the first and gives 5. `add(4)` uses the second and gives 4.

Overriding is run time. The parent has `add(int, int)`. The child has `add(int, int)` too, with the same inputs. The real object picks the behaviour. A parent object adds the two numbers. A child object adds them and then adds 1.

```mermaid
flowchart TB
  poly[Polymorphism]
  compile[Compile time]
  runtime[Run time]
  overloading[Overloading]
  overriding[Overriding]
  addTwo["add two ints<br/>2 and 3 gives 5"]
  addOne["add one int<br/>4 gives 4"]
  parentAdd["parent add two ints<br/>adds both numbers"]
  childAdd["child add two ints<br/>adds both then adds 1"]
  poly --> compile
  poly --> runtime
  compile --> overloading
  runtime --> overriding
  overloading --> addTwo
  overloading --> addOne
  overriding --> parentAdd
  overriding --> childAdd
```
