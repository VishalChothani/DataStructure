package insertionSortPackage;

public class InsertionSortLogic {
	
	public void insertionSort(int array[])
	{
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
		
		System.out.println("Sorted Array is:- ");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print("---->"+array[i]);
		}
		
	}
	
}
