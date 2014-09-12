package binaryTreePackage;

public class BinaryTreeLogic {

	BinaryTreeNode root;
	BinaryTreeNode temp;
	int count = 0;
	int leafCount = 0;
	int leftHeight = 0;
	int rightHeight = 0;
	int maxHeight = 0;
	int particularDepth = 0;
	int findDepthValue = 20;
	int deleteNode = 20;
	
	public void add(BinaryTreeNode node,int value)
	{
		BinaryTreeNode newNode = new BinaryTreeNode(value);
		
		if(root==null)
		{
			root = newNode;
			System.out.println("Root Node'z value is: "+root.value);			
		}
		else
		{	
			BinaryTreeNode temp = root;
			BinaryTreeNode parent;
			
			while(true)
			{
				parent = temp;
				//System.out.println("\nTemp value: "+temp.value);
				if(value < temp.value)
				{
					temp = temp.leftChild;
					if(temp == null)
					{
						parent.leftChild = newNode;
						System.out.println(newNode.value+" is to the left of "+parent.value);
						return;
					}
				}
				else
				{
					temp = temp.rightChild;
					if(temp == null)
					{
						parent.rightChild = newNode;
						System.out.println(newNode.value+" is to the right of "+parent.value);
						return;
					}
				}					
			}
		}			
		
	}
	

	public void search(int searchNumber)
	{		
		temp = root;
		while(true)
		{
			if(temp==null)
			{
				System.out.println(searchNumber +" is NOT present in Binary Tree");
				System.out.println("\n================== PREORDER ==================\n");
				preOrder(root);
				System.out.println("\n================== INORDER ==================\n");
				inOrder(root);
				System.out.println("\n================== POSTORDER ==================\n");
				postOrder(root);
				leafNode(root);
				heightOfTree(root);
				particularDepth = depthOfTime(root,findDepthValue);
				System.out.println("\nHeight of the tree is: "+maxHeight);
				System.out.println("\nDepth of the node "+findDepthValue+" is: "+particularDepth);
				System.out.println("\n================== After Delete ==================\n");
				removeNode(deleteNode);
				preOrder(root);
				return;
			}
			if(temp.value == searchNumber)
			{
				System.out.println(searchNumber +" is present in Binary Tree");
				System.out.println("\n================== PREORDER ==================\n");
				preOrder(root);
				System.out.println("\n================== INORDER ==================\n");
				inOrder(root);
				System.out.println("\n================== POSTORDER ==================\n");
				postOrder(root);
				leafNode(root);
				maxHeight = heightOfTree(root);
				particularDepth = depthOfTime(root,findDepthValue);
				System.out.println("\nHeight of the tree is: "+maxHeight);
				System.out.println("\nDepth of the node "+findDepthValue+" is: "+particularDepth);
				System.out.println("\n================== After Delete ==================\n");
				removeNode(deleteNode);
				preOrder(root);
				return;
			}
			else if(temp.value > searchNumber)
			{
				temp = temp.leftChild;
			}
			else if(temp.value < searchNumber)
			{
				temp = temp.rightChild;  	 
			}			
		}		
	}
	
	private void inOrder(BinaryTreeNode node)
	{
		if(node==null)
		{
			return;
		}
		inOrder(node.leftChild);
		System.out.print("-----> "+node.value);
		inOrder(node.rightChild);
	}
	
	private void preOrder(BinaryTreeNode node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print("-----> "+node.value);
		preOrder(node.leftChild);		
		preOrder(node.rightChild);
	}
	
	private void postOrder(BinaryTreeNode node)
	{
		if(node==null)
		{
			return;
		}
		postOrder(node.leftChild);		
		postOrder(node.rightChild);
		System.out.print("-----> "+node.value);	
		count++;
	}
	
	public void noOfNodes()
	{
		System.out.println("\nNumber of nodes are: "+count);
		System.out.println("\nNo of leaf Nodes: "+leafCount);
	}
	
	public void leafNode(BinaryTreeNode node)
	{
		if(node==null)
		{
			return;
		}
		else if(node.leftChild==null && node.rightChild==null)
		{			
			leafCount++;
		}
		leafNode(node.leftChild);
		leafNode(node.rightChild);		
	}
	
	public int heightOfTree(BinaryTreeNode node)
	{
		if(node==null)
		{
			return 0;
		}
		leftHeight =  heightOfTree(node.leftChild) + 1;
		rightHeight =  heightOfTree(node.rightChild) + 1;
		
		if(leftHeight > rightHeight)
		{
			return leftHeight;
		}
		else
		{
			return rightHeight;
		}
	}
	
	public int depthOfTime(BinaryTreeNode node, int depthNumber)
	{
		if(node==null)
		{
			return -1;
		}		
		else
		{
			particularDepth++;
			
			if(node.value < depthNumber)
			{
				depthOfTime(node.rightChild, depthNumber);
			}
			else if(node.value > depthNumber)
			{
				depthOfTime(node.leftChild, depthNumber);
			}
			else if(node.value == depthNumber)
			{
				return particularDepth;
			}
		}
		return particularDepth;
	}
	
	public void removeNode(int deleteNodeValue)
	{
		temp = root;
		if(temp == null)
		{
			return;
		}
		else
		{
			while(true)
			{
				if(temp.leftChild!=null)
				{
					if(temp.leftChild.value == deleteNodeValue)
					{
//						BinaryTreeNode tempNew;
//						if(temp.leftChild.leftChild!=null && temp.leftChild.rightChild!=null)
//						{
//							tempNew = temp.rightChild;
//							
//						}
						
/* =========================== Left with deletion having 2childs ================================ */
						if(temp.leftChild.leftChild!=null)
						{
							temp.leftChild = temp.leftChild.leftChild;
						}	
						if(temp.leftChild.rightChild!=null)
						{
							temp.leftChild = temp.leftChild.rightChild;
						}	
						//temp.leftChild = null;
						return;
					}
				}
				if(temp.rightChild!=null)
				{
					if(temp.rightChild.value == deleteNodeValue)
					{
						if(temp.rightChild.rightChild!=null)
						{
							temp.rightChild = temp.rightChild.rightChild;
						}
						if(temp.rightChild.leftChild!=null)
						{
							temp.rightChild = temp.rightChild.leftChild;
						}
						//temp.rightChild = null;
						return;
					}
				}
				 
				if(temp.value < deleteNodeValue)
				{
					temp = temp.rightChild;
				}
				else if(temp.value > deleteNodeValue)
				{
					temp = temp.leftChild;
				}
			}
		}
		
	}
}
