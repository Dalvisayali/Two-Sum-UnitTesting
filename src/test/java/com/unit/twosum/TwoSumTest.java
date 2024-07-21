package com.unit.twosum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class TwoSumTest {

    @Test
    void testTwoSum() {
        TwoSum solution = new TwoSum();

        // Test case 1: Normal case with positive numbers
        int[] input1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(input1, target1);
        int[] expected1 = new int[]{0, 1};
        System.out.println("Test case 1 input: " + Arrays.toString(input1) + " target: " + target1);
        System.out.println("Test case 1 result: " + Arrays.toString(result1));
        assertArrayEquals(expected1, result1);

        // Test case 2: Edge case with negative numbers
        int[] input2 = new int[]{-3, 4, 3, 90};
        int target2 = 0;
        int[] result2 = solution.twoSum(input2, target2);
        int[] expected2 = new int[]{0, 2};
        System.out.println("Test case 2 input: " + Arrays.toString(input2) + " target: " + target2);
        System.out.println("Test case 2 result: " + Arrays.toString(result2));
        assertArrayEquals(expected2, result2);

        // Test case 3: Edge case with no solution
        int[] input3 = new int[]{1, 2, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(input3, target3);
        int[] expected3 = new int[]{};
        System.out.println("Test case 3 input: " + Arrays.toString(input3) + " target: " + target3);
        System.out.println("Test case 3 result: " + Arrays.toString(result3));
        // Expecting an empty array for no solution.
        assertArrayEquals(expected3, result3);

        // Test case 4: Edge case with multiple solutions
        int[] input4 = new int[]{3, 3};
        int target4 = 6;
        int[] result4 = solution.twoSum(input4, target4);
        int[] expected4 = new int[]{0, 1};
        System.out.println("Test case 4 input: " + Arrays.toString(input4) + " target: " + target4);
        System.out.println("Test case 4 result: " + Arrays.toString(result4));
        assertArrayEquals(expected4, result4);

        // Test case 5: Edge case with array length 1
        int[] input5 = new int[]{1};
        int target5 = 1;
        int[] result5 = solution.twoSum(input5, target5);
        int[] expected5 = new int[]{};
        System.out.println("Test case 5 input: " + Arrays.toString(input5) + " target: " + target5);
        System.out.println("Test case 5 result: " + Arrays.toString(result5));
        // Expecting an empty array for array length 1.
        assertArrayEquals(expected5, result5);
    }
}
