package linkedlists.addTwoNumbers;

import org.junit.Test;

import static linkedlists.addTwoNumbers.Solution.printListNode;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void addTwoNumbers() {
        Solution.ListNode l1 = new Solution.ListNode(2);
        Solution.ListNode l1Head = l1;
        l1.next = new Solution.ListNode(4);
        l1 = l1.next;
        l1.next = new Solution.ListNode(3);

        Solution.ListNode l2 = new Solution.ListNode(5);
        Solution.ListNode l2Head = l2;
        l2.next = new Solution.ListNode(6);
        l2 = l2.next;
        l2.next = new Solution.ListNode(4);

        Solution.ListNode l3 = new Solution.ListNode(7);
        Solution.ListNode l3Head = l3;
        l3.next = new Solution.ListNode(0);
        l3 = l3.next;
        l3.next = new Solution.ListNode(8);

        printListNode(l3Head);
        printListNode(l1Head);
        printListNode(l2Head);

        Solution.ListNode result = s.addTwoNumbers(l1Head, l2Head);
        printListNode(result);

        assertEquals(l3Head, result);
    }

    @Test
    public void addFives() {
        Solution.ListNode l1 = new Solution.ListNode(5);
        Solution.ListNode l1Head = l1;

        Solution.ListNode l2 = new Solution.ListNode(5);
        Solution.ListNode l2Head = l2;

        Solution.ListNode l3 = new Solution.ListNode(0);
        Solution.ListNode l3Head = l3;
        l3.next = new Solution.ListNode(1);

        printListNode(l3Head);
        printListNode(l1Head);
        printListNode(l2Head);

        Solution.ListNode result = s.addTwoNumbers(l1Head, l2Head);
        printListNode(result);

        assertEquals(l3Head, result);
    }

    @Test
    public void addZero() {
        Solution.ListNode l1 = new Solution.ListNode(1);
        Solution.ListNode l1Head = l1;
        l1.next = new Solution.ListNode(8);

        Solution.ListNode l2 = new Solution.ListNode(0);
        Solution.ListNode l2Head = l2;

        Solution.ListNode l3 = new Solution.ListNode(1);
        Solution.ListNode l3Head = l3;
        l3.next = new Solution.ListNode(8);

        printListNode(l3Head);

        printListNode(l1Head);
        printListNode(l2Head);

        System.out.println("Result: ");
        Solution.ListNode result = s.addTwoNumbers(l1Head, l2Head);
        printListNode(result);

        assertEquals(l3Head, result);
    }

    @Test
    public void addNinety() {
        Solution.ListNode l1 = new Solution.ListNode(9);
        Solution.ListNode l1Head = l1;
        l1.next = new Solution.ListNode(8);

        Solution.ListNode l2 = new Solution.ListNode(1);
        Solution.ListNode l2Head = l2;

        Solution.ListNode l3 = new Solution.ListNode(0);
        Solution.ListNode l3Head = l3;
        l3.next = new Solution.ListNode(9);

        printListNode(l3Head);

        printListNode(l1Head);
        printListNode(l2Head);

        System.out.println("Result: ");
        Solution.ListNode result = s.addTwoNumbers(l1Head, l2Head);
        printListNode(result);

        assertEquals(l3Head, result);
    }

    @Test
    public void addHundred() {
        Solution.ListNode l1 = new Solution.ListNode(9);
        Solution.ListNode l1Head = l1;
        l1.next = new Solution.ListNode(9);

        Solution.ListNode l2 = new Solution.ListNode(1);
        Solution.ListNode l2Head = l2;

        Solution.ListNode l3 = new Solution.ListNode(0);
        Solution.ListNode l3Head = l3;
        l3.next = new Solution.ListNode(0);
        l3 = l3.next;
        l3.next = new Solution.ListNode(1);

        printListNode(l3Head);

        printListNode(l1Head);
        printListNode(l2Head);

        System.out.println("Result: ");
        Solution.ListNode result = s.addTwoNumbers(l1Head, l2Head);
        printListNode(result);

        assertEquals(l3Head, result);
    }
}