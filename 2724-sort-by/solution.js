/*
 * Problem: Sort By (LeetCode #2724)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 109 ms (Beats 69.73%)
 * Memory: 68.9 MB (Beats 85.11%)
 * Solved At: 2026-11-09 16:11:06 IST
 * Link: https://leetcode.com/problems/sort-by/
 */

/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function (arr, fn) {
    return arr.sort((a, b) => fn(a) - fn(b));
};