/*
 * Problem: Guess Number Higher or Lower (LeetCode #374)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.3 MB (Beats 17.17%)
 * Solved At: 2026-09-22 14:33:57 IST
 * Link: https://leetcode.com/problems/guess-number-higher-or-lower/
 */

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess == 1) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}