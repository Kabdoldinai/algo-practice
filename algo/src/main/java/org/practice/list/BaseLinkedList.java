package org.practice.list;

public class BaseLinkedList {

    public <T extends Comparable<T>> T maxIntInList(ListNode<T> head) {
        ListNode<T> curr = head;
        T maxEl = head.val;

        while (curr != null) {
            if (curr.val.compareTo(maxEl) > 0) {
                maxEl = curr.val;
            }
            curr = curr.next;
        }

        return maxEl;
    }

    public <T> ListNode<T> reverse(ListNode<T> head) {
        ListNode<T> prev = null;
        ListNode<T> curr = head;

        while (curr != null) {
            ListNode<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
