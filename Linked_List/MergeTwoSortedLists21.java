//Recursive solution

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
           if(list1 == null){
       return list2;
   }
    if(list2==null){
        return list1;
    }
    if(list1.val<list2.val){
        list1.next = mergeTwoLists(list1.next , list2);
        return list1;
    }
    else{
        list2.next = mergeTwoLists(list2.next , list1);
    }
     return list2;
    }
}

// iterative solution


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
           
    
        
        ListNode h = new ListNode(-1,null);
        ListNode t = h;
        
        while(list1!= null && list2!= null){
            if(list1.val<=list2.val){
                t.next = list1;
                list1 = list1.next;
            }
            else{
                t.next = list2;
                list2 = list2.next;
            }
            t=t.next;
        }
        
        if(list1!=null){
             t.next = list1;
                t=t.next;
                list1 = list1.next;
        }
        else if(list2!=null){
            t.next = list2;
                t=t.next;
                list2 = list2.next;
        }
        
        return h.next;
		
    }
}
