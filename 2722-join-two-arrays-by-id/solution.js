/*
 * Problem: Join Two Arrays by ID (LeetCode #2722)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 346 ms (Beats 20.24%)
 * Memory: 100.4 MB (Beats 73.85%)
 * Solved At: 2026-11-09 16:38:45 IST
 * Link: https://leetcode.com/problems/join-two-arrays-by-id/
 */

var join = function (arr1, arr2) {
    let map = new Map();

    //  Store arr1
    for (let obj of arr1) {
        map.set(obj.id, obj);
    }

    //  Process arr2
    for (let obj of arr2) {
        if (map.has(obj.id)) {
            map.set(obj.id, {
                ...map.get(obj.id),
                ...obj
            });
        } else {
            map.set(obj.id, obj);
        }
    }
    return Array.from(map.values()).sort((a, b) => a.id - b.id);
};