package pokemon.model;

public class Eelithe extends Pokemon implements Normal, Fire
{
	public Eelithe()
	{
		super("Eelithe", 918);
	}
	public Eelithe(String name)
	{
		super(name, 918);
	}
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
		System.out.println("Eelithe");
	}
	
	public void fireType()
	{
		System.out.print("Eelithe");
	}

	@Override
	public boolean canEvolve() {
		// TODO Auto-generated method stub
		return false;
	}
}
