package org.practice.list;

public class ListNode<T> {

    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
    }

    public ListNode(T val, ListNode<T> next) {
        this.val = val;
        this.next = next;
    }

}
