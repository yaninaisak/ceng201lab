public class TokenStack {
    private class Node {
        String data;
        Node next;
        //creating constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //top pointer of the stack
    private Node top;
    public TokenStack(){
        this.top = null;
    }
    //ad element to the top of the stack
    public void push(String value){
        //creating a new node
        Node newNode = new Node(value);
        //connecting it to the current top
        newNode.next = top;
        //updating top
        top = newNode;
    }
    //remove and return top element
    public String pop(){
        //check if stack ist empty
        if(isEmpty()){
            return null;
        }
        //save the top value
        String value = top.data;
        //move top to the next node
        top = top.next;
        return value;
    }
    //chek when the stack is empty
    public boolean isEmpty(){
        return top == null;
    }
}
