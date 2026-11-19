public class Queue3 {
    private char[] items;
    private int front;
    private int rear;
    private int count;
    public  Queue3(int capacity){
        items = new char[capacity];
        //initialization
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(char value){
        //checking if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        //moving rear to next position
        rear = (rear + 1) % items.length;
        //adding character
        items[rear] = value;
        //increasing count
        count++;
    }
    public char dequeue() {
        //checking if queue is empty
        if (isEmpty()) {
            return '\0';
        }
        //storing first character
        char removedValue = items[front];
        //moving front to next position
        front = (front + 1) % items.length;
        //decreasing count
        count--;
        return removedValue;
    }
    public char peek() {
        //checking if queue is empty
        if (isEmpty()) {
            return '\0';
        }
        //returning first character
        return items[front];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == items.length;
    }
    public int size() {
        return count;
    }
}
