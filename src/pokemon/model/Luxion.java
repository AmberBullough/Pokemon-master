package pokemon.model;

public class Luxion extends Shieon implements Electric, Fairy
{
	public Luxion()
	{
		super(916, "Luxion");
	}
	public Luxion(String name)
	{
		super(916, name);
	}
	public Luxion (int number, String name)
	{
		super(number, name);
		setup();
		
	}
	
	
	
	
	public int attackMove(int level)
	{
		int flowerShield = -120;
		
		return flowerShield;
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
		System.out.print("Luxion");
	}
	
	public void fairyType()
	{
		System.out.print("Luxion");
	}
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(359);
	}
}
