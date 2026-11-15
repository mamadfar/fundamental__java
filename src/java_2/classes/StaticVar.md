# StaticVar — stack, heap, and the static field

`obj1` and `obj2` are references on the stack. Each stores a number that points at one `Mobile` object on the heap. `name` is `static`, so there is one copy on the class, shared by both objects.

```mermaid
flowchart LR
  subgraph Stack["Stack — main()"]
    obj1["obj1 = 101"]
    obj2["obj2 = 102"]
  end

  subgraph Heap["Heap"]
    m1["101<br/>Mobile<br/>brand = Apple<br/>price = 1500"]
    m2["102<br/>Mobile<br/>brand = Samsung<br/>price = 1700"]
  end

  subgraph StaticArea["Class Mobile — static"]
    name["name = Phone<br/>one shared copy"]
  end

  obj1 -->|"101"| m1
  obj2 -->|"102"| m2
  m1 -.-> name
  m2 -.-> name
```
