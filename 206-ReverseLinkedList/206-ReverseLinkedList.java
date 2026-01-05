// Last updated: 1/5/2026, 11:24:56 PM
class Solution {
    public ListNode reverseList(ListNode head) {
    //     ListNode node = null;

    //     while (head != null) {
    //         ListNode temp = head.next;
    //         head.next = node;
    //         node = head;
    //         head = temp;
    //     }

    //     return node;        
    // }

    ListNode prev=null;
    ListNode curr=head;
    ListNode temp=null;
    while(curr!=null){
        temp=curr.next;
        curr.next= prev;
        prev=curr;
        curr=temp;


    }
    return prev;
}
}