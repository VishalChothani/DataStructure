package sequentialSearchPackage;

public class SequentialSearchMain {

	public static void main(String[] args) {
		
		int array[] = {3,0,1,8,7,2,5,10,9,6,4};
		//SequentialSearchLogic search = new SequentialSearchLogic();
		//search.search(array, 2);
		
		double Damage=13.0;
		double AttackSpeed=2.0;
		double MissChance=6.0;
		
		int result=3;
		
		long c = Double.doubleToLongBits(Damage);
		long c1 = Double.doubleToLongBits(AttackSpeed);
		long c2 = Double.doubleToLongBits(MissChance);
		
		long result1 = Math.abs(37*result+(c+c1+c2));
		
		System.out.println("Result: "+result1);
		
		result = (int)(result1 % 23);
		System.out.println("Result: "+result);

	}

}
