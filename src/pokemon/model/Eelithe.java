package pokemon.model;

public class Eelithe extends Pokemon implements Normal, Fire
{
	public Eelithe (int number, String name)
	{
		super(name, number);
	}
	
	public int attackMove(int level)
	{
		int copyCat = -20;
		
		return copyCat;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public void normalType()
	{
		
	}
	
	public void fireType()
	{
		
	}
}
