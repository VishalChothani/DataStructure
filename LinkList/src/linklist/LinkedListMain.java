package linklist;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		LinkedListLogic list = new LinkedListLogic();
		list.createNewList(2);
		list.addInFront(4);
		list.addInEnd(3);
		list.addInBetList(2, 1);
		list.addInFront(5);
		list.display();		
		System.out.println("");
		
		list.deleteFromStart();
		list.display();
		System.out.println("");
		list.deleteFromEnd();
		list.display();
		System.out.println("");
		list.deleteFromInBet(1);
		list.display();
		System.out.println("");
		
		list.search(4);
		
		list.sort();
		list.display();
		System.out.println("");
		list.reverse();
		list.display();
		
	}

}
