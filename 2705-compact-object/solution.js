/*
 * Problem: Compact Object (LeetCode #2705)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 77 ms (Beats 33.21%)
 * Memory: 66.2 MB (Beats 38.01%)
 * Solved At: 2026-11-09 17:12:12 IST
 * Link: https://leetcode.com/problems/compact-object/
 */

/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function (obj) {
    if (obj == null) {
        return null;
    }
    if (Array.isArray(obj)) {
        return obj.filter(Boolean).map(compactObject);
    }
    if (typeof obj === "object") {
        let ans = {};
        for (let key in obj) {
            let val = compactObject(obj[key]);
            if (val) {
                ans[key] = val;
            }
        }
        return ans;
    }
    return obj;
};