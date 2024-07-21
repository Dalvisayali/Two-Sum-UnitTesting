# TwoSum Solution

## Problem Statement
The "Two Sum" problem requires us to find indices of two numbers in an integer array such that they add up to a given target. Specifically, given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

**Constraints:**
- Each input would have exactly one solution, and you may not use the same element twice.
- You can return the answer in any order.

You can find the problem statement on LeetCode [here](https://leetcode.com/problems/two-sum/description/).

## Introduction
This repository contains the solution to the "Two Sum" problem from LeetCode. The solution includes the main algorithm implementation and unit tests to achieve full code coverage.

## Algorithm Explanation
To solve this problem, we use a hashmap to store the difference between the target and each number as we iterate through the array. If the current number exists in the hashmap, it means we have found the pair that adds up to the target.

### Steps:
1. Create a hashmap to store the complement of each number and its index.
2. Iterate through the array, and for each number, check if it exists in the hashmap.
3. If it exists, return the indices of the current number and the complement from the hashmap.
4. If it does not exist, add the current number and its index to the hashmap.
5. If no solution is found, throw an IllegalArgumentException.

## Edge Cases
The algorithm handles several edge cases:
- If no solution exists, it throws an IllegalArgumentException.
- It handles negative numbers and multiple pairs that sum up to the target.

## Prerequisites
- JDK 8 or higher
- Maven for dependency management

## Running the Code

### Using Maven
1. Navigate to the project directory:
    ```bash
    cd TwoSumSolution
    ```

2. Compile the code:
    ```bash
    mvn compile
    ```

3. Run the tests:
    ```bash
    mvn test
    ```

## Example
Here is an example of how the solution works:

### Input
```java
int[] nums = {2, 7, 11, 15};
int target = 9;
int[] result = twoSum(nums, target); // Output: [0, 1]
```
## Author
Sayali Dalvi