# StringBufferClass — stack and heap

`sb` keeps the same reference, **101**, while `append`, `deleteCharAt`, `insert`, and `setLength` change that one object. `toString()` copies the characters into a new `String`, so `str` stores **102**.

```mermaid
flowchart LR
  subgraph Stack["Stack — main()"]
    sb["sb = 101"]
    str["str = 102"]
  end

  subgraph Heap["Heap"]
    buf["101<br/>StringBuffer<br/>Mohammad Java Farhad"]
    copy["102<br/>String<br/>Mohammad Java Farhad"]
  end

  sb -->|"101"| buf
  str -->|"102"| copy
```
