package LinkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();

        for (int i=0; i < 10; i++){
            myList.add(i);
        }
        myList.printNodes();
        System.out.println("kth item from the last: " + myList.getKthItemFromLast(2));
       // myList.removeKthItemFromLast(2);
        myList.removeKthFromLast2(2);
        myList.printNodes();

  //      myList.deleteById(9);
//        myList.deleteById(0);
//        myList.deleteById(2);
    //    System.out.println();


  //      System.out.println("index of 0: " + myList.indexOf(0));



    }
}
