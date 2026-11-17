public class QueueUsingArrayDemo {
    public static void main (String[] args){
        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };
        //creating a queue with capacity 10
        Queue<String> queue = new Queue<>(10);
        //adding first 10 student
        for(int i = 0; i < 10; i++){
            queue.enqueue(students[i]);
        }
        //displaying original queue
        System.out.println("Original Queue: " + queue);
        //displaying queue size
        System.out.println("Queue size: " + queue.size());
        //displaying first student
        System.out.println("Fist Student: " + queue.peek());
        //removing three student
        System.out.println("\nRemoving three students:");
        for(int i = 0; i < 3; i++){
            System.out.println("Removed: " + queue.dequeue());
        }
        //displaying remaining queue
        System.out.println("\nQueue After Removal: " + queue);
        //displaying final queue sizze
        System.out.println("Final Queue Size: " + queue.size());
    }
}
