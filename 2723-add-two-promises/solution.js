/*
 * Problem: Add Two Promises (LeetCode #2723)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 59 ms (Beats 24.62%)
 * Memory: 54.7 MB (Beats 35.70%)
 * Solved At: 2026-11-08 16:44:31 IST
 * Link: https://leetcode.com/problems/add-two-promises/
 */

/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
    const ans = await Promise.all([promise1, promise2]);
    let n = ans.length;
    let sum = 0;
    for (let i = 0; i < n; i++) {
        sum += ans[i];
    }
    return sum;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */