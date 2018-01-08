package pokemon.model;

public class Raivee implements Electric, Normal
{
	public Raivee()
	{
		super("Raivee", 919);
	}
	public Raivee (String name)
	{
		super(name, 915);
	}
	
	public Raviee (int number, String name)
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
	
	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean canEvolve()
	{
		return true;
	}
	
	public void electricType()
	{
		System.out.print("Raivee");
	}
	
	public void fairyType()
	{
		System.out.print("Raivee");
	}
	
	protected void setup()
	{
		this.setAttackPoints(421);
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
