/*
 * Problem: Counter (LeetCode #2620)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 49 ms (Beats 17.43%)
 * Memory: 54.4 MB (Beats 22.14%)
 * Solved At: 2026-10-30 23:52:29 IST
 * Link: https://leetcode.com/problems/counter/
 */

/**
 * @param {number} n
 * @return {Function} counter
 */

function createCounter(n) {
    return function() {
        return n++;
    }
    
}



/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */