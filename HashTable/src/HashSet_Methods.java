//FORBIDDEN java.util.Hash

/**
 * This class contains the methods for the 
 * HashSet class. The HashSet class should
 * be implemented as an hash table with a linked
 * list at each slot in the array.
 * 
 * This file is simply a container
 * for some static methods. You can write 
 * these as the same as if they were in the
 * class itself (using the given definitions).
 * They were only separated out to prevent
 * people from using JCF methods to implement
 * them.
 */
public class HashSet_Methods
{
	/**
	 * Add an item to the hash table. Data is the 
	 * hash table. NewData is the Object to add to 
	 * the table.
	 * @param NewData the object to add to the table
	 * @param Data the hash table
	 */
	static int count=0;
	public static void add(Object NewData, Node[] Data)
	{
		
		   int h = NewData.hashCode();
		   
           if (h < 0) { h = -h; }
           h = h % Data.length;

           Node current = Data[h];
           while (current != null)
           {
//               if (current.Data.equals(NewData))
//               {
//            	   return;
//               }
               
           current = current.Next;

           }

           Node newNode = new Node(NewData, Data[h]);
           Data[h] = newNode;
           count++;
           
	}
	
	/**
	 * Determine if the hash table in Data
	 * contains the Object SearchData.
	 * @param SearchData the item to be found
	 * @param Data the haystack to search
	 * @return int index where the item is found or -1 otherwise
	 */
	public static int contains(Object SearchData, Node[] Data)
	{
		// YOUR CODE HERE!
		
		boolean a = false;
	    int h = SearchData.hashCode(); 
            if ( h < 0) { h = -h; }
            h = h % Data.length;
            Node current = Data[h]; 
            while ( current != null)
            {
                if(current.Data.equals(SearchData)) 
                {
                     a = true; 
                     break;
                    
                    }
                current = current.Next;
                
                    
            }
            if (a == true)
                    {
                        return h; 
                    }
                  else 
                    {
                    return -1;
                    }
                
       
		
	}
	
	/**
	 * If the given item is in the hash table, then
	 * remove it.
	 * 
	 * @param RemoveData
	 * @param Data
	 */
	public static void remove(Object RemoveData, Node[] Data)
	{
		// YOUR CODE HERE!
		
		int h = RemoveData.hashCode(); 
        if ( h < 0) { h = -h; }
        h = h % Data.length; 
        
        Node current = Data[h]; 
        Node previous = null; 
        while (current != null)
        {
            if (current.Data.equals(RemoveData))
            {
               if (previous == null)
               {
                   Data[h] = current.Next;
                   
               }
             else
               {
                   previous.Next = current.Next;
               }
               
            }
            
            previous = current; 
            current = current.Next;
        }
        count--;
	}
	
	/**
	 * Calculate the load on the hash table. In this case, the load
	 * is the number of items in the hash table divided by the number
	 * of slots in the array. This count includes items in linked lists.
	 * 
	 * @param Data the array to search
	 * @return the calculated load
	 */
	public static double calculateLoad(Node[] Data)
	{
		// YOUR CODE HERE!		
		return (double)count/(double)Data.length;
	}
	
	/**
	 * Create a new hash table that is twice the
	 * size of the old one. Reallocate all elements 
	 * TO NEW POSITIONS in the new hash table.
	 * @param Data the hash table to reallocate
	 */
	public static Node[] resize(Node[] Data)
	{
		// YOUR CODE HERE!
		Node[] temp=new Node[Data.length*2];
		for(int i=0;i<Data.length;i++){
			//temp[i]=Data[i];
		}		
		return temp;
	}
}
