/*
 * Problem: Return Length of Arguments Passed (LeetCode #2703)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 49 ms (Beats 19.48%)
 * Memory: 54.6 MB (Beats 18.19%)
 * Solved At: 2026-11-08 15:13:30 IST
 * Link: https://leetcode.com/problems/return-length-of-arguments-passed/
 */

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
    let count = 0;
    for (let i = 0; i < args.length; i++) {
        count++;
    }
    return count;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */