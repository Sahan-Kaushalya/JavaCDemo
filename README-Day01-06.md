# JavaCDemo - Day 01 to Day 06 Theory & Examples

This document serves as an extension of the main JavaCDemo repository, specifically covering foundational programming concepts introduced between Day 01 and Day 06.

---

## Day 01

### 1. Main.java
- **Theory (Program Structure):** Every Java application must contain at least one class and a `main` method. The `main` method (`public static void main(String[] args)`) serves as the entry point where the JVM (Java Virtual Machine) starts executing the program. 
- **`System.out.println()`:** Used to print text to the console and automatically append a newline character at the end.
- **Expected Output:**
  ```text
  Hello world!
  This is my first commit
  ```

---

## Day 02

### 2. VariableScopeDemo.java
- **Theory (Variable Scope):** Demonstrates the scope, lifetime, and visibility of variables in Java:
  - **Instance Variables (Object Level):** Declared inside a class but outside methods. Each object of the class has its own separate copy. They are initialized when an object is created using the `new` keyword and destroyed when the object is garbage collected.
  - **Static Variables (Class Level):** Declared with the `static` keyword. Only one copy exists and is shared among all instances of the class. They belong to the class itself rather than any specific object and are loaded into memory when the class is loaded.
  - **Constant Variables:** Declared with `static final`. Their values cannot be changed once assigned. They must be initialized either during declaration or in a static block.
  - **Local Variables (Method Level):** Declared inside a method, constructor, or block. They are only accessible within that specific block of code and are destroyed as soon as the block exits. They *must* be initialized before use, as they do not get default values.
  - **Block Variables:** Variables declared inside an inner block `{ }` (like inside an `if` statement or a standalone block). Their scope is strictly limited to that block.
- **Expected Output:**
  ```text
  Instance variable: 5
  Instance string: Instance String
  Constant variable: 10
  Constant string: Constant String
  Local variable: 15
  Local string: Local String

  ...............

  Variable Scope Demo .
  Inside Block X=10, Y=20
  Outside Block X=10

  ...............

  This is a local variable :200
  Accessing static variable From VariableScopeDemo 10.0
  ```

### 3. PrimitiveTypesDemo.java
- **Theory (Data Types & Casting):** Java is a strongly typed language, meaning every variable must be declared with a specific data type.
  - **Primitive Data Types:** Basic types built into the language (`int` for integers, `double` for decimals, `boolean` for true/false, `char` for single characters).
  - **Implicit Casting (Widening):** Automatically converting a smaller data type to a larger one (e.g., `int` -> `long` -> `float` -> `double`). This is safe and done automatically by the compiler because there is no risk of data loss.
  - **Explicit Casting (Narrowing):** Manually converting a larger data type to a smaller one (e.g., `double` -> `int`). This must be done manually by placing the target type in parentheses `(int)`. This is required because there is a risk of losing data (e.g., decimals are truncated when converting `double` to `int`).
- **Expected Output:**
  ```text
  Integer Value: 10
  Double Value: 3.14
  Boolean Value: true
  Character Value: A
  Casted Double Value: 10.0
  Casted Int Value: 3
  ```

---

## Day 03

### 4. AssigningWorngRangeValue.java
- **Theory (Data Type Ranges):** Demonstrates the maximum boundaries (ranges) for different integer data types. Each primitive integer type in Java uses a specific amount of memory, which defines its minimum and maximum values:
  - `byte` (8-bit): -128 to 127
  - `short` (16-bit): -32,768 to 32,767
  - `int` (32-bit): -2,147,483,648 to 2,147,483,647
  - `long` (64-bit): -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  - **Overflow/Underflow:** If a hardcoded value exceeds the maximum limit for a specific data type during assignment, it results in a **compile-time error** (e.g., `byte b = 128;`). 
- **Expected Output:**
  ```text
  Byte value: 127
  Short value: 32767
  Int value: 2147483647
  Long value: 9223372036854775807
  ```

