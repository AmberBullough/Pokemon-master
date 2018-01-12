package pokemon.controller;

 import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

import java.util.List;
 import java.util.ArrayList;
 import pokemon.model.*;
 
public class PokemonController 
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Eelithe("Eelithe"));
		pokedex.add(new Luxion("Luxion"));
		pokedex.add(new Luxraion("Luxraion"));
		pokedex.add(new Pikadoor("Pikadoor"));
		pokedex.add(new Raivee("Raivee"));
		pokedex.add(new Shieon("Shieon"));
	}
	
	public void start()
	{
		//Eelithe myEelithe = new Eelithe();
		//Pokemon temp = new Eelithe();
		//pokedex.add(new Eelithe());
		
		
		//Luxion myLuxion = new Luxion();
		//Pokemon temp = new Luxion();
		//pokedex.add(new Luxion());
		
		//Luxraion myLuxraion = new Luxraion();
		//Pokemon temp = new Luxraion();
		//pokedex.add(new Luxraion());
		
		//Pikadoor myPikadoor = new Pikadoor();
		//Pokemon temp = new PikaDoor();
		//pokedex.add(new Pikadoor());
		
		//Shieon myShieon = new Shieon();
		//Pokemon temp = new Shieon();
		//pokedex.add(new Shieon());
		
		//Raivee myRaivee = new Raivee();
		//Pokemon temp = new Raivee();
		//pokedex.add(new Raivee());
		
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteget(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index ++)
		{
			names[index] = pokedex.get(index).getName();
		}
	 return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.getAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.getEnchancementModifier(modify);
		selected.setName(name);
		selected.getHealthPoints(health);
	}
}
