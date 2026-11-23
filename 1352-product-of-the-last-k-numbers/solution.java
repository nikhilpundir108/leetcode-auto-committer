/*
 * Problem: Product of the Last K Numbers (LeetCode #1352)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 17 ms (Beats 94.46%)
 * Memory: 84.4 MB (Beats 42.73%)
 * Solved At: 2026-11-23 17:41:14 IST
 * Link: https://leetcode.com/problems/product-of-the-last-k-numbers/
 */

class ProductOfNumbers {
    ArrayList<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        list.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            list.clear();
            list.add(1);
        } else {
            int last = list.get(list.size() - 1);
            list.add(last * num);
        }
    }

    public int getProduct(int k) {
        int n = list.size();
        if (k >= n) {
            return 0;
        }
        return list.get(n - 1) / list.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */