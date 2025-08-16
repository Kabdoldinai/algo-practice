package list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.list.BaseLinkedList;
import org.practice.list.ListNode;

class BaseLinkedListTest {

    private BaseLinkedList baseLinkedList;

    @BeforeEach
    void onSetUp() {
        this.baseLinkedList = new BaseLinkedList();
    }


    @Test
    void shouldReturnMaxElementwhenGivenListofNodes() {
        ListNode<Integer> head = new ListNode<>(4);
        head.next = new ListNode<>(9);
        head.next.next = new ListNode<>(2);
        head.next.next.next = new ListNode<>(6);


        Assertions.assertEquals(9, baseLinkedList.maxIntInList(head));
    }

    @Test
    void shouldReverseListWhenGivenListOfNodes() {
        ListNode<Integer> head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        head.next.next = new ListNode<>(3);

        ListNode<Integer> reversed = baseLinkedList.reverse(head);

        Assertions.assertEquals(3, reversed.val);
        Assertions.assertEquals(2, reversed.next.val);
        Assertions.assertEquals(1, reversed.next.next.val);
        Assertions.assertNull(reversed.next.next.next);

    }

}
