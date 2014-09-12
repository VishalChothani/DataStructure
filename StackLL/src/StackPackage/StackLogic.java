package StackPackage;

public class StackLogic {

	private class Node
	{
		int data;
		Node next;
	}
	
	public StackLogic()
	{
		head = null;
	}
	
	Node top = new Node();
	Node head = new Node();
	
	public void push(int number)
	{
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		
		if(head==null)
		{
			head =  newNode;	
			top =  newNode;
		}
		else
		{
			top.next = newNode;
			top = newNode;
		}
	}
	
	public void pop()
	{
		Node temp = new Node();
		
		temp = head;

		if(head==null)
		{
			System.out.println("No value in stack");
		}
		else if(head==top)
		{
			System.out.println("\nDelete successfully");
			head = null; 
		}		
		else
		{
			while(temp.next.next!=null)
			{			
				temp = temp.next;
			}
			top = temp;
			top.next = null;
			System.out.println("\nDelete successfully");
		}		
	}
	
	public void isEmpty()
	{
		if(head==null)
		{
			System.out.println("Yes, the stack is empty");
		}
		else
		{
			System.out.println("No, the stack is not empty");
		}
	}
	
	public void display()
	{
		Node temp = new Node();
		
		temp = head;
		while(temp!=null)
		{
			System.out.print("--->"+temp.data);
			temp = temp.next;
		}
	}
	
}
