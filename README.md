# Java Programming Mastery: Assignment Portfolio

This repository contains a comprehensive collection of Java programs organized into three major assignments. The portfolio tracks a progression from basic Object-Oriented Programming (OOP) to advanced Multithreading and Generic System Design.

---

## 📂 Assignment 1: OOP Fundamentals & System Architecture
**Core Focus:** Object-Oriented Design, Inheritance, and Polymorphism.

### Phase 1: The Foundation
*Programs: 1, 2, 3, 15*
* **Concepts:** Class Blueprints, State Management, Constructors, and Constants (`static final`).
* **Key Scenarios:** Room volume calculation, Stack implementation, and Toll booth systems.

### Phase 2: Object Relationships (Has-A)
*Programs: 4, 5, 6, 12*
* **Concepts:** Encapsulation, Composition, Aggregation, and Record Searching/Deletion.
* **Key Scenarios:** Bank Account management and Departmental Employee tracking.

### Phase 3: Inheritance Hierarchies (Is-A)
*Programs: 7, 8, 9, 13*
* **Concepts:** `extends`, Constructor Chaining (`super()`), and Method Overriding.
* **Key Scenarios:** Library systems (Books vs. Journals) and Vehicle hierarchies.

### Phase 4: Interfaces & Polymorphism
*Programs: 14, 16*
* **Concepts:** Interface Contracts (`implements`), Multiple Inheritance, and Dynamic Polymorphism.
* **Key Scenarios:** Geographic Shape operations and hybrid classification (Tomato as Fruit/Vegetable).

### Phase 5: Real-World Logic
*Programs: 10, 11, 17*
* **Concepts:** Constructor Overloading (`this()`), Boundary Logic (Leap Years), and Interactive I/O.
* **Key Scenarios:** Bookshop inventory and Date arithmetic.

---

## 📂 Assignment 2: Multithreading & Concurrency
**Core Focus:** Executing multiple operations simultaneously and safely.

* **The Thread Lifecycle:** Creating execution pathways via `Thread` or `Runnable` and managing them with `.start()`.
* **Thread Dependencies:** Using `.join()` to synchronize thread completion before final result processing.
* **Synchronization (Locks):** Implementing `synchronized` blocks to prevent data corruption in shared memory.
* **Inter-Thread Communication:** Advanced coordination using `wait()`, `notify()`, and `notifyAll()`.
* **Architectural Patterns:** * **Producer-Consumer:** Safe middleman buffers for data flow.
    * **Divide & Conquer:** Parallel algorithms (e.g., Parallel Binary Search) to optimize massive tasks.

---

## 📂 Assignment 3: Generics & Type Safety
**Core Focus:** Writing flexible, reusable, and compile-time safe code.

* **Generic Methods & Classes:** Defining placeholders (`<T>`) to allow logic to work across any data type.
* **Bounded Type Parameters:** Restricting generics (e.g., `<T extends Comparable<T>>`) to ensure specific capabilities like sorting.
* **Object Equality:** Strict adherence to `.equals()` over `==` to ensure content-based comparison for generic types.
* **Algorithmic Patterns:** * Frequency counting and duplicate detection using generic logic.
    * Generic element swapping.
* **Wrapper Classes:** Utilizing `Integer`, `Double`, etc., to bridge the gap between primitives and generic type requirements.

---

## 🛠 Tech Stack
* **Language:** Java 8+
* **Concepts:** OOP, Concurrency, Generics, File I/O, Collections Framework.
* **Tools:** Java Development Kit (JDK), Scanner, Thread API.

---
*Generated as a summary of Assignment 1, 2, and 3 progress.*
