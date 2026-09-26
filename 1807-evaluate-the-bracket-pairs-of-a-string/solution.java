/*
 * Problem: Evaluate the Bracket Pairs of a String (LeetCode #1807)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 34 ms (Beats 79.64%)
 * Memory: 94 MB (Beats 49.77%)
 * Solved At: 2026-09-26 20:26:38 IST
 * Link: https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
 */

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        char[] a = s.toCharArray();
        int i = 0;
        int n = a.length;
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        while (i < n) {
            if (a[i] == '(') {
                i++;
                while (a[i] != ')') {
                    temp.append(a[i]);
                    i++;
                }
                boolean found = false;
                if (map.containsKey(temp.toString())) {
                    ans.append(map.get(temp.toString()));
                    found = !found;
                }
                if (!found) {
                    ans.append("?");
                }
                temp.setLength(0);
            } else {
                ans.append(a[i]);
            }
            i++;
        }
        return ans.toString();
    }
}