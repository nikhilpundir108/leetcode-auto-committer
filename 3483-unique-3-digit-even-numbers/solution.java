/*
 * Problem: Unique 3-Digit Even Numbers (LeetCode #3483)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 69.24%)
 * Memory: 46.5 MB (Beats 30.34%)
 * Solved At: 2026-09-12 18:57:16
 * Link: https://leetcode.com/problems/unique-3-digit-even-numbers/
 */

class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (digits[k] % 2 != 0) {
                        continue;
                    } else {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}