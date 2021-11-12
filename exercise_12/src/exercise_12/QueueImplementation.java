package exercise_12;

class Queue {   
    
    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
      
    static void queueEnqueue(int item)  {   
        if (capacity == rear) {   
            System.out.printf("\nThe queue is full\n");   
            return;   
        }   
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     
    static void queueDequeue()  {   
        if (front == rear) {   
            System.out.printf("\nThe queue is empty\n");   
            return;   
        }   
     
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }   
     
            if (rear < capacity)   
                queue[rear] = 0;   
       rear--;   
        }   
        return;   
    }   
     
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("The queue is Empty\n");   
            return;   
        }   
     
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
     
    static void queueFront()   
    {   
        if (front == rear) {   
            System.out.printf("The queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nThe front element of the queue: %d", queue[front]);   
        return;   
    }   
}   
   
public class QueueImplementation {  
    public static void main(String[] args) {   
    
    	Queue q = new Queue(4);   
     
        System.out.println("Initial Queue is:");  
        q.queueDisplay();   
        q.queueEnqueue(1);   
        q.queueEnqueue(9);   
        q.queueEnqueue(3);   
        q.queueEnqueue(8);   
        System.out.println("Queue after enqueue operation:");  
        q.queueDisplay();   
        q.queueFront();   
        q.queueEnqueue(5);   
        q.queueDisplay();   
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf("\nQueue after two dequeue operations:");   
        q.queueDisplay();   
        q.queueFront();   
    }   
}  