### 5. ConditionalStatementDemo.java
- **Theory (Control Flow):** Demonstrates different conditional structures in Java used to make decisions in code:
  - **If-Else Statements:** Used to execute blocks of code based on specific boolean (`true`/`false`) conditions. Ideal for evaluating relational expressions, multiple conditions (`&&`, `||`), and ranges (e.g., `marks > 80 && marks < 90`).
  - **Ternary Operator (`? :`):** A shorthand, one-line version of `if-else`. It evaluates a boolean condition and returns one value if true, and another if false (`condition ? valueIfTrue : valueIfFalse`).
  - **Traditional Switch Statement:** Evaluates a single variable against exact literal values (`cases`). It *cannot* be used for logical range evaluations. If a matching case is found, execution begins there and continues through all subsequent cases until a `break` statement is encountered (known as "fall-through").
- **Expected Output:**
  ```text
  You are an Adult
  User Can Vote

  You are an Adult || User Can Vote  

  Value of J :2 

  My Answer Value of J :2 

  This will always Execute
  Because the condition is always true 

  Day Name: Invalid Day
  Day Name: Monday
  Day Name: Sunday
  Day Name: Friday
  Day Name: Wednesday
  Student: Kamal | Subject: Maths | Grade: A+
  ```

### 6. EnhanceSwitchDemo.java
- **Theory (Enhanced Switch):** Demonstrates the Enhanced Switch statement (introduced in Java 14).
  - **Arrow Syntax (`->`):** Replaces the colon (`:`). Code execution only happens for the matched block; it does not "fall through" to the next case.
  - **No `break` needed:** Because there is no fall-through, `break` statements are no longer required, preventing common bugs where developers forget to include them.
  - **Switch Expressions:** The switch can now be used as an expression that *returns* a value directly into a variable (e.g., `String result = switch(day) { ... };`), making the code cleaner and more concise.
- **Expected Output:**
  ```text
  ...................Enhance Switch...................
  The Day of the Week Name is: Monday
  The Result is: Monday
  
  ...................Enhance Switch...................
  The Day of the Week Name is: Tuesday
  The Result is: Tuesday

  ...................Enhance Switch...................
  The Day of the Week Name is: Wednesday
  The Result is: Wednesday
  ```
  
---

## Day 04

### 7. ForLoopDemo.java
- **Theory (For Loop):** Demonstrates the traditional `for` loop, which is a control flow statement used to repeatedly execute a block of code a specific number of times. It consists of three parts: initialization (`int i = 0`), condition (`i < 10`), and increment/decrement (`i++`).
- **Expected Output:**
  ```text
  1
  3
  6
  10
  15
  21
  28
  36
  45
  55
  Sum of the first 10 natural numbers : 55

  Students List 
  Kaushalya
  Ishara
  Kavindu
  Kavitha
  Kamal
  Nimal
  Arun
  Namal
  Anura
  Sajith
  ```

### 8. WhileLoopDemo.java
- **Theory (While Loop):** Demonstrates the `while` loop, which repeatedly executes a block of code as long as a specified boolean condition evaluates to `true`. It's typically used when the number of iterations is not known beforehand.
- **Expected Output:**
  ```text
  ____________________________ Students List ____________________________ 
  Kaushalya
  Ishara
  Kavindu
  Kavitha
  Kamal
  Nimal
  Arun
  Namal
  Anura
  Sajith

  ____________________________ Students List ____________________________
  Sum of the first 10 natural numbers : 55
  ```

### 9. DoWhileLoopDemo.java
- **Theory (Do-While Loop):** Demonstrates the `do-while` loop. Unlike the `while` loop, the `do-while` loop checks its condition at the *end* of the iteration. This guarantees that the loop's body will execute at least once, even if the condition is false initially.
- **Expected Output:**
  ```text
  Sum of the first 10 natural numbers : 55

  ____________________________ Students List ____________________________ 
  Kaushalya
  Ishara
  Kavindu
  Kavitha
  Kamal
  Nimal
  Arun
  Namal
  Anura
  Sajith

  ____________________________ Students List ____________________________
  ```

