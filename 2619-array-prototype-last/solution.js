/*
 * Problem: Array Prototype Last (LeetCode #2619)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 44 ms (Beats 47.34%)
 * Memory: 53.9 MB (Beats 40.90%)
 * Solved At: 2026-11-08 20:14:03 IST
 * Link: https://leetcode.com/problems/array-prototype-last/
 */

/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function () {
    return this.length == 0 ? -1 : this[this.length - 1];

};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */