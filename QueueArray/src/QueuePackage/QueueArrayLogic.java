package QueuePackage;

public class QueueArrayLogic {

	private int MAX = 5;
	private int[] queueArray;
	private int front;
	private int rear;
	
	public QueueArrayLogic()
	{		
		queueArray = new int[MAX];
		front = -1;
		rear = -1;
	}
	
	public void push(int number)
	{		
		rear++;
		queueArray[rear] = number;
		
		if(rear==(MAX-1))
		{	
			resize(MAX*2,"increase");			
		}					
		
	}
	
	public void pop()
	{		
		if((front+1)==rear)
		{
			System.out.println("No Elemetns to Delete");
		}
		else
		{
			System.out.println("Succesfully Deleted");
			front++;			
			if((rear-front)==((MAX-1)/4))
			{				
				resize(MAX/2,"decrease");				
			}
			
		}				
	}
	
	public void isEmpty()
	{
		if((front+1)==rear)
		{
			System.out.println("\nYes it is Empty");
		}
		else
		{
			System.out.println("\nIt is not empty");
		}
	}
	
	public void display()
	{
		
		for(int i=front+1 ; i<= rear ; i++)
		{
			System.out.print("--->"+queueArray[i]);
		}
		System.out.println("");
	}
	
	public void resize(int arraySize, String operation)
	{
		int[] queueArrayCopy = new int[arraySize];
		int j=0;
		
		if(operation=="increase")
		{
			for(int i=front+1 ; i<= rear ; i++)
			{
				queueArrayCopy[i] = queueArray[i];
			}
		}
		else if(operation=="decrease")
		{

			for(int i=front+1 ; i<= rear ; i++)
			{
				queueArrayCopy[j] = queueArray[i];
				j++;
			}
			front=-1;
			rear = j-1;
		}
		queueArray = queueArrayCopy;
		
		MAX = arraySize;
	}
}
