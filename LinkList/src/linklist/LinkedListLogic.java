package linklist;

public class LinkedListLogic {

	private class Node
	{
		int data;
		Node next;
	}
	
	Node head = new Node();
	Node tail = new Node();
	
	public void createNewList(int number)
	{
		Node newNode = new Node();		
		
		newNode.data = number;
		newNode.next = null;
		head =  newNode;
		tail =  newNode;
	}
	
	public void addInFront(int number)
	{
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}
	
	public void addInEnd(int number)
	{
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		tail.next = newNode;
		tail = newNode;
	}	
	
	public void addInBetList(int position, int number)
	{
		Node newNode = new Node();
		Node temp = new Node();
		
		temp = head;		
		newNode.data = number;
		newNode.next = null;

		for(int i = 1 ; i < position ; i++)
		{
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;		
	}

	public void deleteFromStart()
	{
		head = head.next;
	}
	
	public void deleteFromInBet(int position)
	{
		Node temp = new Node();
		
		temp = head;		
		
		for(int i = 1 ; i < position ; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next; 
	}
	
	public void deleteFromEnd()
	{
		Node temp = new Node();
		
		temp = head;
		while(temp.next.next!=null)
		{			
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
	}
	
	public void search(int searchData)
	{
		Node temp = new Node();
		boolean flag = false;
		int i = 1;
		
		temp = head;
		while(temp!=null)
		{			
			if(temp.data == searchData)
			{
				flag=true;
				System.out.println("Number is found in position "+i);				
				break;
			}
			i = i+1;
			temp = temp.next;
		}
		if(flag==false)
		{
			System.out.println("Sorry number not found");
		}
	}
	
	public void sort()
	{
		Node temp = new Node();
		Node temp1 = new Node();
		
		temp = head;
		
		while(temp!=null)
		{
			temp1 = temp.next;
			while(temp1!=null)
			{				
				if(temp.data > temp1.data)
				{
					int swap = temp.data;
					temp.data = temp1.data;
					temp1.data = swap;
				}
				temp1 = temp1.next;
			}
			
			temp = temp.next;
		}		
	}
	
	public void reverse()
	{
		Node temp =  new Node();
		Node temp1 =  new Node();
		
		temp = head;
		while(temp.next!=null)
		{
			temp1 = temp.next;
  			temp.next = temp1.next;
  			temp1.next = head;
  			head = temp1;
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
