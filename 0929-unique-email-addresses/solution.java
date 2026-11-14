/*
 * Problem: Unique Email Addresses (LeetCode #929)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 16 ms (Beats 21.49%)
 * Memory: 46.8 MB (Beats 28.21%)
 * Solved At: 2026-11-11 12:16:34 IST
 * Link: https://leetcode.com/problems/unique-email-addresses/
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        HashSet<String>set=new HashSet<>();
        for(String str:emails){
                String []parts=str.split("@");
                String local=parts[0];
                String domain=parts[1];
                StringBuilder sb=new StringBuilder();
            
        for(char ch:local.toCharArray()){
            if(ch=='.'){
                continue;
               }
            
            if(ch=='+'){
                break;
            }
            
            sb.append(ch);
            
            }
            String ans = sb.toString() + "@" +domain;
            set.add(ans);
            
        }
        return set.size();
    }
}