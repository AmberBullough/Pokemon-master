package pokemon.model;

public class Pikadoor extends Pokemon implements Grass 
{
	public Pikadoor(int number, String name)
	{
		super(name, number);
	}
	public int attackMove(int level)
	{
		int vineWhip = -913124;
		
		return vineWhip;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public void grassType() 
	{
		
		
	}
	
}
