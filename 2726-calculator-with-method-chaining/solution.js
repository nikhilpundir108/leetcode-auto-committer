/*
 * Problem: Calculator with Method Chaining (LeetCode #2726)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 49 ms (Beats 16.92%)
 * Memory: 54.2 MB (Beats 35.36%)
 * Solved At: 2026-11-09 18:27:07 IST
 * Link: https://leetcode.com/problems/calculator-with-method-chaining/
 */

class Calculator {
    constructor(value) {
        this.res = value;
    }

    add(value) {
        this.res += value;
        return this;
    }

    subtract(value) {
        this.res -= value;
        return this;
    }

    multiply(value) {
        this.res *= value;
        return this;
    }

    divide(value) {
        if (value === 0) {
            throw new Error("Division by zero is not allowed");
        }
        this.res /= value;
        return this;
    }

    power(value) {
        this.res **= value;
        return this;
    }

    getResult() {
        return this.res;
    }
}