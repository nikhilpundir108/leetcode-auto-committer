/*
 * Problem: Remove All Occurrences of a Substring (LeetCode #1910)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms (Beats 22.73%)
 * Memory: 44.9 MB (Beats 38.41%)
 * Solved At: 2025-10-05 04:01:41
 * Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}