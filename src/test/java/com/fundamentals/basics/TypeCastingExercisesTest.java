package com.fundamentals.basics;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Tests for TypeCastingExercises
 * 
 * These tests validate your casting implementations.
 * Use these failures to guide your learning!
 */
public class TypeCastingExercisesTest {

    private TypeCastingExercises exercises;

    @Before
    public void setUp() {
        exercises = new TypeCastingExercises();
    }

    @Test
    public void testImplicitCastIntToLong() {
        long result = exercises.implicitCastIntToLong(100);
        assertEquals("100 as int should become 100L", 100L, result);
    }

    @Test
    public void testImplicitCastIntToDouble() {
        double result = exercises.implicitCastIntToDouble(42);
        assertEquals("42 as int should become 42.0", 42.0, result, 0.0);
    }

    @Test
    public void testExplicitCastDoubleToInt() {
        // Test truncation (not rounding)
        int result = exercises.explicitCastDoubleToInt(3.99);
        assertEquals("3.99 should truncate to 3, not round", 3, result);
        
        int result2 = exercises.explicitCastDoubleToInt(9.5);
        assertEquals("9.5 should truncate to 9", 9, result2);
    }

    @Test
    public void testExplicitCastLongToInt() {
        long largeValue = 12345L;
        int result = exercises.explicitCastLongToInt(largeValue);
        assertEquals("12345L should cast to 12345", 12345, result);
    }

    @Test
    public void testExplicitCastDoubleToFloat() {
        double value = 3.14159265;
        float result = exercises.explicitCastDoubleToFloat(value);
        assertTrue("Should return a float", result > 0);
        // Float has less precision than double
        assertTrue("Result should be close to 3.14", Math.abs(result - 3.14159265) < 0.001);
    }

    @Test
    public void testDivideWithDecimalResult() {
        double result = exercises.divideWithDecimalResult(5, 2);
        assertEquals("5 / 2 should be 2.5", 2.5, result, 0.01);
        
        double result2 = exercises.divideWithDecimalResult(7, 4);
        assertEquals("7 / 4 should be 1.75", 1.75, result2, 0.01);
    }

    @Test
    public void testCastCharToInt() {
        int result = exercises.castCharToInt('A');
        assertEquals("'A' should have ASCII value 65", 65, result);
        
        int result2 = exercises.castCharToInt('0');
        assertEquals("'0' should have ASCII value 48", 48, result2);
    }

    @Test
    public void testCastIntToChar() {
        char result = exercises.castIntToChar(65);
        assertEquals("ASCII 65 should be 'A'", 'A', result);
        
        char result2 = exercises.castIntToChar(97);
        assertEquals("ASCII 97 should be 'a'", 'a', result2);
    }

    @Test
    public void testCalculatePercentage() {
        double result = exercises.calculatePercentage(7, 10);
        assertEquals("7 out of 10 is 70%", 70.0, result, 0.01);
        
        double result2 = exercises.calculatePercentage(15, 30);
        assertEquals("15 out of 30 is 50%", 50.0, result2, 0.01);
    }

    @Test
    public void testDemonstrateOverflow() {
        int result = exercises.demonstrateOverflow();
        // Long.MAX_VALUE cast to int results in -1 due to overflow
        assertEquals("Long.MAX_VALUE cast to int should overflow to -1", -1, result);
    }
}