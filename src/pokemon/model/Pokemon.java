package pokemon.model;

import java.util.ArrayList;

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
	
	public boolean canEvolve()
	{
		return canEvolve;
	}
	
	public String[] getPokemonTypes()
	{
		String [] types = nil;
		ArrayList<String> parentType  new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonypes = getClass().getInterfaces();
			types = new String[pokemonTypes.length];
			
			for(int index = 0; index < types.length; index ++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + "." , "");
				if(!parentType.contains(currentInterface))
					{
					parentType.add(currentInterface));
					}
			}
			
			currentClass = currentClass.getSuperclass();
			
		}
		types = new String [parentType.size()];
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		return types;
		
	}
}
