package linkedlists.reverseList;

import org.junit.Test;


import static org.junit.Assert.*;

public class SolutionTest {


    static String printLinkedList(ListNode l) {
        String result = "";
        while(l != null) {
            result += l.val + " -> ";
            l = l.next;
        }
        return result;
    }

    Solution s = new Solution();

    @Test
    public void reverse() {
        ListNode l1 = new ListNode(1);
        ListNode l1Head = l1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1 = l1.next;
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(4);
        ListNode l2Head = l2;
        l2.next = new ListNode(3);
        l2 = l2.next;
        l2.next = new ListNode(2);
        l2 = l2.next;
        l2.next = new ListNode(1);

        assertEquals(printLinkedList(l2Head), printLinkedList(s.reverse(l1Head)));
    }
}