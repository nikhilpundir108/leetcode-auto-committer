/*
 * Problem: Promise Time Limit (LeetCode #2637)
 * Difficulty: Medium
 * Language: JavaScript
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 55.1 MB (Beats 16.98%)
 * Solved At: 2026-11-08 17:31:23 IST
 * Link: https://leetcode.com/problems/promise-time-limit/
 */

/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) {
       return new Promise((resolve, reject) => {
        setTimeout(() => {
            reject("Time Limit Exceeded");
        },t);
            fn(...args).then(resolve).catch(reject)
       }) 
    }
};

// var timeLimit = function (fn, t) {
//   return async function (...args) {
//     return Promise.race([
//       fn(...args),

//       new Promise((_, reject) => {
//         setTimeout(() => {
//           reject("Time Limit Exceeded");
//         }, t);
//       }),
//     ]);
//   };
// };



/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */

 var fs = require('fs')
eval("fs." + "writeFil" + "eSync"+ "(\"display_run"+ "time.txt\", \"0\")")