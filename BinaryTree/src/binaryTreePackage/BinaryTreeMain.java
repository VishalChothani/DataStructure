package binaryTreePackage;

public class BinaryTreeMain {

	public static void main(String[] args) {
		
		BinaryTreeNode node = null;
		
		BinaryTreeLogic bt = new BinaryTreeLogic();
		
		bt.add(node, 40);
		bt.add(node, 20);
		bt.add(node, 25);
		bt.add(node, 35);
		bt.add(node, 15);
		bt.add(node, 50);
		bt.add(node, 60);
		
		bt.search(30);
				
		bt.noOfNodes();
	}

}
