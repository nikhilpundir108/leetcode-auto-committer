/*
 * Problem: To Be Or Not To Be (LeetCode #2704)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 40 ms (Beats 76.18%)
 * Memory: 53.3 MB (Beats 65.08%)
 * Solved At: 2026-10-04 16:23:06 IST
 * Link: https://leetcode.com/problems/to-be-or-not-to-be/
 */

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function (val) {
    return {
        toBe: function (value) {
            if (val === value) {
                return true;
            }
            throw new Error("Not Equal");
        },
        notToBe: function (value) {
            if (val !== value) {
                return true;
            }
            throw new Error("Equal");
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */