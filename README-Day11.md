# JavaCDemo - Day 11 Theory & Examples

This document serves as an extension of the main JavaCDemo repository, specifically covering the advanced concepts covered on Day 11.

---

## 1. Abstraction (Abstract Classes)

Abstraction is an OOP principle that hides the complex implementation details and shows only the essential features to the user.

### What is an Abstract Class?
- An **abstract class** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- It is defined using the `abstract` keyword.
- It can have both **abstract methods** (methods without a body) and **regular methods** (methods with a body).

### Why and When to Use Abstract Classes?
- **Purpose:** To provide a common base or template for subclasses while enforcing that certain methods must be implemented by the subclasses.
- **When to Use:** 
  1. When you have a base class that should never be instantiated on its own (e.g., `Vehicle`, `Animal`, `ATM`). You don't create a generic `ATM`, you create a specific bank's ATM (like `HNBATM`).
  2. When you want to share code among several closely related classes.

### Code Example (`day11.abstraction.ATM`)
```java
public abstract class ATM {
    // Abstract methods: Subclasses MUST implement these
    public abstract String withdraw(double amount);
    public abstract String deposit(double amount);
    public abstract double checkBalance();

    // Regular method: Inherited by all subclasses
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM!");
    }
}
```

---

## 2. Interfaces (Advanced / Java 8+)

An **Interface** in Java is a completely "abstract class" that is used to group related methods with empty bodies.

### What changed in Java 8?
Before Java 8, interfaces could *only* have abstract methods and constants. Java 8 introduced:
1.  **`default` methods:** Methods with a body that provide a default implementation. They don't force implementing classes to override them. Useful for adding new methods to interfaces without breaking existing code.
2.  **`static` methods:** Methods with a body that belong to the interface itself, not the implementing class. You call them using the Interface name (`InterfaceName.method()`).

### When to Use Interfaces vs Abstract Classes?
- **Interface:** When you want to define a "contract" that multiple, unrelated classes can implement (Multiple Inheritance).
- **Abstract Class:** When classes share a strong "is-a" relationship and you want to share state (instance variables) or common code.

### Code Example (`day11.interfaceDemo.ATM`)
```java
public interface ATM {
    // Abstract methods
    String withdraw(double amount);
    String deposit(double amount);
    double checkBalance();

    // Default method (Java 8+) - Can be overridden if needed
    default void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM!");
    }

    // Static method (Java 8+) - Belongs ONLY to the interface
    static void displayBankInfo() {
        System.out.println("This is a demo ATM interface.");
    }
}
```
**Calling the Static Method:**
```java
public class StaticCallDemo {
    public static void main(String[] args) {
        ATM.displayBankInfo(); // Correct way to call
    }
}
```

---

## 3. The Diamond Problem

The "Diamond Problem" is a classic issue that can arise in languages that support multiple inheritance. It describes the ambiguity that occurs when a class inherits from two parent classes that both provide a different implementation of the exact same method.

```text
      Grandparent
         /     \
      ParentA   ParentB
         \     /
          Child
```
If `ParentA` and `ParentB` both have a method called `doWork()`, which version should `Child` inherit?

### How Java Handles the Diamond Problem

#### 1. With Classes (No Diamond Problem)
Java **avoids** this problem with classes by simply **not allowing multiple inheritance**. A class can only `extend` one other class, so the diamond shape is impossible to create with classes.

#### 2. With Interfaces (The Problem Re-emerges)
Since Java 8, interfaces can have `default` methods (methods with a body). This reintroduces the Diamond Problem because a class **can implement multiple interfaces**.

```java
interface ParentA {
    default void doWork() { System.out.println("Doing work from A"); }
}

interface ParentB {
    default void doWork() { System.out.println("Doing work from B"); }
}

// This class will NOT compile!
class Child implements ParentA, ParentB {
    // COMPILER ERROR: Which doWork() should I inherit? A's or B's?
}
```

### How Java Solves the Diamond Problem with Interfaces
Instead of guessing, the Java compiler forces the developer to solve the ambiguity. To fix the error above, the `Child` class **must override the conflicting method** and provide its own implementation.

```java
class Child implements ParentA, ParentB {
    @Override
    public void doWork() {
        // You MUST choose which implementation to use, or write a new one.
        ParentA.super.doWork(); // Explicitly call ParentA's version
    }
}
```

### Real World Examples
1. **Scanner and Printer:** Imagine you have an interface `Scanner` with a `scan()` method and an interface `Printer` with a `print()` method. Now, you create a new interface `Photocopier` that extends both `Scanner` and `Printer`. If both `Scanner` and `Printer` had a default method called `start()`, the `Photocopier` class would be confused. Which `start()` method should it use? The one for scanning or the one for printing? Java forces the developer to implement a `start()` method in the `Photocopier` class to resolve this ambiguity.
2. **Flying and Swimming:** Imagine an interface `CanFly` with a `move()` method and an interface `CanSwim` with its own `move()` method. If you create a class `AmphibiousPlane` that implements both, the compiler doesn't know whether `move()` means to fly or to swim. The `AmphibiousPlane` class must provide its own `move()` method to clarify what should happen.

---

## 4. Covariant Return Types

In Java, when overriding a method, you are allowed to change the return type in the overriding method, **provided the new return type is a subclass (child) of the original return type**.

### Why is this useful?
It prevents the caller from having to cast the returned object down the inheritance tree, making the code cleaner and safer.

### Example
In `Vehicle.java`:
```java
public class Vehicle {
    public Animal park() {
        System.out.println("Vehicle is parked. Returning an Animal.");
        return new Animal();
    }
}
```

In `Car.java` (which extends `Vehicle`), it overrides `park()`, but notice the return type changes from `Animal` to `Lion`:
```java
public class Car extends Vehicle {
    @Override
    public Lion park() { // Valid because Lion extends Animal
        System.out.println("Car is parked. Returning a Lion.");
        return new Lion();
    }
}
```

---

## 5. Wrapper Classes: Parsing & valueOf()

In Java, every primitive type (`int`, `double`, `boolean`) has a corresponding Wrapper Class (`Integer`, `Double`, `Boolean`). These classes provide utility methods to convert strings into numbers.

### `.parse...()` vs `.valueOf()`

#### `Integer.parseInt(String s)`
- **Returns:** The **primitive** data type (e.g., `int`).
- **Use Case:** Use this when you need to do pure math and want the fast, memory-efficient primitive.
```java
public class ParseDemo {
    public static void main(String[] args) {
        int parsedInt = Integer.parseInt("123"); // Returns primitive 'int'
    }
}
```

#### `Integer.valueOf(String s)`
- **Returns:** The **Wrapper Object** (e.g., `Integer`).
- **Use Case:** Use this when you need an object, such as when storing the number in an `ArrayList<Integer>`.
```java
public class ValueOfDemo {
    public static void main(String[] args) {
        Integer valueOfInt = Integer.valueOf("123"); // Returns 'Integer' Object
    }
}
```

### Converting Primitives to Strings
You can also use Wrapper classes to easily convert primitives back into Strings.
```java
public class ToStringDemo {
    public static void main(String[] args) {
        String s1 = Integer.toString(123); // converts int to String "123"
        String s3 = Boolean.toString(true); // converts boolean to String "true"
    }
}
```
