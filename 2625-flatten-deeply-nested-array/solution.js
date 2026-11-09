/*
 * Problem: Flatten Deeply Nested Array (LeetCode #2625)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 155 ms (Beats 34.10%)
 * Memory: 90.9 MB (Beats 33.74%)
 * Solved At: 2026-11-09 16:54:15 IST
 * Link: https://leetcode.com/problems/flatten-deeply-nested-array/
 */

/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    let ans = [];
    for (let i = 0; i < arr.length; i++) {
        if (Array.isArray(arr[i]) && n > 0) {
            ans.push(...flat(arr[i], n - 1));
        } else {
            ans.push(arr[i]);
        }
    }
    return ans;
};