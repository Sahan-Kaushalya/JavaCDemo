# JavaCDemo - Day 10 Theory & Examples

This document covers the advanced Java concepts related to Type Casting, Auto-boxing, and Unboxing introduced on Day 10.

---

## 1. Static & Instance Initialization Order (Inheritance Context)

When a child class extends a parent class, the order of execution for static blocks, instance blocks, and constructors follows strict rules.

From `A.java` and `B.java` (`B extends A`):
1. **Static Initializer Blocks:** Run exactly once when the class is loaded. The parent's static block runs first, then the child's static block.
2. **Instance Initializer Blocks & Constructors:** Run every time an object is created.
   - The Parent's instance block runs.
   - The Parent's constructor runs.
   - The Child's instance block runs.
   - The Child's constructor runs.

**Expected Output for `new B()`:**
```text
Static initializer block of A
Static initializer block of B
Instance initializer block of A
Constructor of A
Instance initializer block of B
Constructor of B
This is class B, which extends A
```

---

## 2. Primitive Type Casting

Type casting is the process of converting a variable of one primitive data type into another.

#### Implicit Casting (Widening)
- **What it is:** Automatically converting a smaller data type into a larger data type (e.g., `int` -> `double`).
- **Why it's safe:** There is no risk of data loss because the larger type has plenty of memory to hold the smaller type's value.
- **Example:** `int myInt = 100; double myDouble = myInt;`

#### Explicit Casting (Narrowing)
- **What it is:** Manually converting a larger data type into a smaller data type (e.g., `double` -> `int`).
- **How it works:** You must explicitly state the target type in parentheses `(int)`. 
- **Risk (Data Loss):** If the value is too large for the new type, or has decimals, data will be lost.
- **Example:** `double anotherDouble = 9.99; int anotherInt = (int) anotherDouble;` (The `.99` is permanently truncated, leaving `9`).

---

## 3. Autoboxing & Unboxing

Java has primitive types (like `int`, `double`) and their equivalent Object Wrapper classes (like `Integer`, `Double`). 

#### Autoboxing
- **What it is:** The automatic conversion the Java compiler makes between primitive types and their corresponding object wrapper classes.
- **Example:** Assigning an `int` directly to an `Integer` object without using `new Integer()`.
  ```java
  public class AutoboxDemo {
      public static void main(String[] args) {
          int primitiveInt = 25;
          Integer boxedInt = primitiveInt; // Autoboxing
      }
  }
  ```

#### Unboxing
- **What it is:** The automatic conversion of an object wrapper class back into its corresponding primitive type.
- **Example:** Doing math on an `Integer` object automatically unboxes it to an `int`.
  ```java
  public class UnboxDemo {
      public static void main(String[] args) {
          Integer a = 5;
          Integer b = 10;
          int sum = a + b; // a and b are auto-unboxed to primitives before addition
      }
  }
  ```
- **Collections:** This is why you can add a primitive `int` directly into an `ArrayList<Integer>`; Java autoboxes it for you.

---

## 4. Reference Type Casting (Upcasting & Downcasting)

Reference casting involves casting objects within an inheritance hierarchy (e.g., a parent interface `Mammal`, a parent class `Animal`, and child classes `Dog` and `Cat`).

#### Upcasting
- **What it is:** Casting a subclass (child) object to a superclass (parent) reference.
- **Safety:** This is always safe and happens **implicitly**. A `Dog` *is an* `Animal`, so an `Animal` reference can safely hold a `Dog` object.
- **Example:**
  ```java
  // Dog extends Animal
  public class UpcastDemo {
      public static void main(String[] args) {
          Dog dog = new Dog("Buddy");
          Animal animal = dog; // Implicit Upcasting
      }
  }
  ```

#### Downcasting
- **What it is:** Casting a superclass (parent) reference back down to a subclass (child) reference.
- **Safety:** This is **dangerous** and must be done **explicitly**. An `Animal` might be a `Dog`, but it might also be a `Cat`. If you try to downcast an `Animal` (which is actually a `Cat`) into a `Dog`, Java will crash with a `ClassCastException` at runtime.
- **Example:**
  ```java
  public class DowncastDemo {
      public static void main(String[] args) {
          Animal animal = new Dog("Buddy");
          Dog downcastedDog = (Dog) animal; // Explicit Downcasting (Safe here, because it actually IS a Dog)
      }
  }
  ```

### The `instanceof` Keyword
To prevent `ClassCastException` crashes, always use the `instanceof` operator before downcasting to verify the object's true type.
```java
public class InstanceOfDemo {
    public static void checkType(Animal animal) {
        if (animal instanceof Dog) {
            Dog downcastedDog = (Dog) animal;
            downcastedDog.makeSound();
        }
    }
}
```

### Pattern Matching for `instanceof` (Java 16+)
Modern Java simplifies downcasting. If the `instanceof` check is true, Java automatically creates the downcasted variable for you, saving you a line of code!
```java
public class PatternMatchingDemo {
    public static void checkType(Animal animal) {
        // "dog" is automatically created and cast if animal is indeed a Dog
        if (animal instanceof Dog dog) {
            dog.makeSound(); 
        }
    }
}
```

### Pattern Matching in `switch` statements (Java 17+ Preview / Java 21+ Final)
Modern Java extends pattern matching to `switch` statements, allowing you to switch over an object's type and instantly cast it. This eliminates massive `if-else` chains.
```java
public class SwitchPatternDemo {
    public static void main(String[] args) {
        Object obj = "Hello";
        String result = switch (obj) {
            // If 'obj' is a String, cast it to 's' and execute the arrow block
            case String s -> "String length: " + s.length(); 
            case Integer i -> "Integer value: " + i;
            case null -> "Null value received"; // Safe null checking built-in
            default -> "Unknown type";
        };
        System.out.println(result); // Outputs: String length: 5
    }
}
```
