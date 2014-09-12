package priorityQueuePackage;

public class PriorityQueueLogic {		

	public int[] createHeap(int array[], int arrayLength)
	{
		for(int i = 0; i < (arrayLength/2); i++)
		{
			if(array[i] < array[(2*i)+1])
			{
				int temp = array[i];
				array[i] = array[(2*i)+1];
				array[(2*i)+1] = temp;	
				int j = i;
				while(j>0)
				{
					if(array[j] > array[(j/2)])
					{
						temp = array[j];
						array[j] = array[(j/2)];
						array[(j/2)] = temp;	
					}
					j = j/2;
				}
			}
			
			int rightElementPos = (2*i)+2;

			if(array.length > rightElementPos)
			{
				if(array[i] < array[(2*i)+2])
				{
					int temp = array[i];
					array[i] = array[(2*i)+2];
					array[(2*i)+2] = temp;
					
					int j = i;
					while(j>0)
					{
						if((j/2) > 0)
						{
							if(array[j] > array[(j/2)])
							{
								temp = array[j];
								array[j] = array[(j/2)];
								array[(j/2)] = temp;	
							}
							
						}
						j = j/2;
					}
				}
			}
			
		}	
		
		System.out.println("\nUnSorted Array is:- ");
		//display(array);
		return array;
	}
	
	public int[] add(int array[], int arrayLength, int element)
	{				
		int copyArray[] = new int[arrayLength+1];
		int i = 0;
		for(;i<arrayLength;i++)
		{
			copyArray[i] = array[i];
		}
		copyArray[i] = element;
		copyArray = createHeap(copyArray, copyArray.length);
		display(copyArray);
		return copyArray;
	}
	
	public int[] remove(int array[], int arrayLength)
	{
		int newArray[] = new int[arrayLength-1];
				
		array[0] = array[arrayLength-1];
		for(int i=0,j=0;i<arrayLength-1;i++,j++)
		{
			newArray[j] = array[i];
		}
		array = createHeap(newArray,newArray.length);
		return array;
	}	
	
	private void display(int array[])
	{		
		for(int m = 0; m < array.length ; m++)
		{
			System.out.print("---->"+array[m]);
		}
	}
	
}
