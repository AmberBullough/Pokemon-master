package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.*;
import javax.swing.SpringLayout;

public class PokemonPanel extends JPanel
{
	public PokemonPanel()
	{
		
		JButton btnReset = new JButton("Reset");
		add(btnReset);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
	}
}
