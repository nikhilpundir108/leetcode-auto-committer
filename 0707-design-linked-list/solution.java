/*
 * Problem: Design Linked List (LeetCode #707)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 10 ms (Beats 46.69%)
 * Memory: 46.8 MB (Beats 75.73%)
 * Solved At: 2026-10-12 14:54:35 IST
 * Link: https://leetcode.com/problems/design-linked-list/
 */


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0); 
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}
