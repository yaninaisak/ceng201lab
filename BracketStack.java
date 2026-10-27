public class BracketStack {
    //create node class
    private class Node {
        char data;
        Node next;
        //node constructor
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public BracketStack(){
        this.top = null;
    }
    //adding element to the top of the stack
    public void push(char value){
        //create new node
        Node newNode = new Node(value);
        //connecting the new to the current top
        newNode.next = top;
        //updating top
        top = newNode;
    }
    //remove and return top element
    public char pop(){
        //cheking if it is empty
        if(isEmpty()){
            return '\0';
        }
        //saving the top value
        char value = top.data;
        //move to the next node
        top = top.next;
        return value;
    }
    //retur top element without removing it
    public char peek(){
        //cheking if it is empty
        if(isEmpty()){
            return '\0';
        }
        //return top value
        return top.data;
    }
    //cheking when the stack is empty
    public boolean isEmpty(){
        return top == null;
    }
}
