# JavaCDemo - Day 12 Theory & Examples

This document covers the advanced OOP design principles of Coupling, Dependency Injection, the Factory Design Pattern, and a practical look at the Diamond Problem.

---

## 1. Coupling & Decoupling

**Coupling** refers to the degree of direct knowledge that one class has about another. In other words, it's the measure of how dependent two classes are on each other.

### Tight Coupling
- **What it is:** A state where a class is highly dependent on another specific class. If you change one class, you are often forced to change the other.
- **The Problem:** This makes the system rigid, hard to maintain, and difficult to test.
- **Code Example (`day12.coupling.Main`):**
  ```java
  public class Main {
      public static void main(String[] args) {
          Laptop laptop = new Laptop();
          // ...
          // Here, the Main class is TIGHTLY COUPLED to the AsusHD class.
          // If we want to switch to a DellHD, we MUST change this code.
          laptop.setHardDisk(new AsusHD("125GB")); 
          System.out.println(laptop);
      }
  }
  ```

### Loose Coupling (Decoupling)
- **What it is:** A state where classes are designed to interact with each other through a common interface, without knowing the specific implementation details of the other class.
- **The Goal:** To create a flexible system where components can be swapped out easily without affecting other parts of the system. This is a core principle of good object-oriented design.
- **How to Achieve:** Loose coupling is achieved through techniques like **Dependency Injection** and **Design Patterns** (like the Factory Pattern).

---

## 2. Dependency Injection (DI)

Dependency Injection is a design pattern used to implement **Loose Coupling**. Instead of a class creating its own dependencies (like a Laptop building its own HardDisk), those dependencies are "injected" (passed) into the class from the outside.

### Why and When to Use Dependency Injection?
- **Purpose:** To separate the creation of an object from its usage. This allows you to easily swap out dependencies (like swapping an Asus hard drive for a Dell hard drive) without modifying the main class.
- **When to Use:** You should use DI anytime a class relies on another complex object to function, especially if you foresee needing to swap that object out in the future or mock it for unit testing.

### Real World Example
Imagine you are building a Car. 
- **Without DI (Tight Coupling):** The Car builds its own engine from scratch internally. If the engine breaks, you have to tear the whole car apart to replace it. You can never upgrade to a V8 engine without redesigning the car.
- **With DI (Loose Coupling):** The Car is built with an empty slot for an engine. At the factory, a fully built engine is simply "dropped in" (injected). Now, you can easily swap a V4 engine for a V8 engine without changing the car's design.

### Types of Dependency Injection

#### 1. Constructor Injection
The dependency is provided through the class constructor at the exact moment the object is created.
- **Best for:** Mandatory dependencies (the object *cannot* function without it). Once set, it usually isn't changed.
- **Example:** A `Laptop` cannot function without a `HardDisk`.
  ```java
  // In the Laptop class:
  public Laptop(String brand, String model, HardDisk hardDisk) {
      this.brand = brand;
      this.model = model;
      this.hardDisk = hardDisk; // Dependency is injected here
  }

  // Usage:
  HardDisk dellHD = new DellHD("500GB");
  Laptop myLaptop = new Laptop("Asus", "ZenBook", dellHD); // Constructor Injection
  ```

#### 2. Setter Injection (Method Injection)
The dependency is provided through a public "setter" method after the object has already been created.
- **Best for:** Optional dependencies, or dependencies that might need to be swapped out or changed later during the program's execution.
- **Example:** A `Laptop` might want to swap its hard drive later.
  ```java
  // In the Laptop class:
  public void setHardDisk(HardDisk hardDisk) {
      this.hardDisk = hardDisk; // Dependency is injected here
  }

  // Usage:
  Laptop myLaptop = new Laptop();
  HardDisk asusHD = new AsusHD("1TB");
  myLaptop.setHardDisk(asusHD); // Setter Injection
  ```

