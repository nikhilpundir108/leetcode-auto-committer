/*
 * Problem: Create Hello World Function (LeetCode #2667)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 43 ms (Beats 49.94%)
 * Memory: 54.7 MB (Beats 5.65%)
 * Solved At: 2026-09-23 24:50:40 IST
 * Link: https://leetcode.com/problems/create-hello-world-function/
 */

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */