package pokemon.model;

public abstract class Pokemon 
{

	
	private int healthPoints;
	private int attackPonts;
	private double enchancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(String name, int number)
	{
		this.setName(name);
		this.number = number;
	}
	public final String[] getPokemonTypes()
	{
		
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			pokeTypes[index] = currentInterface;
		}
		return pokeTypes;
		
		
		
	}
	public String toString()
	{
			String description = "Hi, I am a " + getName() + ", and my HP is " + healthPoints;
			return description;
	}
	public String getPokemonInformation()
	{
		String info = "This pokemon is of type: " + this.getClass().getSimpleName();
		return info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
