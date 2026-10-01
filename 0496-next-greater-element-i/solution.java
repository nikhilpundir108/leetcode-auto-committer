/*
 * Problem: Next Greater Element I (LeetCode #496)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 73.17%)
 * Memory: 45.3 MB (Beats 48.88%)
 * Solved At: 2026-09-30 15:45:06 IST
 * Link: https://leetcode.com/problems/next-greater-element-i/
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums2.length;
        st.push(nums2[n - 1]);
        map.put(nums2[n - 1], -1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}