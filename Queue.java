public class Queue<T>{
    private T[] items;
    private int front;
    private int rear;
    private int count;
    @SuppressWarnings("Unchecked")
    public Queue(int capacity){
        items = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(T value){
        //chek if queue is full
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        //move rear to the next position
        rear++;
        //ad new element
        items[rear] = value;
        //increase count
        count++;
    }
    public T dequeue(){
        //check if queue is empty
        if(isEmpty()){
            return null;
        }
        //storing first element
        T removedValue = items[front];
        //removing first element
        items[front] = null;
        //moving front to the next position
        front++;
        //decreasing count
        count--;
        return removedValue;
    }
    public T peek(){
        //chekcing if queue is empty
        if(isEmpty()){
            return null;
        }
        //return first element
        return items[front];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return count == items.length;
    }
    public int size(){
        return count;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < count; i++){
            int index = front + i;
            result.append(items[index]);
            if(i < count -1){
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
