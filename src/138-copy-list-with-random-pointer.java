/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import org.w3c.dom.Node;

import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node, Node> hashMap = new HashMap<>();
        while(cur!=null){
            hashMap.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}