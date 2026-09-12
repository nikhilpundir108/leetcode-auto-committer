/*
 * Problem: Defanging an IP Address (LeetCode #1108)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.8 MB (Beats 43.97%)
 * Solved At: 2026-09-07 10:35:56
 * Link: https://leetcode.com/problems/defanging-an-ip-address/
 */

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}