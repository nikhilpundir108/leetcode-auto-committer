/*
 * Problem: Split a String in Balanced Strings (LeetCode #1221)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 41.9 MB (Beats 97.76%)
 * Solved At: 2026-11-15 24:13:32 IST
 * Link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */

class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int ans=0;
        int l=0;
        int r=0;
            
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                r++;
            }else if(ch=='L'){
                l++;
            }
            if(l==r){
                ans++;
                l=0;
                r=0;
            }
        }
        return ans;
        
    }
}