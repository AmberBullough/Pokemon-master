package pokemon.model;

public class Shieon extends Pokemon implements Electric, Fairy
{
	public Shieon()
	{
		super("Shieon", 915);
	}
	
	public Shieon (int number, String name)
	{
		super(name, number);
		
	}
	
	public Shieon (String name)
	{
		super(name, 915);
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
	
}
