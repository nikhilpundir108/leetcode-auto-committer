/*
 * Problem: Create Hello World Function (LeetCode #2667)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 50 ms (Beats 11.91%)
 * Memory: 54.4 MB (Beats 14.84%)
 * Solved At: 2026-10-30 23:52:13 IST
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