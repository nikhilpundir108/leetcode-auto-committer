/*
 * Problem: First Bad Version (LeetCode #278)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 13 ms (Beats 99.81%)
 * Memory: 42.1 MB (Beats 54.51%)
 * Solved At: 2026-09-25 24:43:21 IST
 * Link: https://leetcode.com/problems/first-bad-version/
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean bad = isBadVersion(mid);
            if (bad) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}