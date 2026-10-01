/*
 * Problem: Online Stock Span (LeetCode #901)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 41 ms (Beats 7.91%)
 * Memory: 57.2 MB (Beats 11.88%)
 * Solved At: 2026-10-01 11:34:14 IST
 * Link: https://leetcode.com/problems/online-stock-span/
 */

class StockSpanner {
    Stack<Integer> prices;
    Stack<Integer> spans;
    public StockSpanner() {
        prices = new Stack<>();
        spans = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            span += spans.pop();
        }
        prices.push(price);
        spans.push(span);
        return span;
    }
}