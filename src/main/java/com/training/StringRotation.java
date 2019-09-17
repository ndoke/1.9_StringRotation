package com.training;

/**
 * {@link StringRotation} has a method to check if one of the given strings
 * can be rotated to get the second string.
 *
 * {@link StringRotation#isRotationEqualizing(String, String)} (String)}
 * true if rotated string is rotated version of the given string
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class StringRotation {
    /**
     * Returns true if one string can be rotated to get the second
     * string.
     *
     * @param input1 first string
     * @param input2 rotated string
     * @return true if rotated string is rotated version of the
     * given string
     */
    public boolean isRotationEqualizing(String input1, String input2) {
        String input1Doubled = input1 + input1;
        return input1Doubled.contains(input2);
    }
}
