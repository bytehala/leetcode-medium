package linkedlists.reverseList;

public class Solution {

    public ListNode reverse(ListNode l) {

        ListNode current = l;
        ListNode previous = null;
        ListNode pointer = null;
        while(current != null) {
            pointer = current.next;
            current.next = previous;
            previous = current;
            current = pointer;
        }
        return previous;
    }

}

