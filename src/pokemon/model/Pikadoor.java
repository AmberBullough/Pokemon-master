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
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(false);
		this.setEnchanceModifier(.89);
		this.setHealthPoints(123);
}
	private void setHealthPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	private void setEnchanceModifier(double d) {
		// TODO Auto-generated method stub
		
	}
	private void setAttackPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	private void setCanEvolve(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canEvolve() {
		// TODO Auto-generated method stub
		return false;
	}
}

	

