package StackPackage;

public class StackMain {
	
	public static void main(String[] args) {
		
		StackLogic stack = new StackLogic();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.display();
	}

}
