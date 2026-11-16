# Inheritance — superclass and subclasses

`Calc` is the superclass. `AdvCalc` extends `Calc`, so it is the subclass and it keeps `add` and `sub`. `VeryAdvCalc` extends `AdvCalc`, so it keeps `add`, `sub`, `multi`, and `div`, and adds `power`.

```mermaid
classDiagram
  Calc <|-- AdvCalc
  AdvCalc <|-- VeryAdvCalc

  class Calc {
    add(n1, n2)
    sub(n1, n2)
  }
  class AdvCalc {
    multi(n1, n2)
    div(n1, n2)
  }
  class VeryAdvCalc {
    power(n1, n2)
  }
```
