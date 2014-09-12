package quickSortPackage;

public class QuickSortMain {

	public static void main(String[] args) {
		
		int array[] = {3,0,1,8,7,2,5,4,9,6};
		QuickSortLogic qSort = new QuickSortLogic();
		qSort.quickSort(array,0,array.length-1);		
	}

}
