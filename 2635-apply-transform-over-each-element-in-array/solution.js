/*
 * Problem: Apply Transform Over Each Element in Array (LeetCode #2635)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 47 ms (Beats 32.81%)
 * Memory: 54.6 MB (Beats 10.52%)
 * Solved At: 2026-10-31 24:03:50 IST
 * Link: https://leetcode.com/problems/apply-transform-over-each-element-in-array/
 */

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
    let ans = [];
    for (let i = 0; i < arr.length; i++) {
        ans.push(fn(arr[i], i));
    }
    return ans;
};