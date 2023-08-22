package LinkedList;

import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1.id);
        System.out.println(node1.next.id + " - Id of the second node");

        Node current;
        Node head = node1;
        current = head;
        while(current!=null){
            System.out.println("Id of " + current.id);
            current=current.next;
        }


    }

    ArrayList<Node> nodeArrayList = new ArrayList<>();
}
