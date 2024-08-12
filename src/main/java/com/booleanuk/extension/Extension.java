package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
     * Implement the following methods:
     * 
     * 1. add, which accepts two floats and returns a float (both floats added
     * together)
     * 
     * 2. add, which accepts two doubles and returns a double (both doubles added
     * together)
     * 
     * 3. subtract, which accepts two floats and returns a float (first float minus
     * second float)
     * 
     * 4. subtract, which accepts a String and a char and returns a string with all
     * instances of the provided char removed
     * 
     * 5. multiply, which accepts two ints and returns an int (first int multiplied
     * by second int)
     * 
     * 6. multiply, which accepts a string and an int, and returns a string
     * containing the provided string
     * as many times as the provided int separated by a comma. E.g.
     * multiply("Hello", 3) -> "Hello,Hello,Hello"
     * 
     * 7. multiply, which accepts an array of Strings that each contain a number,
     * and an int
     * The method should return an array of ints that contain the value of
     * multiplying each String number by the provided int
     * E.g.
     * multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

    public float add(float x, float y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public float subtract(float x, float y) {
        return x - y;
    }

    public String subtract(String s, char c) {
        return s.replaceAll(c + "", "");
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public String multiply(String sequence, int timesRepeated) {
        String result = "";
        for (int i = 0; i < timesRepeated; ++i) {
            result += sequence;
            if (i != timesRepeated - 1)
                result += ',';
        }

        return result;
    }

    public int[] multiply(String[] numbers, int factor) {
        int[] result = new int[numbers.length];
        int i = 0;
        for (String s : numbers) {
            // Could handle error but not important
            result[i] = Integer.parseInt(s) * factor;
            ++i;
        }

        return result;
    }

}
