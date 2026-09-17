/*
 * Problem: Defuse the Bomb (LeetCode #1652)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.5 MB (Beats 91.85%)
 * Solved At: 2026-09-17 13:48:16 IST
 * Link: https://leetcode.com/problems/defuse-the-bomb/
 */

class Solution {
    public int findsumpos(int[] code, int l, int k) {
        int sum = 0;
        int n = code.length;
        for (int i = 1; i <= k; i++) {
            sum += code[(i + l) % n];
        }
        return sum;
    }

    public int findsumneg(int[] code, int l, int k) {
        int sum = 0;
        int n = code.length;
        for (int i = 1; i <= k; i++) {
            sum += code[(l - i + n) % n];
        }
        return sum;
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) {
            return res;
        }
        if (k < 0) {
            k = -k;
            for (int i = 0; i < n; i++) {
                res[i] = findsumneg(code, i, k);
            }
        } else {
            for (int i = 0; i < n; i++) {
                res[i] = findsumpos(code, i, k);
            }
        }
        return res;
    }
}