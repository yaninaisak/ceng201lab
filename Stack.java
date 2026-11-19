public class Stack {
    private char[] items;
    private int top;
    public Stack(int capacity){
        items = new char[capacity];
        //initislazing top
        top = -1;
    }
    public void push(char value){
        //checking if stack is full
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        //increasing top
        top++;
        //adding character
        items[top] = value;
    }
    public char pop(){
        //checking if stack is empty
        if(isEmpty()){
            return '\0';
        }
        //storing top character
        char removedValue = items[top];
        //decreasing top
        top--;
        return removedValue;
    }
    public char peek(){
        //checking if stack is empty
        if(isEmpty()){
            return '\0';
        }
        //returning top character
        return items[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == items.length - 1;
    }
}
