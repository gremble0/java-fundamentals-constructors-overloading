package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

public class Exercise extends ExerciseBase {
    public String name;

    /*
     * A class "constructor" runs whenever we create a new instance of a class. You
     * can think of it like a method
     * that automatically runs when you create an instance. We can even define
     * parameters, just like we can with methods!
     * 
     * To create an instance of a class, we use the "new" keyword:
     * MyClass variableName = new MyClass();
     * 
     * If we want to initialise a class instance with some values, we can pass those
     * values in:
     * MyClass variableName = new MyClass("Hello");
     * 
     * The above assumes that the MyClass class has a constructor that defines a
     * single parameter: a String.
     */
    public Exercise(String name) {
        // A constructor must always be named exactly the same as the class name. This
        // is the constructor for the
        // Exercise class, which accepts one string parameter.
        // Inside the constructor, we assign whatever value was provided to the "name"
        // member, using the keyword "this"
        this.name = name;
    }

    // We would create an instance of the Exercise class like so:
    // Exercise e = new Exercise("Java Fundamentals");

    /*
     * We can define multiple constructors in a single class! Perhaps we want to
     * pass in different types. Here's a second
     * constructor that accepts an integer.
     */
    public int age;

    public Exercise(int age) {
        this.age = age;
    }

    /*
     * The constructor that runs will be decided by the signature that matches what
     * we provide while creating an instance.
     * If we provide an int, the second constructor will run. If we provide a
     * String, the first constructor will run.
     * Exercise e = new Exercise("Hello"); // The first constructor will run for
     * this instance
     * Exercise e = new Exercise(42); // The second constructor will run for this
     * instance
     * 
     * This process is known as "overloading".
     */

    /*
     * 1.
     * Create a constructor that accepts both a String and an int as parameters, in
     * that order, and assign the values
     * provided to the name and age members
     */
    public Exercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * 2. Create a method named add that accepts two integers. The method should
     * return the numbers added together.
     */
    public int add(int x, int y) {
        return x + y;
    }

    /*
     * 3. Create another method named add that accepts two Strings. The method
     * should return the strings concatenated
     * together with a space in between.
     */
    public String add(String first, String last) {
        return first + " " + last;
    }
}
