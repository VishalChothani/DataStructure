package mergeSortPackage;

public class MergeSortMain {

	public static void main(String[] args) {
		
		int array[] = {2,4,1,6,1,3,5,7};
		MergeSortLogic merge = new MergeSortLogic();
		merge.split(array,array.length);
	}

}
