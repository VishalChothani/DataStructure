package bubbleSortPackage;

public class BubbleSortLogic {

	public void bubbleSort(int array[])
	{
		for(int i=1;i<array.length;i++)
		{
			for(int j=0;j<(array.length);j++)
			{
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
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
