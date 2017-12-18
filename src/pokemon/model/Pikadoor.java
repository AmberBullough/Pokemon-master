package pokemon.model;

public class Pikadoor extends Pokemon implements Grass, Electric 
{
	public Pikadoor(int number, String name)
	{
		super(name, number);
	}
	public int attackMove(int level)
	{
		int vineWhip = -45;
		
		return vineWhip;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public void grassType() 
	{
		
		System.out.print("Pikadoor");
	}
	
	public void electricType()
	{
		System.out.print("Pikadoor");
	}
	
}
