/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode previous = null;
        ListNode next = null;
        while(temp!=null){
            next = temp.next;
            temp.next = previous;
            previous = temp;
            temp=next;
        }
        head = previous;
        return head;
    }
}
