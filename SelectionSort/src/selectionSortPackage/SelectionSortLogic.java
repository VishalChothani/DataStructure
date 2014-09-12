package selectionSortPackage;

public class SelectionSortLogic {
	
	public void selectionSort(int array[])
	{
		for(int i = 0; i < array.length ; i++)
		{
			
			int smallest_number = array[i];
			int pos=0;
			
			for(int j = i+1; j < array.length ; j++)
			{
				
				if(smallest_number > array[j])
				{
					smallest_number = array[j];
					pos = j;
				}
			}
			
			if(pos!=0)
			{
				
				for(int m = pos; m >= i+1; m--)
				{
					array[m] = array[m-1]; 					
				}
			}	
			array[i] = smallest_number;						
		}
		
		System.out.println("Sorted Array is:- ");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print("---->"+array[i]);
		}
	}
	
}
