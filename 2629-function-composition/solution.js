/*
 * Problem: Function Composition (LeetCode #2629)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 59 ms (Beats 35.51%)
 * Memory: 55.8 MB (Beats 27.54%)
 * Solved At: 2026-11-08 15:10:31 IST
 * Link: https://leetcode.com/problems/function-composition/
 */

/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {

    return function (x) {
        let n = functions.length;
        for (let i = n - 1; i >= 0; i--) {
            x = functions[i](x);
        }
        return x;
    }

};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */