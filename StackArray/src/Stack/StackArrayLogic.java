package Stack;

public class StackArrayLogic {
	
	private int MAX = 5;
	private int[] stackArray;
	private int top;
	
	public StackArrayLogic()
	{		
		stackArray = new int[MAX];
		top = -1;
	}
	
	public void push(int number)
	{		
		top++;
		stackArray[top] = number;
		if(top==MAX-1)
		{			
			resize(MAX*2);
		}			
		
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("No Elemetns to Delete");
		}
		else
		{
			System.out.println("Succesfully Deleted");
			top--;
			if(top==((MAX-1)/4))
			{
				resize(MAX/2);				
			}
		}
				
	}
	
	public void isEmpty()
	{
		if(top==-1)
		{
			System.out.println("Yes it is Empty");
		}
		else
		{
			System.out.println("It is not empty");
		}
	}
	
	public void display()
	{
		for(int i=0 ; i<= top ; i++)
		{
			System.out.print("--->"+stackArray[i]);
		}
		System.out.println("");
	}
	
	public void resize(int arraySize)
	{
		int[] stackArrayCopy = new int[arraySize];
		for(int i=0 ; i<= top ; i++)
		{
			stackArrayCopy[i] = stackArray[i];
		}
		stackArray = stackArrayCopy;
		MAX = arraySize;
	}
}
