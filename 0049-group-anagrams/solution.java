/*
 * Problem: Group Anagrams (LeetCode #49)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 9 ms (Beats 28.54%)
 * Memory: 49.6 MB (Beats 72.71%)
 * Solved At: 2026-09-18 14:03:45 IST
 * Link: https://leetcode.com/problems/group-anagrams/
 */

class Solution {
    public String sort(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String res = new String(ch);
        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            String copy = sort(str);
            if (map.containsKey(copy)) {
                map.get(copy).add(str);
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(str);
                map.put(copy, new ArrayList<>(arr));
            }
        }
        for (String key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
}