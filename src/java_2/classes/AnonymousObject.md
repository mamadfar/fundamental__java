# AnonymousObject — referenced and anonymous

`test` stores **101**, so that `Test` stays reachable after `show()` returns. `new Test().show()` also creates an object, **102**, but `main` never stores that reference. It exists only as `this` inside that one `show()` call. When `show()` returns, nothing points at **102**.

```mermaid
flowchart LR
  subgraph MainStack["Stack — main()"]
    test["test = 101"]
  end

  subgraph Show["Stack — show() on the anonymous object"]
    thisRef["this = 102"]
  end

  subgraph Heap["Heap"]
    kept["101<br/>Test<br/>referenced"]
    anon["102<br/>Test<br/>anonymous"]
  end

  test -->|"101"| kept
  thisRef -->|"102"| anon
```
