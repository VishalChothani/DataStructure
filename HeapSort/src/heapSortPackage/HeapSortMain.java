package heapSortPackage;

public class HeapSortMain {

	public static void main(String[] args) {
		
		int array[] = {3,0,1,8,7,2,5,10,9,6,4};
		HeapSortLogic hSort = new HeapSortLogic();
		hSort.createHeap(array,array.length);		
	}

}
