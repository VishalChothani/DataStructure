package QueueLLPackage;



public class QueueLogic {
	
	private class Node
	{
		int data;
		Node next;
	}
	
	public QueueLogic()
	{
		head = null;
		tail = null;
	}
	
	Node tail = new Node();
	Node head = new Node();
	
	public void enqueue(int number)
	{
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		
		if(head==null)
		{
			head =  newNode;	
			tail =  newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void dequeue()
	{
		Node temp = new Node();
		
		temp = head;

		if(head==null)
		{
			System.out.println("No value in Queue");
		}
		else if(head==tail)
		{
			System.out.println("\nDelete successfully");
			head = null; 
		}
		else
		{
			head = head.next;
			System.out.println("\nDelete successfully");
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
