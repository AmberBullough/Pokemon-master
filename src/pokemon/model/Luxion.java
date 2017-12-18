package pokemon.model;

public class Luxion extends Shieon implements Electric, Fairy
{
	public Luxion (int number, String name)
	{
		super(number, name);
		
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
	
}
