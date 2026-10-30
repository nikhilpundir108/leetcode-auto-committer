/*
 * Problem: Filter Elements from Array (LeetCode #2634)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 48 ms (Beats 29.70%)
 * Memory: 54.2 MB (Beats 27.60%)
 * Solved At: 2026-10-31 24:10:33 IST
 * Link: https://leetcode.com/problems/filter-elements-from-array/
 */

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
    let ans = [];
    for (let i = 0; i < arr.length; i++) {
        let res = fn(arr[i], i);
        if (res) {
            ans.push(arr[i]);
        }
    }
    return ans;
};