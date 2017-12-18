package pokemon.model;

public class Shieon extends Pokemon implements Electric, Fairy
{
	public Shieon (int number, String name)
	{
		super(name, number);
		
	}
	public int attackMove(int level)
	{
		int spark = -56;
		
		return spark;
	}
	public String sayName()
	{
		return getName();
				
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
