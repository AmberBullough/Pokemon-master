package pokemon.model;

public interface Normal 
{
	public void normalType();
	public int attackMove(int amount);
	public String sayName();
	public boolean canEvolve();
	
	// Note: Moves are: Body slam, cut, and copycat
}
