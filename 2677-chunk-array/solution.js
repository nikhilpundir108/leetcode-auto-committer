/*
 * Problem: Chunk Array (LeetCode #2677)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 51 ms (Beats 36.42%)
 * Memory: 57.8 MB (Beats 8.82%)
 * Solved At: 2026-11-08 20:03:54 IST
 * Link: https://leetcode.com/problems/chunk-array/
 */

/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    let ans = [];
    let temp = [];
    for (let i = 0; i < arr.length; i++) {
        temp.push(arr[i]);
        if (temp.length == size) {
            ans.push(temp);
            count = 0;
            temp = [];
        }
    }
    if (temp.length > 0) {
        ans.push(temp);
    }
    return ans;
};
