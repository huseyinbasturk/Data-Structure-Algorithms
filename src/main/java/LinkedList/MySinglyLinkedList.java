package LinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;
    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        //create a new node object from data
        Node node = new Node(data);
        if(isEmpty()){ // if the list is empty
            head = tail = node;
        }else { //if there are elements in list
            tail.next = node;
            tail = node;

        }
        size++;
    }

    //1. Implement a method that makes the insertion into first element of LinkedList
    void addFirst(int data){
        //create a new node object from data
        Node node = new Node(data);
        //case 1: list empty
        if(isEmpty()){
            head=tail=node;
        }else {
            //case 2: list is not empty
            node.next = head;
            head=node;
        }
        //increase size
        size++;

    }

//    Question: Get Kth Item From the End of the Linked List
//
//1. You don’t know the size of the singly linked list.
//2. Find the Kth item from the end of the Linked List in one pass.
//            3. Item already exists in the linked list.
//
//• Input: 1 -> 2 -> 3 -> 4, K = 3
//    Output: 2
//
//            • Input: 35 -> 15 -> 4 -> 20, K = 4
//    Output: 35

    int getKthItemFromLast(int k){
        //create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        //move ptr2 k-1 times
        for (int i=0; i < k-1; i++){
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        //ptr1 is on the kth element from the last
        return ptr1.id;
    }
//
//    Question: Remove Kth Node From the End
//
//1. You don’t know the size of the singly linked list.
//2. Remove the Kth node from the end of the Linked List in one pass.
//
//            • Input: 1 -> 2 -> 3 -> 4, K = 3
//    Output: : 1 -> 3 -> 4
//
//            • Input: 35 -> 15 -> 4 -> 20, K = 4
//    Output: 15 -> 4 -> 20
    void removeKthItemFromLast(int k){
        //create three pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        //move ptr2 k-1 times
        for (int i=0; i < k-1; i++){
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            prev = ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        //ptr1 is on the kth element from the last
        //do delete operation
        if(ptr1==head){
            head = ptr1.next;
            ptr1.next = null;

        }else if(ptr1==tail){
            tail = prev;
            prev.next = null;
        }else {
            prev.next = ptr1.next;
            ptr1.next = null;
        }
        size--;
    }

    void removeKthFromLast2(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for(int i=0;i<k-1;i++){
            ptr2 = ptr2.next;

            if(ptr2==null) System.out.println("less than k elements");
            else if(ptr2.next==null){
                head=ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        ptr1.next = ptr1.next.next;
        ptr1=ptr1.next;
        ptr1=null;

    }
    void deleteById(int id){
        //check if empty
        if(isEmpty()) System.out.println("List is empty");

        //assign  prev end current with head
        Node prev = head;
        Node current = head;
        while(current!=null){
            if(current.id ==id){
                //there is a match
                //case 1: head
                if(current==head){
                    head=current.next;
                    current.next = null;
                }
                //case2: tail
                else if(current==tail){
                    tail=prev;
                    prev.next = null; // ex-tail will be eligible for garbage collection
                }
                //case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                //after deletion
                size--;
            }
            //move forward
            prev = current;
            current = current.next;

        }

    }
//  1. Find the indexOf an element and return it.
//  2. If not found return -1.
//
//    int indexOf (int id) {
// write your code here
//
//...........
//        return -1;
//    }

    int indexOf(int id){
        if(isEmpty()) return -1;
        int position = 0;
        //iterate through the list
        Node current = head; // set my current with the starting element
        while(current != null){
            if(current.id == id) return position;
            position++;
            current = current.next;
        }
        return -1;

    }


    void printNodes(){
        Node current = head;
        while(current!=null){
            if(current.next == null) {
                System.out.println(current.id + " => null");
            } else {
                System.out.print(current.id + " => ");

            }
            current = current.next;

        }
        //System.out.println();
    }
}
