/*
 * Problem: Fizz Buzz (LeetCode #412)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.82%)
 * Memory: 46.8 MB (Beats 65.81%)
 * Solved At: 2026-09-20 02:45:35 IST
 * Link: https://leetcode.com/problems/fizz-buzz/
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}