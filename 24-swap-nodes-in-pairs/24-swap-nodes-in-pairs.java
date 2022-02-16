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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode first = head;
        int index = 0;
        
        List<ListNode> odd = new ArrayList<>();
        List<ListNode> even = new ArrayList<>();
        ListNode lastNode = null;
        
        while(first != null) {
            
            //keep track of the lastNode if
            //our node list is odd length
            if(first.next == null && index % 2 == 0)             {
                lastNode = first;
                break;
            }
            
            if(index % 2 == 0) {
                even.add(first);
            } else {
                odd.add(first);
            }
            
            ListNode temp = first;
            first = first.next;
            temp.next = null;
            
            index++;
        }
        
        // Alternate adding between odd and even
        // lists in the reverse order to the new list
        // which always begins at the previous first odd node
        ListNode newHead = odd.get(0);
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 1; i <= index; i++) {
            if(i % 2 == 0) {
                newHead.next = even.get(evenIndex);
                evenIndex++;
            } else {
                newHead.next = odd.get(oddIndex);
                oddIndex++;
            }
            newHead = newHead.next;
        }
        
        //if the list of nodes is odd in length,
        //we don't swap the last node
        if(lastNode != null) {
            newHead.next = lastNode;
        }
    
        return odd.get(0);
    }
}