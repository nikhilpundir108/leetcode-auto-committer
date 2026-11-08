/*
 * Problem: Allow One Function Call (LeetCode #2666)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 40 ms (Beats 81.62%)
 * Memory: 54.6 MB (Beats 19.15%)
 * Solved At: 2026-11-08 15:19:08 IST
 * Link: https://leetcode.com/problems/allow-one-function-call/
 */

/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function (fn) {
    let flag = false;

    return function (...args) {
        if (!flag) {
            flag = !flag;
            return fn(...args);
        }
        return undefined;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
