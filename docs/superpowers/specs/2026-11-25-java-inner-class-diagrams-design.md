# Java abstract and anonymous class diagrams

## Goal

Add concise Mermaid documentation for the `AbstractKeyword` and
`AnonymousInnerClass` examples, following the adjacent Markdown documentation
pattern used in `src/java_2`.

## Design

- Add `src/java_3_advance/AbstractKeyword/AbstractKeyword.md` beside its
  `Demo.java`. Explain that `Car` is abstract, `ElectricCar` implements
  `drive()`, and `main` creates an `ElectricCar` through a `Car` reference,
  then calls `drive()` and the inherited `playMusic()`. Include a Mermaid
  diagram showing the type relationship and calls.
- Add `src/java_3_advance/AnonymousInnerClass/AnonymousInnerClass.md` beside
  its `Demo.java`. Explain that the anonymous subclass overrides `show()` and
  that `outer.show()` invokes the override. Include a Mermaid diagram showing
  the object creation and method dispatch.
- Keep both documents self-contained, short, and consistent with existing
  `java_2` notes. Do not modify Java source or unrelated files.

## Validation

Review each diagram against its source and ensure the Mermaid syntax and
documentation accurately describe the example. No Java behavior changes, so
no runtime test is required.
