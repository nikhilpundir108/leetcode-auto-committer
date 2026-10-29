/*
 * Problem: Implement Stack using Queues (LeetCode #225)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42 MB (Beats 98.15%)
 * Solved At: 2026-10-29 10:12:48 IST
 * Link: https://leetcode.com/problems/implement-stack-using-queues/
 */

import java.util.* ;
class MyStack {

    Queue <Integer> q1 = new LinkedList<>();
    Queue <Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1 ;
        while(q1.size()!=1) {
            q2.add(q1.remove());
        }
        int data = q1.remove();
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return data ;
    }
    
    public int top() {
        if(q1.isEmpty()) return -1 ;
        while(q1.size()!=1) {
            q2.add(q1.remove());
        }
        int data = q1.remove();
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        q1.add(data);
        return data ;
    }
    
    public boolean empty() {
        return q1.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */