/*
 * Problem: Min Stack (LeetCode #155)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 36 ms (Beats 26.72%)
 * Memory: 99.3 MB (Beats 81.50%)
 * Solved At: 2026-11-25 01:00:02 IST
 * Link: https://leetcode.com/problems/min-stack/
 */

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int value) {
        st.push(value);
        if (minSt.isEmpty()) {
            minSt.push(value);
        } else {
            minSt.push(Math.min(value, minSt.peek()));
        }
    }

    public void pop() {
        int k = st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */