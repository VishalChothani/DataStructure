public class Weapon
{
	private double Damage;
	private double AttackSpeed;
	private double MissChance;
	static int count=0;
	public Weapon(double NewDamage, double NewAttackSpeed, double NewMissChance)
	{
		Damage = NewDamage;
		AttackSpeed = NewAttackSpeed;
		MissChance = NewMissChance;
	}
	
	
	/*
	 * YOUR CODE HERE
	 * Override the hashCode method. 
	 */
	
	public int hashCode(){
	double Damage=13.0;
	double AttackSpeed=2.0;
	double MissChance=6.0;
	
	int result=3;
	
	long c = Double.doubleToLongBits(Damage);
	long c1 = Double.doubleToLongBits(AttackSpeed);
	long c2 = Double.doubleToLongBits(MissChance);
	
	 result = (int) Math.abs(37*result+(c+c1+c2));
	
	return result;
	}
	/*
	 * YOUR CODE HERE
	 * Override the equals method.
	 */
	
	public boolean equals(Object o){
		if(o instanceof Weapon){
			Weapon other=(Weapon)o;
			return(other.Damage==Damage && other.AttackSpeed==AttackSpeed && other.MissChance==MissChance);
		}
		return false;
		
	}
}
