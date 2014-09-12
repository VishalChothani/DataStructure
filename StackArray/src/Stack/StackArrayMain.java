package Stack;

public class StackArrayMain {

	public static void main(String[] args) {
		
		StackArrayLogic stack = new StackArrayLogic();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		
		stack.isEmpty();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		

		stack.display();
	}

}
