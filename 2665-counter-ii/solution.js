/*
 * Problem: Counter II (LeetCode #2665)
 * Difficulty: Easy
 * Language: JavaScript
 * Runtime: 49 ms (Beats 64.21%)
 * Memory: 54.5 MB (Beats 99.64%)
 * Solved At: 2026-10-30 23:51:46 IST
 * Link: https://leetcode.com/problems/counter-ii/
 */

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var count = init;
    return {
        increment: function() {
            ++count;
            return count;
        },
        reset: function() {
            count = init;
            return count;
        },
        decrement: function() {
            --count;
            return count
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */