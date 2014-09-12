package hashingPackage;

import java.util.Arrays;

public class Hashing {
		
	int size = 10;
	
	int array[] = new int[size];
	
	Hashing()
	{
		Arrays.fill(array, -1);
	}

	public int hashFunction(int key)
	{
		int hashValue = Integer.parseInt(Integer.toString(key).substring(0, 1));		
		if(array[hashValue]==-1)
		{
			array[hashValue] = key;			
		}
		else
		{
			while(array[hashValue] != -1)
			{
				if(hashValue < size-1)
				{
					hashValue++;
				}
				else
				{
					return -1;
				}
			}
			if(hashValue <= size - 1)
			{
				array[hashValue] = key;
			}
			else
			{
				return -1;
			}
			
		}
		return hashValue;
		
	}
	
	public void search(int key)
	{
		int hashValue = Integer.parseInt(Integer.toString(key).substring(0, 1));
		boolean flag = false;
		if(array[hashValue] == key)
		{
			System.out.println("\nThe "+key+" is found in position "+hashValue);
		}
		else
		{
			while(hashValue < size-1)
			{
				hashValue++;
				if(array[hashValue] == key)
				{
					System.out.println("\nThe "+key+" is found in position "+hashValue);
					flag = true;
					break;
				}				
			}
		}
		if(flag==false)
		{
			System.out.println("\n"+key+" is not present");
		}
	}
	
	public void display()
	{
		System.out.println("\n----------------------------- Array is -----------------------------");
		for(int i=0; i < array.length; i++)
		{
			System.out.print("| "+array[i]);
		}
	}
	
	public void insertResult(int position)
	{
		if(position == -1)
		{
			System.out.println("\nNo space to insert element");
		}
		else
		{
			System.out.println("\nThe number is inserted on pos: "+position);
		}
	}
	public static void main(String[] args) {
		
		Hashing h = new Hashing();
		int pos = h.hashFunction(232);
		h.insertResult(pos);
		h.display();
		
		pos = h.hashFunction(32);
		h.insertResult(pos);
		h.display();
		
		pos = h.hashFunction(76);
		h.insertResult(pos);
		h.display();
		//h.search(312);
		
		pos = h.hashFunction(76);
		h.insertResult(pos);
		
		pos = h.hashFunction(76);
		h.insertResult(pos);
		h.display();
		
		pos = h.hashFunction(73);
		h.insertResult(pos);
		h.display();
	}

}
