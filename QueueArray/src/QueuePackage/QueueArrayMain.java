package QueuePackage;

public class QueueArrayMain {

	public static void main(String[] args) {
		
		QueueArrayLogic stack = new QueueArrayLogic();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		stack.display();
		
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		
		
		stack.isEmpty();
				
		
	}

}
