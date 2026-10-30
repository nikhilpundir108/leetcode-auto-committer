/*
 * Problem: To Be Or Not To Be (LeetCode #2704)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 43 ms (Beats 63.79%)
 * Memory: 54.3 MB (Beats 24.88%)
 * Solved At: 2026-10-30 23:57:22 IST
 * Link: https://leetcode.com/problems/to-be-or-not-to-be/
 */

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function (val) {
    let obj = {
        toBe(val1) {
            if (val1 === val) {
                return true;
            }
            throw new Error ("Not Equal");
        },
        notToBe(val1) {
            if (val1 !== val) {
                return true;
            }
            throw new Error ("Equal");
        }
    }
    return obj;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */