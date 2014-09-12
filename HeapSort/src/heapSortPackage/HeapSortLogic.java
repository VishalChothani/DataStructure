package heapSortPackage;

public class HeapSortLogic {
	
	private int copyArray[] = new int[10]; 
	private int pos = 0 ;
		
	public void createHeap(int array[], int arrayLength)
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
		
		System.out.println("\nUN Sorted Array is:- ");
		display(array);		
		heapSort(array);
		System.out.println("\nSorted Array is:- ");
		display(copyArray);
	}
	
	
	private void heapSort(int array[])
	{		
		if(array.length!=1)
		{
			int newArray[] = new int[array.length-1];
			System.out.println(array[0]);
			copyArray[pos] = array[0];
			array[0] = array[array.length-1];
			pos++;
			for(int i=0,j=0;i<array.length-1;i++,j++)
			{
				newArray[j] = array[i];
			}
			createHeap(newArray,newArray.length);
		}
		
	}
	
	private void display(int array[])
	{		
		for(int m = 0; m < array.length ; m++)
		{
			System.out.print("---->"+array[m]);
		}
	}
	
	
}
