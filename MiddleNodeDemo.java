public class MiddleNodeDemo {
    public static void  main (String[] args){
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();
        // creating odd list
        SinglyLinkedList list1 = new SinglyLinkedList();
        // add node to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        //displaying list
        System.out.println("List 1: ");
        list1.display();
        //find and print middle node
        Node middle1 = list1.findMiddle();
        System.out.println("Middle Node: " + middle1.data);
        System.out.println();
        //creating even list
        SinglyLinkedList list2 = new SinglyLinkedList();
        //add node to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        //displaying list
        System.out.println("List 2: ");
        list2.display();
        //find and print middle node
        Node middle2 = list2.findMiddle();
        System.out.println("Middle Node: " + middle2.data);
        System.out.println();
    }
}
