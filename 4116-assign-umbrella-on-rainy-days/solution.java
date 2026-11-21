/*
 * Problem: Assign Umbrella on Rainy Days (LeetCode #4116)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 100.00%)
 * Memory: 47 MB (Beats 0.00%)
 * Solved At: 2026-11-21 20:16:59 IST
 * Link: https://leetcode.com/problems/assign-umbrella-on-rainy-days/
 */


class Solution {
    public String[] assignUmbrella(int[] rain) {

        int n = rain.length;

        String[] ans = new String[n];

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < n; i++) {

            if (rain[i] == 0) {
                ans[i] = "None";
            }

            else if (i == n - 1 || rain[i + 1] == 0) {
                ans[i] = "Bob";
                bob++;
            }

            else {
                if (alice <= bob) {
                    ans[i] = "Alice";
                    alice++;
                } else {
                    ans[i] = "Bob";
                    bob++;
                }
            }
        }

        return ans;
    }
}
