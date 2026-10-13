public class SinglyLinkedList {
    //definding variable
    private Node head;
    //creating constructor
    public SinglyLinkedList(){
        head = null;
    }
    // add a node to the end of the list
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    //display the linked list
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    //find a middle node
    public Node findMiddle(){
        if(head == null){
            return null;
        }
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        int middleIndex = count / 2;
        current = head;
        for (int i = 0; i < middleIndex; i++){
            current = current.next;
        }
        return current;
    }
    //delete middle node
    public void deleteMiddle(){
        if(head == null){
            return;
        }
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        // if there is only one node
        if(count == 1){
            head = null;
            return;
        }
        int middleIndex = count / 2;
        current = head;
        for (int i = 0; i < middleIndex - 1; i++){
            current= current.next;
        }
        current.next = current.next.next;
    }
    //get head
    public Node getHead(){return head;}
}
