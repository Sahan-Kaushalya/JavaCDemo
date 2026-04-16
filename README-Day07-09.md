# JavaCDemo - Day 07 to Day 09 Theory & Examples

This document serves as an extension of the main JavaCDemo repository, specifically covering advanced object-oriented programming concepts introduced between Day 07 and Day 09.

---

## Day 07: Static vs. Instance Members & Initializer Blocks

### 1. Static vs. Instance Variables & Methods

#### Static Members (Class Level)
- **What they are:** Variables and methods declared with the `static` keyword belong to the **class itself**, not to any specific object (instance) created from the class.
- **Memory Allocation:** They are loaded into memory only once when the class is first loaded by the JVM. All objects of that class share this single copy.
- **Access:** You can access static members directly using the class name (e.g., `ClassName.staticMethod()`), without needing to create an object using the `new` keyword.

#### Instance Members (Object Level)
- **What they are:** Variables and methods declared *without* the `static` keyword belong to a specific **instance** (object) of the class.
- **Memory Allocation:** Every time you create a new object using the `new` keyword, a fresh copy of all instance variables is created in memory for that specific object.
- **Access:** You must create an object first to access instance members (e.g., `myObject.instanceMethod()`).

### 2. Initializer Blocks

In Java, initializer blocks are used to initialize variables. They are blocks of code executed during the loading of a class or the creation of an object.

#### Static Initializer Block (`static { ... }`)
- **Execution:** Runs exactly **once** when the class is first loaded into memory by the ClassLoader, before the `main` method or any objects are created.
- **Purpose:** Used strictly to initialize `static` variables or perform complex setup operations that only need to happen once for the entire class.
- **Rule:** A static block can only access other static members. It cannot access instance variables or `this`.

#### Instance Initializer Block (`{ ... }`)
- **Execution:** Runs **every time** an object is created, but *before* the constructor finishes executing.
- **Purpose:** Used to initialize instance variables, especially when you have multiple constructors that share the same initialization logic. Instead of duplicating the code in every constructor, you put it in an instance block.

#### Execution Order Example (From `StaticAndInstanceInitializersDemo.java`)
1.  **Static Blocks** run first (only once).
2.  **Instance Blocks** run next (every time an object is created).
3.  **Constructors** run last.

**Expected Output:**
```text
Static Initializer Block Executed
10
200
190
1990
Main Method Started
Instance Initializer Block Executed
Constructor Executed
Static Method Executed
Instance Method Executed

Instance Initializer Block Executed
Constructor Executed
```

---

## Day 08: Inheritance, `super`, & Constructor Chaining

### 1. Inheritance
Inheritance is an OOP concept where one class (the **Child** or Subclass) acquires the properties and methods of another class (the **Parent** or Superclass) using the `extends` keyword.
- **Purpose:** Promotes code reusability. For example, `CalculatorAdv` inherits the core math functions (`add`, `subtract`) from the base `Calculator` class but can add new functions like `multiply()`.

### 2. The `super` Keyword
The `super` keyword in Java is a reference variable used to refer to an immediate parent class object.

#### Uses of `super`:
1.  **`super.variable`:** Used to access a parent class's variable if it is hidden by a child class's variable (variable shadowing).
2.  **`super.method()`:** Used to invoke a parent class's method. This is highly useful when a child class overrides a method but still needs to execute the parent's version of that method (e.g., `super.add(a, b)`).
3.  **`super()`:** Used to invoke the parent class's constructor. This must be the **very first statement** inside the child class's constructor. (e.g., `super("New SK Calculator", "Model SKV", 2.0);`).

### 3. Access Modifiers & Inheritance
From `Calculator.java`:
- `public`: Accessible from anywhere.
- `protected`: Accessible within the same package *and* by subclasses in other packages.
- `private`: Accessible *only* within the same class. (e.g., `private String model` cannot be directly accessed by `CalculatorAdv` without a getter method).

### 4. Constructor Chaining (`this()`)
Constructor chaining is the process of calling one constructor from another constructor with respect to the current object. This is done using the `this()` keyword.
- **Purpose:** To prevent duplicate code when a class has multiple overloaded constructors.
- **Rule:** The `this()` call must be the **first statement** in the constructor. You cannot use `this()` and `super()` in the same constructor block.

**Execution Flow (From `ConstructorChainingDemo.java`):**
When `new ConstructorChainingDemo()` is called:
1. It calls `this("Kaushalya")`.
2. That calls `this("Kaushalya", 18)`.
3. The 2-parameter constructor sets the variables and prints.
4. Then the 1-parameter constructor finishes.
5. Finally, the default constructor finishes.

**Expected Output:**
```text
--- Creating object with default constructor ---
Initializer Block Called
Main Parameterized Constructor Called (Name: Kaushalya, Age: 18)
Constructor with Name Called
Default Constructor Called
Name: Kaushalya, Age: 18

--- Creating object with name constructor ---
Initializer Block Called
Main Parameterized Constructor Called (Name: Weerathunga, Age: 20)
Name: Weerathunga, Age: 20
```

---

## Day 09: Advanced Method Overriding & Upcasting (Polymorphism)

### 1. Method Overriding (`@Override`)
Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
- The method must have the exact same name, return type, and parameters.
- Demonstrated in `B.java` overriding `A.java`'s `display()` method.

### 2. Polymorphism: Upcasting (Reference vs. Object)
Look at this code from `C.java`:
```java
public class UpcastingDemo {
    public static void main(String[] args) {
        B b2 = new C(5);
        b2.display();
    }
}
```
- **Reference Type (`B b2`):** The variable `b2` is of type `B`. This determines *what* methods the compiler allows you to call.
- **Object Type (`new C(5)`):** The actual object created in memory is of type `C`. This determines *which version* of the method actually runs at runtime.

Because `b2` holds an object of type `C`, when `b2.display()` is called, Java dynamically binds the call to the **overridden `display()` method inside class `C`**, not class `B`.

### 3. Constructor Execution Order in Inheritance
When you create an object of a child class, Java automatically calls the default constructor of the parent class first before executing the child class's constructor (unless you explicitly call `super(...)` with arguments).
- Example: Creating `new C(5)` will output the constructor messages for `A`, then `B`, then `C`.

**Expected Output (From `C.java` running `b2.display()`):**
*(Assuming class A and B constructors are called implicitly via super)*
```text
Constructor of class A
Constructor of class B
This is class C
```
