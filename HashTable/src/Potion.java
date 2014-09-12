public class Potion
{
	private double Size;
	private int Type; // 0, 1, 2, 3 ... etc. A flag value.
	static int count=0;
	public Potion(double NewSize, int NewType)
	{
		Size = NewSize;
		Type = NewType;
	}
	
	/*
	 * YOUR CODE HERE
	 * Override the hashCode method.
	 */
	
	public int hashCode(){
		int result=3;
		 long c = Double.doubleToLongBits(Size);
		int c2=Type;
		result=(int) (37*result+c+c2);
		return result;
		
	}
	
	/*
	 * YOUR CODE HERE
	 * Override the equals method.
	 */
	
	public boolean equals(Object o){
		if(o instanceof Potion){
			Potion other=(Potion)o;
			return(other.Type==Type && other.Size==Size);
		}
		return false;
		
	}
	/*public static void main(String args[]){
		Potion p=new Potion(10.0,2);
		System.out.println(p.hashCode()%23);
		p=new Potion(10.0,3);
		System.out.println(p.hashCode()%23);
		p=new Potion(13.0,1);
		System.out.println(p.hashCode()%23);
		p=new Potion(15.0,1);
		System.out.println(p.hashCode()%23);
		p=new Potion(10.0,2);
		System.out.println(p.hashCode()%23);
		p=new Potion(10.0,2);
		System.out.println(p.hashCode()%23);
		p=new Potion(10.0,3);
		System.out.println(p.hashCode()%23);
		p=new Potion(23.0,4);
		System.out.println(p.hashCode()%23);
		p=new Potion(25.0,1);
		System.out.println(p.hashCode()%23);
		p=new Potion(20.0,2);
		System.out.println(p.hashCode()%23);
		System.out.println("Double long "+Double.doubleToLongBits(10.0));
	}*/
}
