/*
 * Problem: Counter (LeetCode #2620)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 42 ms (Beats 59.69%)
 * Memory: 52.3 MB (Beats 94.67%)
 * Solved At: 2026-09-23 24:52:46 IST
 * Link: https://leetcode.com/problems/counter/
 */

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */