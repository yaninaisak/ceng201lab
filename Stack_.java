public class Stack_ {
    private Node3 top;
    public Stack_(){
        top = null;
    }
    public void push(String value){
        //creating new node
        Node3 newNode = new Node3(value);
        //connecting new to the top
        newNode.next = top;
        //updating top
        top = newNode;
    }
    public String pop(){
        //checking if stack is empty
        if(isEmpty()){
            return null;
        }
        //storing top value
        String removedValue = top.data;
        //moving to the next node
        top = top.next;
        return removedValue;
    }
    public String peek(){
        //cheking if stack is empty
        if(isEmpty()){
            return null;
        }
        //returning top value
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void display(){
        //checking if stack is empty
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        //traversing the stack
        Node3 current = top;
        while (current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
