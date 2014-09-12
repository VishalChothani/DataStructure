package sequentialSearchPackage;

public class SequentialSearchLogic {

	void search(int array[], int searchElement)
	{
		boolean flag = false;
		int i;
		for(i = 0; i<array.length; i++)
		{
			if(array[i]==searchElement)
			{
				flag = true;
				break;
			}
			else
			{
				flag = false;
			}
		}
		
		if(flag==true)
		{
			System.out.println("The number is found in position: "+i);
		}
		else
		{
			System.out.println("Number not found");
		}
	}
}
