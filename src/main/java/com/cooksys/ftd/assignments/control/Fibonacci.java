package com.cooksys.ftd.assignments.control;

import com.cooksys.ftd.assignments.control.util.MissingImplementationException;

/**
 * The Fibonacci sequence is simply and recursively defined: the first two elements are `1`, and
 * every other element is equal to the sum of its two preceding elements. For example:
 * <p>
 * [1, 1] =>
 * [1, 1, 1 + 1]  => [1, 1, 2] =>
 * [1, 1, 2, 1 + 2] => [1, 1, 2, 3] =>
 * [1, 1, 2, 3, 2 + 3] => [1, 1, 2, 3, 5] =>
 * ...etc
 */
public class Fibonacci {

    /**
     * Calculates the value in the Fibonacci sequence at a given index. For example,
     * `atIndex(0)` and `atIndex(1)` should return `1`, because the first two elements of the
     * sequence are both `1`.
     *
     * @param i the index of the element to calculate
     * @return the calculated element
     * @throws IllegalArgumentException if the given index is less than zero
     */
    public static int atIndex(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException();
        }

        if (i == 0 || i == 1) {
            return 1;
        } else {
            // setting base case for first 2 numbers in fibonacci sequence
            // using a "3-pointer"-like approach
            int prev1 = 1;
            int prev2 = 1;
            int sum = 2;

            // using i1 as loop counter as "i" is already used as parameter
            // iteratively loops up to "i" to find the correct 2 numbers to sum together
            for (int i1 = 2; i1 <= i; i1++) {
                sum = prev1 + prev2;
                prev1 = prev2;
                prev2 = sum;
            }
            return sum;
        }
    }

    /**
     * Calculates a slice of the fibonacci sequence, starting from a given start index (inclusive) and
     * ending at a given end index (exclusive).
     *
     * @param start the starting index of the slice (inclusive)
     * @param end   the ending index of the slice(exclusive)
     * @return the calculated slice as an array of int elements
     * @throws IllegalArgumentException if either the given start or end is negative, or if the
     *                                  given end is less than the given start
     */
    public static int[] slice(int start, int end) throws IllegalArgumentException {
        if (start < 0 || end < start) {
            throw new IllegalArgumentException();
        }

        if (end == start) {
            return new int[0]; // edge case not handled by Exception or parameter definitions
        }

        int[] slice = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            slice[i] = atIndex(i + start);
        }
        return slice;
    }

    /**
     * Calculates the beginning of the fibonacci sequence, up to a given count.
     *
     * @param count the number of elements to calculate
     * @return the beginning of the fibonacci sequence, up to the given count, as an array of int elements
     * @throws IllegalArgumentException if the given count is negative
     */
    public static int[] fibonacci(int count) throws IllegalArgumentException {
        if (count > 0) {
            throw new MissingImplementationException();
        }
        throw new MissingImplementationException();
    }
}
