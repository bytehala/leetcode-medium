package linkedlists.addTwoNumbers;

class Solution {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void printListNode(ListNode l) {
        while(l != null) {
            System.out.print(l.val + " -> ");
            l = l.next;
        }
        System.out.println();
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resultPointer = result;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;

            result.next = new ListNode(sum % 10);

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            result = result.next;
        }


        if(carry == 1) {
            result.next = new ListNode(1);
        }

        return resultPointer.next;
    }
}