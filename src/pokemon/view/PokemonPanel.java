package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.*;
import javax.swing.SpringLayout;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber()+ "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() +"");
		modifierField.setText(appController.getPokedex().get(index).getEnchancementModifier() + "");
	}
	
	
	public PokemonPanel()
	{
		
		JButton btnReset = new JButton("Reset");
		add(btnReset);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		add(spinner);
		
	}
}
