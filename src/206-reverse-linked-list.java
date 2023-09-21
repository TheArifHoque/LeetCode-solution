/*
LinkedList problem
Iterative version
Use three pointers and so you can change the next of the mid to the first one
without losing the track of the original left.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode nextCurrent = null;
        while (current!=null){
            nextCurrent = current.next;
            current.next = prev;
            prev = current;
            current = nextCurrent;
        }
        return prev;
    }
}

//Recursive version
//Recursive version
class Solution2 {

    public ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    public ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }
}