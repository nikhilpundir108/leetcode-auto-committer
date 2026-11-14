/*
 * Problem: Self Dividing Numbers (LeetCode #728)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 99.11%)
 * Memory: 42.4 MB (Beats 56.93%)
 * Solved At: 2026-11-13 19:58:40 IST
 * Link: https://leetcode.com/problems/self-dividing-numbers/
 */

class Solution {
    public boolean div(int n) {
        int num = n;
        while (num > 0) {
            int k = num % 10;
            if (k == 0 || n % k != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (div(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}