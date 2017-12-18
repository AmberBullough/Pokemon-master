package pokemon.model;

public class Shieon extends Pokemon implements Electric
{
	public Shieon (int number, String name)
	{
		super(name, number);
		
	}
	public int attackMove(int level)
	{
		int spark = -913124;
		
		return spark;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public void electricType()
	{
		
	}
	
}
