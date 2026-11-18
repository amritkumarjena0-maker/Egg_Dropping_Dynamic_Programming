# Egg Dropping Problem Using Dynamic Programming

## Description
A Java implementation of the classic Egg Dropping Problem using Dynamic Programming to calculate the minimum number of attempts required to determine the critical floor in the worst case.

## Features
- Dynamic Programming (Bottom-Up Approach)
- Supports multiple eggs and floors
- Calculates minimum worst-case attempts
- Uses a 2D DP table
- Takes user input

## Technologies
- Java
- Dynamic Programming
- 2D Array
- Scanner Class

## Requirements
- Java Development Kit (JDK)
- Java-compatible IDE or terminal

## Suggested Project Folder Structure

```text
Egg_Dropping_Dynamic_Programming/
│
├── src/
│   └── EggDropping.java
│
├── output/
│   └── sample_output.txt
│
├── README.md
└── .gitignore
```

## Algorithm
1. Initialize a 2D DP table.
2. Set base cases for zero floors and one egg.
3. Iterate through the number of eggs and floors.
4. Try dropping an egg from every possible floor.
5. Calculate the breaking and surviving cases.
6. Find the maximum attempts for each possible drop.
7. Select the minimum attempts.
8. Return the final DP table result.

## Complexity Analysis

- **Time Complexity:** O(K × N²)
- **Space Complexity:** O(K × N)

Where:
- K = Number of eggs
- N = Number of floors

## Sample Input

```text
Enter number of eggs: 4
Enter number of floors: 8
```

## Sample Output

```text
===== EGG DROPPING PROBLEM =====
Enter number of eggs: 4
Enter number of floors: 8
Minimum number of attempts: 4
```

## Note
This implementation uses the Dynamic Programming Bottom-Up Tabulation technique to minimize the number of egg-dropping attempts in the worst case.