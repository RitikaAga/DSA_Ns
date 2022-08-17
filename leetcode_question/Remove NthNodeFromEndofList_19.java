class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode p1 = head;
            ListNode p2 = head;
        for(int i =0;i<n;i++){
            p2 = p2.next;  
        }
        if(p2 == null){
            return head.next;
        }
        while(p2.next != null){  
            p1 = p1.next; 
            p2 = p2.next;  
        }
        p1.next = p1.next.next;
        return head;
