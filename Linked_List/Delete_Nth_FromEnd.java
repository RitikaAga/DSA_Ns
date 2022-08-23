public Node  removeNthFromEnd(int data){
        if(head==null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(data==size){
            return head.next;
        }

        int indexToRemove = size-data;
        int i = 1;
        Node prev = head;
        while(i<indexToRemove){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
