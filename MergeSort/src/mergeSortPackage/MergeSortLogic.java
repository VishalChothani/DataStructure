package mergeSortPackage;

public class MergeSortLogic {

	public void split(int array[],int end)
	{
		final int MAX = 10;
		int start = 0;
		//int end = array.length;
		int mid = (start+end)/2;
		int[] leftArray = new int[MAX]; 
		int[] rightArray = new int[MAX];
		int j = 0;
		int i = 0;
		int k = 0;
		
		if(end < 2)
		{			
			return;
		}
		
		for(i=0; i<mid;i++)
		{
			leftArray[i] = array[i];
		}
		
		for(k=mid; k<array.length;k++)
		{
			rightArray[j] = array[k];
			j++;
		}

		split(leftArray,i);
		split(rightArray,mid);
		
		merge(leftArray, i, rightArray, mid, array);	
		
	}
	
	public void merge(int leftArray[], int leftArrayLength, int rightArray[], int rightArrayLength, int wholeArray[])
	{
		int k = 0;
		int i = 0;
		int j = 0;
		while(i < leftArrayLength && j < rightArrayLength )
		{
			if(leftArray[i] <= rightArray[j])
			{
				wholeArray[k] = leftArray[i];				
				i++;
			}
			else
			{
				wholeArray[k] = rightArray[j];				
				j++;
			}
			k++;
		}
		
		System.out.println("\n========================= Array =========================");
		for(int m = 0; m< wholeArray.length; m++)
		{
			System.out.print("\t"+wholeArray[m]);
		}
	}
}
