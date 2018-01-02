package pokemon.model;

public class Pikadoor extends Pokemon implements Grass, Electric 
{
	public Pikadoor()
	{
		super("Pikadoor", 914);
	}
	
	public Pikadoor(String name)
	{
		super(name, 914);
	}
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

	@Override
	public boolean canEvolve() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
