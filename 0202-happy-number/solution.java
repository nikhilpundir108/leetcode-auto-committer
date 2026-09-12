/*
 * Problem: Happy Number (LeetCode #202)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 77.40%)
 * Memory: 42.5 MB (Beats 50.69%)
 * Solved At: 2026-09-11 04:51:48
 * Link: https://leetcode.com/problems/happy-number/
 */

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int k = n % 10;
                sum += k * k;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}