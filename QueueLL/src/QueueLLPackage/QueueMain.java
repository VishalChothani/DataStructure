package QueueLLPackage;

public class QueueMain {

	public static void main(String[] args) {
		
		QueueLogic queue = new QueueLogic();
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.display();

	}

}
