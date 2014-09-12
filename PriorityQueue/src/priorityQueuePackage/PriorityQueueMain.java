package priorityQueuePackage;

public class PriorityQueueMain {

	public static void main(String[] args) {

		int array[] = {3,0,1,8,7,2,5,10,9,6,4};
		PriorityQueueLogic pQueue = new PriorityQueueLogic();
		array = pQueue.createHeap(array,array.length);
		for(int m = 0; m < array.length ; m++)
		{
			System.out.print("---->"+array[m]);
		}
		
		//array = pQueue.add(array, array.length, 11);
		
		array = pQueue.remove(array, array.length);
		for(int m = 0; m < array.length ; m++)
		{
			System.out.print("---->"+array[m]);
		}
		
		System.out.println("\nLargest Element in array is: "+array[0]);
	}

}
