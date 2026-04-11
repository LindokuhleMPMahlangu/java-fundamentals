package com.fundamentals.basics;

/**
 * TYPE CASTING EXERCISES
 * 
 * Type casting is converting one data type to another.
 * There are two types of casting:
 * 
 * 1. IMPLICIT (Automatic) - Widening conversion (safe, automatic)
 *    Example: int to long (int fits inside long)
 *    byte → short → int → long → float → double
 * 
 * 2. EXPLICIT (Manual) - Narrowing conversion (requires explicit cast)
 *    Example: double to int (might lose precision)
 *    Syntax: (targetType) value
 *    Example: int x = (int) 3.14;  // x will be 3
 * 
 * YOUR TASK: Complete each method by implementing type casting as described.
 */

public class TypeCastingExercises {

    /**
     * Exercise 1: Implicit casting - int to long
     * 
     * An int can fit inside a long, so we can assign directly.
     * No explicit cast needed.
     * 
     * TODO: Convert the int parameter to long and return it
     * 
     * @param value An integer value
     * @return The same value as a long
     */
    public long implicitCastIntToLong(int value) {
        // TODO: Implement this method
        return 0L;
    }

    /**
     * Exercise 2: Implicit casting - int to double
     * 
     * An int can fit inside a double, so we can assign directly.
     * No explicit cast needed.
     * 
     * TODO: Convert the int parameter to double and return it
     * 
     * @param value An integer value
     * @return The same value as a double
     */
    public double implicitCastIntToDouble(int value) {
        // TODO: Implement this method
        return 0.0;
    }

    /**
     * Exercise 3: Explicit casting - double to int
     * 
     * A double to int is "narrowing" - we might lose precision.
     * We MUST explicitly cast: (int) doubleValue
     * The decimal part will be TRUNCATED (thrown away).
     * 
     * Example: (int) 3.99 becomes 3 (not rounded, truncated!)
     * 
     * TODO: Cast the double parameter to int and return it
     * 
     * @param value A double value
     * @return The value as an int (decimal part truncated)
     */
    public int explicitCastDoubleToInt(double value) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Exercise 4: Explicit casting - long to int
     * 
     * A long to int is "narrowing" - we might lose data if the value is too large.
     * We MUST explicitly cast: (int) longValue
     * If the long value is larger than Integer.MAX_VALUE, it will overflow.
     * 
     * TODO: Cast the long parameter to int and return it
     * 
     * @param value A long value
     * @return The value as an int
     */
    public int explicitCastLongToInt(long value) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Exercise 5: Precision loss with float
     * 
     * Floats have less precision than doubles due to fewer bits.
     * When casting a double to float, you might lose precision.
     * 
     * TODO: Cast the double parameter to float and return it
     * 
     * @param value A double value
     * @return The value as a float (might lose some precision)
     */
    public float explicitCastDoubleToFloat(double value) {
        // TODO: Implement this method
        return 0f;
    }

    /**
     * Exercise 6: Casting for integer division
     * 
     * When dividing two ints, the result is an int (truncated).
     * To get a decimal result, cast ONE of them to double FIRST.
     * 
     * Example: 5 / 2 = 2 (int division)
     *          (double) 5 / 2 = 2.5 (double division)
     * 
     * TODO: Divide numerator by denominator and return as a double
     * Make sure you cast to get a decimal result!
     * 
     * @param numerator The top number
     * @param denominator The bottom number
     * @return The division result as a double
     */
    public double divideWithDecimalResult(int numerator, int denominator) {
        // TODO: Implement this method. Cast to get a decimal result!
        return 0.0;
    }

    /**
     * Exercise 7: Understanding char as numeric
     * 
     * Chars can be cast to int! Each char has a numeric ASCII value.
     * Example: 'A' has ASCII value 65
     * 
     * TODO: Cast the character to int and return its numeric value
     * 
     * @param character A character value
     * @return The numeric ASCII value of the character
     */
    public int castCharToInt(char character) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Exercise 8: Casting int to char
     * 
     * You can cast an int to char. The int value is the ASCII code.
     * Example: (char) 65 becomes 'A'
     * 
     * TODO: Cast the integer (ASCII code) to char and return it
     * 
     * @param asciiCode The ASCII numeric code
     * @return The character corresponding to that ASCII code
     */
    public char castIntToChar(int asciiCode) {
        // TODO: Implement this method
        return ' ';
    }

    /**
     * Exercise 9: Casting for percentage calculation
     * 
     * If you have 7 out of 10 points and want the percentage:
     * 7 / 10 = 0 (int division, wrong!)
     * (double) 7 / 10 = 0.7, then multiply by 100 for 70.0
     * 
     * TODO: Calculate percentage (points / total * 100) as a double
     * Remember to cast to get a decimal result!
     * 
     * @param points The points earned
     * @param total The total possible points
     * @return The percentage as a double
     */
    public double calculatePercentage(int points, int total) {
        // TODO: Implement this method
        return 0.0;
    }

    /**
     * Exercise 10: Demonstrating integer overflow with explicit cast
     * 
     * If you have a very large long value and cast it to int,
     * it will OVERFLOW (wrap around) because int is smaller.
     * 
     * Example: Long.MAX_VALUE cast to int becomes -1
     * 
     * TODO: Cast Long.MAX_VALUE to int and return it
     * 
     * @return The result of casting Long.MAX_VALUE to int
     */
    public int demonstrateOverflow() {
        // TODO: Implement this method. Cast Long.MAX_VALUE to int
        return 0;
    }
}