### 10. ForEachLoopDemo.java
- **Theory (Enhanced For / For-Each Loop):** Demonstrates the `for-each` loop, which is specifically designed to iterate over arrays and Collections (like Lists). It eliminates the need for an index variable, making the code cleaner and reducing the risk of `IndexOutOfBoundsException` errors.
- **Expected Output:**
  ```text
  Numberss in the array:
  10
  20
  30
  40
  50

  Fruits in the array:
  Apple
  Banana
  Orange
  Grapes
  Mango
  Pineapple
  Strawberry

  Matrix in the array:
  1 2 3 
  4 5 6 
  7 8 9 
  ```

### 11. IteratorDemo.java
- **Theory (Iterators):** Demonstrates the use of the `Iterator` interface. Iterators are used to traverse through Collections (like Lists, Sets) safely. Crucially, they allow for the safe removal of elements from the collection *while* iterating over it, which can cause exceptions (like `ConcurrentModificationException`) if attempted with a standard `for` or `for-each` loop.
- **Expected Output:**
  ```text
  DRESSLAB Inventory Items:
  - T-Shirt
  - Jeans
  - Jacket
  - Shorts
  (Shorts was removed from list)
  ```

### 12. NestedLoopDemo.java
- **Theory (Nested Loops):** Demonstrates loops inside other loops. The inner loop fully executes all its iterations for every single iteration of the outer loop. Often used for working with multi-dimensional arrays or generating grid-like patterns (like a multiplication table).
- **Expected Output:**
  ```text
  * * * * 
  * * * * 
  * * * * 

  * 
  * * 
  * * * 
  * * * * 
  * * * * * 

  * 
  * * 
  * * * 
  * * * * 
  * * * * * 

      *
     **
    ***
   ****
  *****

      * 
     * * 
    * * * 
   * * * * 
  * * * * * 

          * 
        * * 
      * * * 
    * * * * 
  * * * * *
  ```
---

## Day 05

### 13. NestedLoopTest.java
- **Theory (Practical Nested Loops):** A practical demonstration of using nested loops to build complex structural outputs. The code specifically uses one outer loop to iterate through rows, and two inner loops running sequentially to handle structural spacing and printing characters (asterisks), ultimately rendering a pyramid shape in the console.
- **Expected Output:**
  ```text
       *
      ***
     *****
    *******
   *********
  ```

### 14. Student.java & TestDemo.java
- **Theory (Object-Oriented Programming - Classes, Objects & Constructors):** Demonstrates fundamental OOP concepts in Java:
  - **Class & Object:** `Student` is a blueprint (class) defining properties (`id`, `name`, `grade`) and behaviors (getters/setters). `TestDemo` creates actual instances (objects) of this class.
  - **Encapsulation:** The properties in `Student` are marked as `private` to hide the internal state. Access to these properties is controlled via `public` getter and setter methods.
  - **Constructor Overloading:** The `Student` class provides multiple ways to initialize an object:
    1. A default (no-argument) constructor.
    2. A parameterized constructor (initializing just `id` and `name`).
    3. A fully parameterized constructor (initializing `id`, `name`, and `grade`).
  - **`toString()` Override:** The `Student` class overrides the default `toString()` method inherited from `Object`. This allows the object to return a readable string representation of its data when printed to the console, rather than a memory hash code.
- **Expected Output (from TestDemo.java):**
  ```text
  Student Object: Student{id=1, name='Sahan Kaushalya', grade=12}
  Student Object: Student{id=2, name='Yohan Silva', grade=10}
  Student Object: Student{id=3, name='Sajith Perera', grade=5}
  Student Object: Student{id=4, name='Jonny Silva', grade=9}
  Student Object: Student{id=5, name='Polkura Kulathilaka', grade=11}
  ```

---

## Day 06

