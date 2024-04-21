package queue;

/**
 * An implementation of a queue using arrays.
 */
public class ArrayQueue {

    private int capacity; // maximum capacity
    private int front; // front pointer
    private int rear; // rear pointer
    private int[] queue; // array to store elements

    
    public ArrayQueue(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getQueue() {
        return queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == capacity;
    }

    /**
     * Adds an element to the rear of the queue.
     *
     * @param element the element to be added
     */
    public void enqueue(int element) {
        if (!isEmpty()) {
            queue[rear] = element;
            rear++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    /**
     * Removes the element from the front of the queue.
     */
    public void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear] = 0; // resetting the last element
            }
            rear--;
        } else {
            System.out.println("Queue is empty!");
        }
    }

    /**
     * Retrieves the front element of the queue without removing it.
     *
     * @return the front element of the queue, or -1 if the queue is empty
     */
    public int front() {
        if (!isEmpty()) {
            return queue[front];
        }
        return -1; // not a clean solution -> Exception Handling should be considered
    }

    /**
     * Displays the elements of the queue.
     */
    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i < rear - 1; i++) {
                System.out.println(queue[i]);
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }
}
