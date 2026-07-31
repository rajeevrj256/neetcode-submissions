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

    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revl1=(l1);
        ListNode revl2=(l2);

        int carry=0;

        ListNode sum=new ListNode();
        ListNode curr=sum;
        while(revl1!=null || revl2!=null || carry !=0){
            int add=carry;
            if(revl1!=null) {
                add=add+revl1.val;
                 revl1=revl1.next;
            }
            if(revl2!=null) {
                add=add+revl2.val;
                 revl2=revl2.next;
            }
          
            ListNode temp=new ListNode(add%10);
            curr.next=temp;
            curr=curr.next;
            carry=add/10;

            
        }


        return (sum.next);

    }
}
