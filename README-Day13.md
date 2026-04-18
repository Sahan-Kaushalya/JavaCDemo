# JavaCDemo - Day 13 Theory & Examples

This document serves as an extension of the main JavaCDemo repository, specifically covering advanced concepts introduced in Day 13, focusing on **Sealed Classes** and the **SOLID Principles**.

---

## 1. Sealed Classes (Java 15 Preview / Java 17 Final)

Introduced as a preview in Java 15 and finalized in Java 17, **Sealed Classes** allow a developer to restrict which other classes or interfaces may extend or implement them.

Before Java 17, you only had two choices for class inheritance:
1. Make a class `public` (anyone can extend it).
2. Make a class `final` (no one can extend it).

Sealed classes provide a middle ground. You can define a base class, but specifically whitelist exactly which subclasses are allowed to inherit from it. 

### Why and When to Use Sealed Classes?
- **Purpose:** To provide a more declarative way to restrict the use of a superclass, giving the author of the superclass complete control over its hierarchy.
- **When to Use:** When you want to model a domain where there is a known, finite, and strictly defined set of subclasses.
- **Security:** It prevents random, unauthorized classes from extending your core domain logic, which is crucial for building secure APIs or libraries.

### Real-World Examples
1. **Payment Processing System:**
   You want a base `PaymentMethod` class, but you only want it to ever be extended by `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment`. You do *not* want a random developer extending `PaymentMethod` to create an insecure `CustomUnverifiedPayment`.
   
2. **Network Responses:**
   An API might return a `Result` interface. You want to guarantee that the *only* two possible implementations of this result are `SuccessResult` and `ErrorResult`.

### Key Keywords: `sealed`, `permits`, `final`, `non-sealed`

When creating a sealed hierarchy, Java enforces strict rules on the subclasses. Every subclass allowed in the `permits` list MUST declare exactly how it will continue the inheritance chain by using one of three modifiers:

1. **`sealed`:** The parent class must use this to declare it is restricting inheritance. (Subclasses can also use it to continue restricting their own children).
2. **`permits`:** Used on the parent class to explicitly list the specific child classes that are allowed to extend it.
3. **`final`:** Used on a child class to declare that this branch of the inheritance tree ends here. No one can extend this child.
4. **`non-sealed`:** Used on a child class to declare that this branch is now "open". Any random class can now extend this specific child.

---

### Code Example (`day13.seale_permit.Main`)

In this example, we create a base `Shape` class. We ONLY want `Circle`, `Rectangle`, and `Triangle` to be valid shapes in our system.

```java
// 1. Parent is marked 'sealed', and strictly 'permits' only 3 specific children.
sealed class Shape permits Circle, Rectangle, Triangle {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// 2. Child is marked 'final'. The inheritance tree ends here. No one can extend Circle.
final class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// 3. Child is marked 'final'. No one can extend Rectangle.
final class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// 4. Child is marked 'non-sealed'.
// The Triangle class is allowed to extend Shape because it is in the permits list.
// However, by marking itself 'non-sealed', ANY random class can now extend Triangle!
non-sealed class Triangle extends Shape { 
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        
        s1.draw(); 
        s2.draw(); 
    }
}
```

**Expected Output:**
```text
Drawing a circle
Drawing a rectangle
```

---

## 2. The SOLID Principles

The **SOLID principles** are five foundational object-oriented design principles intended to make software designs more understandable, flexible, and maintainable.

### S - Single Responsibility Principle (SRP)
- **Theory:** A class should have one, and only one, reason to change. It should have only one job or responsibility.
- **Why use it:** If a class handles multiple responsibilities (e.g., calculating business logic *and* writing to a database), changing the database logic might accidentally break the business logic. SRP prevents this coupling.
- **Real World Example:** A Chef (Class) should cook food. A Waiter (Class) should serve food. If the Chef tries to cook *and* serve, they will get overwhelmed and make mistakes.
- **Code Example (`day13.SOLID.Single_Responsibility`):**
  Instead of having one `Transaction` class that handles the math *and* saving to the database, you split them:
  - `TransactionService.java` (Handles only business logic/math).
  - `TransactionRepository.java` (Handles only database save/load operations).

### O - Open/Closed Principle (OCP)
- **Theory:** Software entities (classes, modules, functions, etc.) should be **open for extension, but closed for modification**.
- **Why use it:** You should be able to add new functionality without touching existing, tested, and working code. Touching old code risks introducing new bugs.
- **Real World Example:** A blender is "closed for modification" (you can't change the motor inside), but "open for extension" (you can put different attachments on top, like a smoothie maker or a food processor).
- **Code Example (`day13.SOLID.Open_Closed`):**
  Instead of writing an `if/else` block inside a single `PaymentProcessor` class (e.g., `if (type == "Card") {...}`), you create a base `Payment` interface.
  When you need to add Crypto payments, you don't modify the existing code; you simply create a new `CryptoPayment.java` class that extends the `Payment` interface.

### L - Liskov Substitution Principle (LSP)
- **Theory:** Objects of a superclass should be replaceable with objects of its subclasses without breaking the application. What the parent class can do, the child class must *also* be able to do.
- **Why use it:** It ensures that inheritance is used correctly. If a child class overrides a method to throw an `UnsupportedOperationException`, it violates LSP because it breaks the promise made by the parent.
- **Real World Example:** If you have a parent class `Bird` with a method `fly()`, creating a child class `Penguin` violates LSP because penguins can't fly. The program will crash if it expects all `Bird` objects to fly. You should instead have a `FlyingBird` and `NonFlyingBird` base class.
- **Code Example (`day13.SOLID.Liskov_Substitution`):**
  In the Factory Pattern example, `AsusHD.java` and `DellHD.java` can seamlessly replace the generic `HardDisk.java` interface without the `Laptop.java` class breaking or crashing.

### I - Interface Segregation Principle (ISP)
- **Theory:** Clients should not be forced to implement interfaces they don't use. It is better to have many small, specific interfaces than one large, general-purpose interface.
- **Why use it:** "Fat" interfaces force classes to implement methods that are totally useless to them, leading to blank methods or methods that just throw exceptions.
- **Real World Example:** You buy a new TV. The remote has a giant "Netflix" button. But you don't have a Netflix account. The remote is a "fat interface" that forced a button on you that you can't use.
- **Code Example (`day13.SOLID.Interface_Segregation`):**
  Instead of having one `Worker` interface with `work()` and `eat()`, you segregate them into `worker.java` (work method) and `eatable.java` (eat method).
  - A `HumanWorker.java` can implement both.
  - A `RobotWorker.java` only implements `worker.java` (because robots don't eat). It isn't forced to write blank code for an `eat()` method it doesn't need!

### D - Dependency Inversion Principle (DIP)
- **Theory:** High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces). Details should depend on abstractions, not the other way around.
- **Why use it:** It fundamentally achieves **Loose Coupling**. High-level business logic shouldn't care about low-level hardware or database details.
- **Real World Example:** You plug your laptop into a wall outlet (an Interface). The laptop (High-level module) doesn't care if the electricity is coming from a solar panel, a wind turbine, or a coal plant (Low-level modules). It just relies on the outlet interface.
- **Code Example (`day13.SOLID.Dependency_Inversion`):**
  A `DellLaptop.java` should not depend directly on a concrete `AsusHardDisk.java` class. Instead, both the Laptop and the Asus disk should depend on a `HardDisks.java` interface. This allows the laptop to accept a `DellHardDisk` or `HitachiHardDisk` seamlessly via Dependency Injection.