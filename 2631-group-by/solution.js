/*
 * Problem: Group By (LeetCode #2631)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 103 ms (Beats 77.61%)
 * Memory: 77.8 MB (Beats 77.86%)
 * Solved At: 2026-11-09 16:22:28 IST
 * Link: https://leetcode.com/problems/group-by/
 */

/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    let ans = {};
    this.forEach((item) => {
        let key = fn(item);
        if (!ans[key]) {
            ans[key] = [];
        }
        ans[key].push(item);
    });
    return ans;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */