/*
 * Problem: Array Reduce Transformation (LeetCode #2626)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 51 ms (Beats 23.52%)
 * Memory: 55 MB (Beats 23.77%)
 * Solved At: 2026-10-31 24:18:05 IST
 * Link: https://leetcode.com/problems/array-reduce-transformation/
 */

var reduce = function (nums, fn, init) {
    if (nums.length === 0) {
        return init;
    }

    let val = fn(init, nums[0]);

    for (let i = 1; i < nums.length; i++) {
        val = fn(val, nums[i]);
    }

    return val;
};