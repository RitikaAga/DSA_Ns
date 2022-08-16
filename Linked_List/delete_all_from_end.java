// 11 2 3 4 5
// input 5 3
// output  1 2 3 

static void delete_end(Node head,int m)
    {
       for(int i = 1; i<m;i++){
           if(head != null){
               head = head.next;
           }
       }
       if(head != null)
       head.next = null;
    }
