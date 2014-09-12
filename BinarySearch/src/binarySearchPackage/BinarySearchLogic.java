package binarySearchPackage;

public class BinarySearchLogic {
	
	public void sort(int array[], int searchElement)
	{
		// Insertion Sort
		for(int i = 1; i < array.length ; i++)
		{
			
			int largest_number = array[i];
			int pos=-1;
			
			for(int j = i-1; j >= 0 ; j--)
			{
				if(largest_number < array[j])
				{
					pos = j;					
				}	
				else
				{
					break;
				}
			}
			
			if(pos!=-1)
			{
				for(int m = i; m > pos; m--)
				{
					array[m] = array[m-1];
				}
				array[pos] = largest_number;
			}
		}
		
		boolean result = search(array,array.length,searchElement);
		System.out.println("result: "+result);
	}
	
	public boolean search(int array[], int arrayLength, int searchElement)
	{
		int low = 0;
		int high = arrayLength - 1;
		while(high >= low)
		{
			int mid = low+(high-low)/2;
			if(searchElement > array[mid])
			{
				low = mid + 1;
			}
			else if(searchElement < array[mid])
			{				
				high = mid - 1;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}
