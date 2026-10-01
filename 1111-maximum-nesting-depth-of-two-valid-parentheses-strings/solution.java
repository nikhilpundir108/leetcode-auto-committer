/*
 * Problem: Maximum Nesting Depth of Two Valid Parentheses Strings (LeetCode #1111)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 45.5 MB (Beats 53.97%)
 * Solved At: 2026-09-30 23:10:46 IST
 * Link: https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
 */

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth=0;
        int []ans = new int[seq.length()];
        int i=0;
        for(char ch : seq.toCharArray()){
            if(ch == '('){
                depth++;
                if(depth % 2 != 0){
                    ans[i++]=0;
                }else{
                    ans[i++]=1;
                }
            }else{
                if(depth % 2 != 0){
                    ans[i++]=0;
                }else{
                    ans[i++]=1;
                }
                depth--;
            }
        }
        return ans;
    }
}