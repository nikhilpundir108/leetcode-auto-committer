/*
 * Problem: Design HashSet (LeetCode #705)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 13 ms (Beats 64.62%)
 * Memory: 53.9 MB (Beats 62.97%)
 * Solved At: 2026-10-30 11:49:05 IST
 * Link: https://leetcode.com/problems/design-hashset/
 */

class MyHashSet {

    boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */