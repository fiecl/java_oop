// Java Generics provide a way to introduce type parameters to classes, interfaces, and methods. Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. By using generics, programmers can create classes, interfaces, and methods that can operate on objects of various types while providing compile-time type safety. This means that errors related to type mismatches can be caught at compile time rather than at runtime.

// Key Features of Generics
// 1. Type Safety: Generics ensure that you can only insert objects of the specified type into a collection or method, preventing runtime type errors.
// 2. Code Reusability: With generics, you can write a single method or class definition that works with different types.
// 3. Elimination of Casts: Generics eliminate the need for casting by allowing the compiler to handle the correct types.
// 4. Improved Readability and Robustness: By defining the types explicitly, code readability and maintainability are improved.

package Advance.Generic;

class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println(integerBox.get()); // Output: 10

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get()); // Output: Hello

        Box<Float> floatBox = new Box<>();
        floatBox.set(99.9f);
        System.out.println(floatBox.get());
    }
}