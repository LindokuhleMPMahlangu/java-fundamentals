package com.fundamentals.basics;

/**
 * STRING HANDLING EXERCISES
 * 
 * Strings are very important in Java programming.
 * Key concept: Strings are IMMUTABLE - once created, they cannot be changed.
 * 
 * String literals use DOUBLE quotes: "Hello"
 * Characters use SINGLE quotes: 'H'
 * 
 * Common String methods:
 * - length() : returns the number of characters
 * - charAt(index) : returns the character at that position
 * - substring(start, end) : returns a portion of the string
 * - toUpperCase() : returns string in uppercase
 * - toLowerCase() : returns string in lowercase
 * - equals(other) : checks if two strings are equal
 * - equalsIgnoreCase(other) : case-insensitive comparison
 * - contains(substring) : checks if string contains a substring
 * - startsWith(prefix) : checks if string starts with prefix
 * - endsWith(suffix) : checks if string ends with suffix
 * - indexOf(char) : finds the index of a character
 * - replace(old, new) : replaces all occurrences
 * - trim() : removes leading and trailing whitespace
 * 
 * YOUR TASK: Complete each method by implementing string operations.
 */

public class StringHandlingExercises {

    /**
     * Exercise 1: Get the length of a string
     * 
     * Use the length() method to find how many characters are in the string.
     * 
     * TODO: Return the length of the input string
     * 
     * @param text The input string
     * @return The number of characters in the string
     */
    public int getStringLength(String text) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Exercise 2: Get character at a specific index
     * 
     * Use charAt(index) to get a character at a position.
     * Remember: index starts at 0!
     * "Hello" → charAt(0) = 'H', charAt(1) = 'e', etc.
     * 
     * TODO: Return the character at the given index
     * 
     * @param text The input string
     * @param index The position (0-based)
     * @return The character at that position
     */
    public char getCharacterAtIndex(String text, int index) {
        // TODO: Implement this method
        return ' ';
    }

    /**
     * Exercise 3: Get a substring
     * 
     * Use substring(start, end) to extract part of a string.
     * substring(start, end) returns characters from index start up to (but not including) end.
     * "Hello".substring(0, 2) returns "He"
     * 
     * TODO: Return a substring from start to end index
     * 
     * @param text The input string
     * @param start The starting index (inclusive)
     * @param end The ending index (exclusive)
     * @return The substring
     */
    public String getSubstring(String text, int start, int end) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Exercise 4: Convert to uppercase
     * 
     * Use toUpperCase() to convert all characters to uppercase.
     * 
     * TODO: Return the string in uppercase
     * 
     * @param text The input string
     * @return The string in uppercase
     */
    public String convertToUppercase(String text) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Exercise 5: Convert to lowercase
     * 
     * Use toLowerCase() to convert all characters to lowercase.
     * 
     * TODO: Return the string in lowercase
     * 
     * @param text The input string
     * @return The string in lowercase
     */
    public String convertToLowercase(String text) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Exercise 6: Check string equality
     * 
     * IMPORTANT: Use .equals() method, NOT ==
     * == checks if they're the same object
     * .equals() checks if they have the same content
     * 
     * TODO: Return true if the strings are equal, false otherwise
     * 
     * @param text1 First string
     * @param text2 Second string
     * @return true if equal, false otherwise
     */
    public boolean areStringsEqual(String text1, String text2) {
        // TODO: Implement this method. Use .equals(), not ==
        return false;
    }

    /**
     * Exercise 7: Case-insensitive comparison
     * 
     * Use equalsIgnoreCase() to compare strings ignoring case.
     * "Hello".equalsIgnoreCase("hello") returns true
     * 
     * TODO: Return true if strings are equal (ignoring case)
     * 
     * @param text1 First string
     * @param text2 Second string
     * @return true if equal (case-insensitive)
     */
    public boolean areStringsEqualIgnoreCase(String text1, String text2) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Exercise 8: Check if string contains substring
     * 
     * Use contains() method to check if a string contains a substring.
     * "Hello World".contains("World") returns true
     * 
     * TODO: Return true if text contains the substring
     * 
     * @param text The main string
     * @param substring The substring to search for
     * @return true if substring is found
     */
    public boolean stringContains(String text, String substring) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Exercise 9: Find index of a character
     * 
     * Use indexOf() to find the position of a character.
     * "Hello".indexOf('l') returns 2 (first 'l' is at index 2)
     * Returns -1 if not found.
     * 
     * TODO: Return the index of the character
     * 
     * @param text The input string
     * @param character The character to find
     * @return The index of the character, or -1 if not found
     */
    public int findCharacterIndex(String text, char character) {
        // TODO: Implement this method
        return -1;
    }

    /**
     * Exercise 10: Replace characters in string
     * 
     * Use replace(oldChar, newChar) to replace all occurrences.
     * "Hello".replace('l', 'x') returns "Hexxo"
     * 
     * TODO: Replace all occurrences of oldChar with newChar
     * 
     * @param text The input string
     * @param oldChar The character to replace
     * @param newChar The replacement character
     * @return The modified string
     */
    public String replaceCharacter(String text, char oldChar, char newChar) {
        // TODO: Implement this method
        return "";
    }
}