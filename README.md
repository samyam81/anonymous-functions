# Java Lambda Expressions and Functional Interfaces

This repository contains Java code examples demonstrating the usage of lambda expressions and functional interfaces.

## Generic Calculator

The `GenericCalculator` class showcases the usage of generic types with functional interfaces. It includes:
- A generic `calculate` method that takes two operands and a `MathOperation` as parameters.
- An interface `MathOperation` defining the `perform` method for arithmetic operations.
- Implementations of addition, subtraction, multiplication, and division.

## Number Filtering

The `Number` class demonstrates how to filter numbers using lambda expressions and functional interfaces. It includes:
- A method `FilterNumbers` that takes a list of numbers and a predicate function to filter numbers.
- Predicate functions `IsPositive` and `IsDivisibleBy3` for filtering positive numbers and numbers divisible by 3.

## Vowel Counting

The `VowelMain` class showcases how to count vowels in a string using lambda expressions and Java's `Function` interface. It includes:
- A lambda function `countVowels` to count vowels in a string.
- Usage of the `Function` interface to apply the lambda function to the input string.

These examples demonstrate the versatility and simplicity of lambda expressions and functional interfaces in Java for various tasks such as arithmetic operations, filtering data, and text processing.
