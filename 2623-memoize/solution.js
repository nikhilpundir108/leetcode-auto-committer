/*
 * Problem: Memoize (LeetCode #2623)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 231 ms (Beats 95.56%)
 * Memory: 94.6 MB (Beats 63.86%)
 * Solved At: 2026-11-08 16:21:44 IST
 * Link: https://leetcode.com/problems/memoize/
 */

/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {

    let map = new Map();

    return function (...args) {
        let key = JSON.stringify(args);

        if (map.has(key)) {
            return map.get(key);
        }
        let ans = fn(...args);

        map.set(key, ans);
        return ans;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */