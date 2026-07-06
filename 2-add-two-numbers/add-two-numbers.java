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
        ListNode dum = new ListNode(-1);
        ListNode cur=dum;
        int carry=0;
        int sum=0;
        while (l1 != null || l2 != null) {
        sum=carry;
        if(l1!=null){
            sum=l1.val+sum;

        }
        if(l2!=null){
            sum=l2.val+sum;
        }
        ListNode newnode=new ListNode(sum%10);
        carry=sum/10;
        cur.next=newnode;
        cur=cur.next;
        if(l1!=null)  l1=l1.next;
        if(l2!=null)  l2=l2.next;
        }
        if(carry!=0){
            ListNode newnode =new ListNode(carry);
            cur.next=newnode;
            cur=cur.next;
        }
        return dum.next;





        }

    }
