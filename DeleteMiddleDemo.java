public class DeleteMiddleDemo {
    public static void main(String[] args){
        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();
        //creating odd list
        SinglyLinkedList list1 = new SinglyLinkedList();
        //add node to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        //display original list
        System.out.println("Original List 1: ");
        list1.display();
        //deleting middle node
        list1.deleteMiddle();
        // display list after deleting
        System.out.println("After deleting middle: ");
        list1.display();
        System.out.println();
        // creating even list
        SinglyLinkedList list2 = new SinglyLinkedList();
        //add node to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        //displaying original list
        System.out.println("Original List 2: ");
        list2.display();
        //deleting middle node
        list2.deleteMiddle();
        //displaying list after delete
        System.out.println("After deleting middle: ");
        list2.display();
        System.out.println();
        // creating a single node
        SinglyLinkedList list3 = new SinglyLinkedList();
        //adding one node to the list
        list3.add(999);
        //display orgiginal list
        System.out.println("Original List 3: ");
        list3.display();
        //deleting node
        list3.deleteMiddle();
        //displaying list after deleting
        System.out.println("After deleting middle: ");
        list3.display();
    }
}
