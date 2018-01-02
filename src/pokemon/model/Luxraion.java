package pokemon.model;

public class Luxraion extends Luxion implements Electric,Fairy
{
	public Luxraion()
	{
		super(917, "Luxraion");
	}
	
	public Luxraion (String name)
	{
		super(917, name);
	}
	
	public Luxraion (int number, String name)
	{
		super(number, name);
		
	}
	
	
	
	public int attackMove(int level)
	{
		int thunderFang = -240;
		
		return thunderFang;
	}
	public String sayName()
	{
		return getName();
				
	}
	
	public boolean canEvolve()
	{
		return false;
	}
	
	public void electricType()
	{
		System.out.print("Luxraion");
	}
	
	public void fairyType()
	{
		System.out.print("Luxraion");
	}
	
}
