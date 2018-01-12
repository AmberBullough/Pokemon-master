package pokemon.model;

import java.util.ArrayList;

public abstract class Pokemon 
{

	
	private int healthPoints;
	private int attackPoints;
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
		
		String [] types = null;
		ArrayList<String> parentType  new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];
			
			for(int index = 0; index < types.length; index ++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + "." , "");
				if(!parentType.contains(currentInterface))
					{
					parentType.add(currentInterface);
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
	public int getHealthPoints()
	{
		return healthPoints;
	}
	public int getAttackPoints()
	{
		return attackPoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnchancementModifier()
	{
		return enchancementModifier;
	}
	public boolean canEvolve()
	{
		return canEvolve;
	}
	public String getNumber() 
	{
		// TODO Auto-generated method stub
		return getNumber();
	}
	public void setCanEvolve(boolean evolve) {
		// TODO Auto-generated method stub
		
	}
	public void getEnchancementModifier(double modify) {
		// TODO Auto-generated method stub
		
	}
	public void getHealthPoints(int health) {
		// TODO Auto-generated method stub
		
	}
	public void getAttackPoints(int attack) {
		// TODO Auto-generated method stub
		
	}
	
	}
