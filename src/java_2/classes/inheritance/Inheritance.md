# Inheritance — folders, packages, and subclasses

`Inheritance.java` stays in `inheritance` and belongs to `java_2.classes.inheritance`. `Calc`, `AdvCalc`, and `VeryAdvCalc` are in the `packages` folder, so their package is `java_2.classes.inheritance.packages`. `import java_2.classes.inheritance.packages.*` brings in the classes in that package only, not classes in a deeper folder.

`Calc` is the superclass. `AdvCalc` extends it and keeps `add` and `sub`. `VeryAdvCalc` extends `AdvCalc` and keeps `add`, `sub`, `multi`, and `div`. `main` creates a `VeryAdvCalc`, so it can call all five methods.

```mermaid
flowchart TB
  subgraph inh["inheritance / java_2.classes.inheritance"]
    main["Inheritance.java<br/>import packages.*<br/>new VeryAdvCalc()"]
  end

  subgraph pkg["packages / java_2.classes.inheritance.packages"]
    calc["Calc<br/>add, sub"]
    adv["AdvCalc<br/>multi, div"]
    very["VeryAdvCalc<br/>power"]
  end

  very -->|"extends"| adv
  adv -->|"extends"| calc
  main -->|"uses"| very
```
