/*
 * Problem: Self Dividing Numbers (LeetCode #728)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 98.72%)
 * Memory: 42.7 MB (Beats 26.85%)
 * Solved At: 2026-09-11 09:51:31
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