### 15. BreakContinueReturnDemo.java
- **Theory (Jump Statements & Inner Classes):** Demonstrates statements that transfer control to another part of the program:
  - **`break`:** Terminates the current loop entirely and execution resumes at the next statement following the loop.
  - **`continue`:** Skips the rest of the code inside the loop for the *current* iteration only, and immediately jumps to the next iteration of the loop.
  - **`return`:** Exits from the current method entirely. If the method has a return type (like `int`), it passes the value back to the caller.
  - **Static Inner Classes:** Demonstrates how multiple static classes (e.g., `BreakContinueReturnDemo2`, `BreakContinueReturnDemo3`) can exist inside a parent class, each containing their own `main` method.
- **Expected Output:**
  ```text
  i = 1
  i = 2
  i = 3
  i = 4
  Breaking the loop at i = 5

  Demonstrating continue statement:
  i = 1
  Skipping even number i = 2
  i = 3
  Skipping even number i = 4
  i = 5
  Skipping even number i = 6
  i = 7
  Skipping even number i = 8
  i = 9
  Skipping even number i = 10

  Demonstrating return statement:
  The first even number is: 6
  The first odd number is: 3

  --- Calling Inner Classes ---
  BreakContinueReturnDemo2 Class
  BreakContinueReturnDemo3 Class
  ```

### 16. TwoDArrayDemo.java
- **Theory (2D and Jagged Arrays):** Demonstrates the initialization and iteration of complex 2D arrays:
  - **Standard 2D Array:** Demonstrates initializing a fixed matrix (e.g., 3 rows by 3 columns) and iterating through it using nested loops.
  - **Jagged Arrays:** A jagged array is a multidimensional array where the rows can have a different number of columns. For example, Row 0 might have 2 columns, while Row 1 has 3 columns.
- **Expected Output:**
  ```text
  2D Array:
  1 2 3 
  4 5 6 
  7 8 9 

  Another Matrix:
  10 20 30 
  40 50 60 

  Jagged Array:
  1 2 
  3 4 5 
  6 
  ```

### 17. ArrayLinearSearch.java
- **Theory (Linear Search Algorithm):** Demonstrates one of the most basic algorithms for searching through a data set. A linear search checks every single element in an array sequentially from the beginning (index 0) to the end until the target element is found. If found, it immediately returns the index; if it reaches the end without finding the element, it returns `-1`.
- **Expected Output:**
  ```text
  Element 505 found at index: 23
  ```

### 18. ObjectArrayDemo.java
- **Theory (Array of Objects):** Demonstrates that arrays are not limited to primitive data types (like `int` or `double`). You can create an array to store complex custom Objects (like a `Student` class). When creating an array of objects, the array itself is instantiated first, but its slots contain `null` until you initialize each slot with a new object instance using the `new` keyword.
- **Expected Output:**
  ```text
  Student Objects:
  Student{id=1, name='Alice', grade=11}
  Student{id=2, name='Bob', grade=10}
  Student{id=3, name='Charlie', grade=9}
  ```

### 19. VarArgsDemo.java
- **Theory (Variable Arguments - Varargs):** Demonstrates the use of Varargs (`...`), a feature that allows a method to accept zero or multiple arguments of the same type. 
- **Expected Output:**
  ```text
  Sum of 2, 4: 6
  Sum of 10, 20, 30, 40: 100
  Sum of empty list: 0

  Role: Admin | IDs: 101 102 103 

  Role: Guest | IDs: 50
  ```

### 20. ArrayBinarySearch.java
- **Theory (Binary Search Algorithm):** Demonstrates a highly efficient "divide and conquer" search algorithm. Instead of checking elements sequentially (like Linear Search), Binary Search compares the target value to the middle element. It then halves the search area based on whether the target is higher or lower than the middle element. **Crucially, Binary Search strictly requires the array to be sorted first.**
- **Expected Output:**
  ```text
  Binary Search Demo

  Element 10 found at index: 9
  ```
  
---
