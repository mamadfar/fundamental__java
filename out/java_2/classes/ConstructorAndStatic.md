# ConstructorAndStatic — ClassLoader, static, constructor

The first `new Mobile()` makes the ClassLoader load `Mobile`. The static block runs then, once for the class, and sets `name`. The constructor runs only after that, once for each object. The second `new` does not load the class again and does not run the static block.

```mermaid
flowchart TD
  a["First new Mobile()"] --> b["ClassLoader loads Mobile"]
  b --> c["Static block runs once<br/>name = Phone"]
  c --> d["Constructor runs<br/>obj1 = 101"]
  d --> e["Second new Mobile()"]
  e --> f["Constructor runs again<br/>obj2 = 102<br/>static block does not run"]
```

After both objects exist, the stack holds the two references. `brand` and `price` are on each heap object. `name` stays on the loaded class.

```mermaid
flowchart LR
  subgraph Stack["Stack — main()"]
    obj1["obj1 = 101"]
    obj2["obj2 = 102"]
  end

  subgraph Heap["Heap"]
    m1["101<br/>Mobile<br/>brand = ''<br/>price = 200"]
    m2["102<br/>Mobile<br/>brand = ''<br/>price = 200"]
  end

  subgraph ClassArea["Class Mobile — loaded once"]
    name["static name = Phone"]
  end

  obj1 -->|"101"| m1
  obj2 -->|"102"| m2
```