#### 3. Interface Injection
The dependency is provided through a dedicated method defined in an interface. The class implements this interface, which forces it to have a method for receiving the dependency.
- **Best for:** Complex scenarios where you want to ensure a class is explicitly designed to receive certain types of dependencies. It's less common than Constructor or Setter injection.
- **Example:**
  ```java
  // 1. Create an interface for the injection method
  public interface HardDiskInjectable {
      void injectHardDisk(HardDisk hardDisk);
  }

  // 2. Implement the interface in the Laptop class
  public class Laptop implements HardDiskInjectable {
      private HardDisk hardDisk;
      
      @Override
      public void injectHardDisk(HardDisk hardDisk) {
          this.hardDisk = hardDisk;
      }
  }

  // 3. Usage
  Laptop myLaptop = new Laptop();
  HardDisk dellHD = new DellHD("256GB");
  myLaptop.injectHardDisk(dellHD); // Interface Injection
  ```

---

## 3. Factory Design Pattern

The **Factory Pattern** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It works hand-in-hand with Dependency Injection to achieve maximum **loose coupling**.

### How it Works
Instead of creating an object directly using the `new` keyword (like `new AsusHD()`), you call a static "factory" method. You tell the factory *what* you want (e.g., an "ASUS" hard disk), and the factory handles the logic of creating and returning the correct object for you.

### Code Example (`day12.factory_dp.HardDiskFactory`)
The `HardDiskFactory` class centralizes the object creation logic. The `Main` class no longer needs to know about `AsusHD` or `DellHD`. It only needs to know about the `HardDisk` interface and the `HardDiskFactory`.

```java
public class HardDiskFactory {
    public static HardDisk getHardDisk(HardDiskType type, int size) {
        switch (type) {
            case ASUS:
                return new AsusHD(size + "GB");
            case DELL:
                return new DellHD(size + "GB");
            default:
                throw new IllegalArgumentException("Invalid HardDisk type");
        }
    }
}
```

### Achieving Loose Coupling with DI and Factories (`day12.factory_dp.Main`)
Now, the `Main` class is completely **loosely coupled**. It asks the factory to build a hard disk, and then uses **Setter Injection** or **Constructor Injection** to pass it to the laptop. If a new `SamsungHD` class is added tomorrow, the `Main` class does not need to be changed at all—only the factory does.

```java
public class Main {
    public static void main(String[] args) {
        
        // Example 1: Factory Pattern + Setter Injection
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setModel("XPS 15");
        laptop1.setHardDisk(HardDiskFactory.getHardDisk(HardDiskType.ASUS, 16)); 
        System.out.println(laptop1);

        // Example 2: Factory Pattern + Constructor Injection
        Laptop laptop2 = new Laptop("Asus", "ZenBook",
                HardDiskFactory.getHardDisk(HardDiskType.DELL, 32)); 
        System.out.println(laptop2);
    }
}
```

---

## 4. Diamond Problem: A Practical Example

This section revisits the Diamond Problem with a concrete code example (`day12.diamond_problem`).

- **Interface `A`** defines a `default` method `show()`.
- **Interfaces `B` and `C`** both `extend A` and each provides its own `@Override` for the `show()` method.
- **Class `D`** then tries to `implement` both `B` and `C`.

```text
      Interface A (show())
         /         \
Interface B (show())   Interface C (show())
         \         /
           Class D
```

### The Compiler Error
Java sees that Class `D` is inheriting two different versions of the `show()` method and cannot decide which one to use. This results in a **compile-time error**.

### The Solution
To solve this, Class `D` **must** provide its own implementation of the `show()` method. Inside this method, it can choose to:
1.  Write entirely new logic.
2.  Explicitly call the `default` method from one of the parent interfaces using the `super` keyword.

```java
public class D implements B, C {
    @Override
    public void show() {
        // We explicitly choose to use the implementation from Interface B.
        B.super.show(); 
    }
    // ...
}
```
This resolves the ambiguity and allows the code to compile.
