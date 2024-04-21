package queue;

public class Main {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("\n");
        queue.dequeue();
        System.out.println("\n");
        queue.display();
        System.out.println("\n");
        queue.front();
	}

}
