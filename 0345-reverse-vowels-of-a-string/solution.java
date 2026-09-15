/*
 * Problem: Reverse Vowels of a String (LeetCode #345)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 99.03%)
 * Memory: 46.8 MB (Beats 21.59%)
 * Solved At: 2026-09-16 24:29:31 IST
 * Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

class Solution {
    public String reverseVowels(String s) {

        int l = 0;
        int r = s.length() - 1;

        char[] str = s.toCharArray();

        while (l < r) {

            while (l < r && 
                   str[l] != 'a' && str[l] != 'e' && str[l] != 'i' &&
                   str[l] != 'o' && str[l] != 'u' &&
                   str[l] != 'A' && str[l] != 'E' && str[l] != 'I' &&
                   str[l] != 'O' && str[l] != 'U') {
                l++;
            }

            while (l < r && 
                   str[r] != 'a' && str[r] != 'e' && str[r] != 'i' &&
                   str[r] != 'o' && str[r] != 'u' &&
                   str[r] != 'A' && str[r] != 'E' && str[r] != 'I' &&
                   str[r] != 'O' && str[r] != 'U') {
                r--;
            }

            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;

            l++;
            r--;
        }

        return new String(str);
    }
}