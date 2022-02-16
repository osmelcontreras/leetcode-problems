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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null){
            return null;
        }
        
        //calcaute the size of the linkedlist
        int size =0; 
        ListNode currNode = head;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }
        //calculate the indexTOSearch from front side of linked list
        int indexToSearch = size - n;
        if(n == size){
            return head.next;
        }
        
        //traverse to the previous node to the node which is to be removed and link the previous node to the next of next node
        ListNode prev = head;
        int i = 1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
        
        
        
    }
}
