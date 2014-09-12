package quickSortPackage;

public class QuickSortLogic {

	public void quickSort(int array[], int low, int high)
	{
		int pivot = array[low];
		int j = high;				
		int i = low+1;
		
		for(int m = i; m <= j ; m++)
		{
			System.out.print("---->"+array[m]);
		}
		
		for(;j>i;)
		{
			while(array[i]<=pivot)
			{
				i++;
			}
			
			while(array[j]>pivot)
			{
				j--;				
			}
			
			if(j>i)
			{				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;		
			}
		}
		
		int temp = array[low];
		array[low] = array[j];
		array[j] = temp;
		
		if (low < j)
		{
            quickSort(array, low, j-1);
		}
		if (i < high)
		{
            quickSort(array, i, high);
		}
		
		System.out.println("Sorted Array is:- ");
		for(int m = 0; m < array.length ; m++)
		{
			System.out.print("---->"+array[m]);
		}
		
		
	}
	
	
}
