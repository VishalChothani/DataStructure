package shellSortPackage;

public class ShellSortLogic {


	public void shellSort(int array[])
	{		
		int diff = array.length;

		System.out.println("UNSorted Array is:- ");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print("---->"+array[i]);
		}
		System.out.println();
		
		for(int i = diff/2; i > 0; i = i/2)
		{			
			for(int j = i; j < diff; j++)
			{
				for(int k = j-i; k >= 0; k = k-i)
				{
					if(array[k+i]>=array[k])
						break;
					else
					{
						int tmp = array[k];
						array[k] = array[k+i];
						array[k+i] = tmp;
					}
				}
			}
		}
		
		System.out.println("Sorted Array is:- ");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print("---->"+array[i]);
		}
	}
	
	
	
}
