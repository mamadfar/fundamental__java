# StringDataType — stack, heap, and the string pool

Each variable on the stack stores a reference number. `new String(...)` and `+` put a new `String` on the heap. A literal lives in the String Constant Pool, a special area of the heap, and the same literal is one object. `s1` and `s2` both store **202**, so they point at the same pooled `"mohammad"`.

```mermaid
flowchart LR
  subgraph Stack["Stack — main()"]
    name1["name1 = 101"]
    name2["name2 = 201"]
    str1["str1 = 102"]
    s1["s1 = 202"]
    s2["s2 = 202"]
    s3["s3 = 203"]
  end

  subgraph Heap["Heap"]
    n1["101<br/>String<br/>mamad 1"]
    concat["102<br/>String<br/>Mohammad Farhadi"]
  end

  subgraph Pool["String Constant Pool"]
    p2["201<br/>mamad 2"]
    pLower["202<br/>mohammad"]
    pCap["203<br/>Mohammad"]
  end

  name1 -->|"101"| n1
  name2 -->|"201"| p2
  str1 -->|"102"| concat
  s1 -->|"202"| pLower
  s2 -->|"202"| pLower
  s3 -->|"203"| pCap
```
