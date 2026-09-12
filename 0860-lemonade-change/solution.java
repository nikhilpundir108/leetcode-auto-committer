/*
 * Problem: Lemonade Change (LeetCode #860)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 97.49%)
 * Memory: 72.5 MB (Beats 30.63%)
 * Solved At: 2026-08-24 16:34:47
 * Link: https://leetcode.com/problems/lemonade-change/
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            else if(bill == 10) {
                if (five == 0) {
                    return false;
                }
                ten++;
                five--;
            }
            else {
                if(five>0&&ten>0)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five-=3;
                }
                else
                {
                    return false;
                }
              
            }
        }
        return true;
    }
}