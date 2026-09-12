/*
 * Problem: Zigzag Conversion (LeetCode #6)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms (Beats 15.68%)
 * Memory: 47.2 MB (Beats 16.41%)
 * Solved At: 2026-09-11 09:21:21
 * Link: https://leetcode.com/problems/zigzag-conversion/
 */

class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> ans = new ArrayList<>();
        if (numRows == 1) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            ans.add(new ArrayList<>());
        }
        boolean turn = true;
        int row = 0;
        for (int j = 0; j < s.length(); j++) {
            ans.get(row).add(s.charAt(j));
            if (turn) {
                row++;
                if (row == numRows) {
                    row -= 2;
                    turn = false;
                }
            } else {
                row--;
                if (row == -1) {
                    row += 2;
                    turn = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                sb.append(ans.get(i).get(j));
            }
        }
        return sb.toString();
    }
}