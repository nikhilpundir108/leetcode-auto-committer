/*
 * Problem: Sleep (LeetCode #2621)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 42 ms (Beats 73.44%)
 * Memory: 53.9 MB (Beats 40.08%)
 * Solved At: 2026-11-08 16:53:48 IST
 * Link: https://leetcode.com/problems/sleep/
 */

/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    let ans = await new Promise(resolve => {
        setTimeout(resolve, millis);
    })
    return ans;

}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */