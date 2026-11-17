public class Queue_ {
    private Node_ front;
    private Node_ rear;
    private int size;
    public Queue_ (){
        //initializing front rear and size
        front = null;
        rear = null;
        size = 0;
    }
    public void enqueue(String customerName){
        //create new node
        Node_ newNode = new Node_(customerName);
        //chek if queue is empty
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        //increasing size
        size++;
    }
    public String dequeue(){
        //check if queue is empty
        if(isEmpty()){
            return null;
        }
        //storing first costumer
        String removedCustomer = front.customerName;
        //moving front to next node
        front = front.next;
        //checking if queue became empty
        if(front == null){
            rear = null;
        }
        //decreasing size
        size--;
        return removedCustomer;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public int size(){
        return size;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        Node_ current = front;
        while(current != null){
            System.out.print(current.customerName);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
