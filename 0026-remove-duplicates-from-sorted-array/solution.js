/*
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 56.8 MB (Beats 83.58%)
 * Solved At: 2026-10-31 24:27:33 IST
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    let k = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
};