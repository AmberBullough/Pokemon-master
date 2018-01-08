package pokemon.controller;

 import pokemon.model.Pokemon;
 import java.util.List;
 import java.util.ArrayList;
 import pokemon.model.*;
 
public class PokemonController 
{

	private List<Pokemon> pokedex;
	
	public void start()
	{
		Eelithe myEelithe = new Eelithe();
		Pokemon temp = new Eelithe();
		pokedex.add(new Eelithe());
		
		
		Luxion myLuxion = new Luxion();
		Pokemon temp = new Luxion();
		pokedex.add(new Luxion());
		
		Luxraion myLuxraion = new Luxraion();
		Pokemon temp = new Luxraion();
		pokedex.add(new Luxraion());
		
		Pikadoor myPikadoor = new Pikadoor();
		Pokemon temp = new PikaDoor();
		pokedex.add(new Pikadoor());
		
		Shieon myShieon = new Shieon();
		Pokemon temp = new Shieon();
		pokedex.add(new Shieon());
		
		Raivee myRaivee = new Raivee();
		Pokemon temp = new Raivee();
		pokedex.add(new Raivee());
		
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
}
