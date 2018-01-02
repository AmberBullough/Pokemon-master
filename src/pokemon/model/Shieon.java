package pokemon.model;

public class Shieon extends Pokemon implements Electric, Fairy
{
	public Shieon()
	{
		super("Shieon", 915);
	}
	public Shieon (String name)
	{
		super(name, 915);
	}
	
	public Shieon (int number, String name)
	{
		super(name, number);
		setup();
	}
	
	
	public int attackMove(int level)
	{
		int babyDollEyes = -56;
		
		return babyDollEyes;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public boolean canEvolve()
	{
		return true;
	}
	
	public void electricType()
	{
		System.out.print("Shieon");
	}
	
	public void fairyType()
	{
		System.out.print("Shieon");
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(true);
		this.setEnchanceModifier(.89);
		this.setHealthPoints(123);
}
	private void setHealthPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	private void setEnchanceModifier(double d) {
		// TODO Auto-generated method stub
		
	}
	protected void setAttackPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	private void setCanEvolve(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
