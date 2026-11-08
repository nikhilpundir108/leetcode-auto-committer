/*
 * Problem: Is Object Empty (LeetCode #2727)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 49 ms (Beats 23.17%)
 * Memory: 54.2 MB (Beats 55.91%)
 * Solved At: 2026-11-08 19:51:11 IST
 * Link: https://leetcode.com/problems/is-object-empty/
 */

/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return Object.keys(obj).length === 0
};