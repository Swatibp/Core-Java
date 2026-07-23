# Java OOP Practice

This repository contains my Java practice programs covering Object-Oriented Programming (OOP) concepts with simple programs.

## Topics Covered

### 1. Encapsulation
Encapsulation is the process of wrapping data (variables) and methods into a single unit (class). It helps in data hiding and protects the internal state of an object.

**Key Points**
- `private` variables cannot be accessed directly from outside the class.
- Getter methods are used to retrieve data.
- Setter methods are used to update data.
- Validation can be added inside setter methods before assigning values.

---

### 2. Constructors

A constructor is a special method that is automatically invoked when an object is created. It is used to initialize the state of an object.

**Characteristics**
- A constructor has the same name as the class.
- It does not have any return type, not even `void`.
- It is called automatically when an object is created using the `new` keyword.
- Constructors are used to initialize object data.

---

### 3. Getter and Setter Methods

Getter and Setter methods provide controlled access to private data members.

- Getter methods are used to retrieve the value of private variables.
- Setter methods are used to update the value of private variables.
- They help implement encapsulation by controlling how data is accessed and modified.

---

### 4. `this` Keyword

The `this` keyword refers to the current object.

**Uses of `this`**
- Distinguishes instance variables from local variables or method parameters with the same name.
- Refers to the current object's instance variables.
- Helps avoid the variable shadowing problem.

---

### 5. Variable Shadowing

Variable shadowing occurs when a local variable or method parameter has the same name as an instance variable.

**Solution**
- Use the `this` keyword to refer to the instance variable.
- This ensures that the object's data is updated correctly instead of modifying only the local variable.

---

## Programs Included

- BankAccount
- Customer
- Constructor Examples

---

## Learning Objective

This repository is created to practice Java fundamentals and Object-Oriented Programming concepts by implementing simple programs and understanding core OOP principles.
