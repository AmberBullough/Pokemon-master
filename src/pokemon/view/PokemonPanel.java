package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.*;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	private SpringLayout baseLayout;
	
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
	
	setupComboBox();
	setupTypePanels();
	setupPanel();
	setupLayout();
	setupListeners();
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber()+ "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() +"");
		modifierField.setText(appController.getPokedex().get(index).getEnchancementModifier() + "");
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefautComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void updateImage()
	{
		
	}
	
	private Void updateTypePanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		//Change this to match your three minimum ts in pokedex
		if(types[0].equals("Electric"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else if(types[0].equals("Fairy"))
		{
			firstType.setBackground(Color.PINK);
		}
		else if(types[0].equals("Fire"))
		{
			firstType.setBackground(Color.ORANGE);
		}
		else if (types[0].equals("Grass"))
		{
			firstType.setBackground(Color.GREEN);
		}
		else if(types[0].equals("Normal"))
		{
			firstType.setBackground(Color.DARK_GRAY);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		
		if (types[1].equals("Electric"))
		{
			secondType.setBackground(Color.YELLOW);
		}
		else if(types[1].equals("Fairy"))
		{
			secondType.setBackground(Color.PINK);
		}
		else if(types[1].equals("Fire"))
		{
			secondType.setBackground(Color.ORANGE);
		}
		else if (types[1].equals("Grass"))
		{
			secondType.setBackground(Color.GREEN);
		}
		else if(types[1].equals("Normal"))
		{
			secondType.setBackground(Color.DARK_GRAY);
		}
		else
		{
			secondType.setBackground(Color.WHITE);
		}
		
		
		if (types[2].equals("Electric"))
		{
			thirdType.setBackground(Color.YELLOW);
		}
		else if(types[2].equals("Fairy"))
		{
			thirdType.setBackground(Color.PINK);
		}
		else if(types[2].equals("Fire"))
		{
			thirdType.setBackground(Color.ORANGE);
		}
		else if (types[2].equals("Grass"))
		{
			thirdType.setBackground(Color.GREEN);
		}
		else if(types[2].equals("Normal"))
		{
			thirdType.setBackground(Color.DARK_GRAY);
		}
		else
		{
			thirdType.setBackground(Color.WHITE);
		}
		
		
		if (types[3].equals("Electric"))
		{
			fourthType.setBackground(Color.YELLOW);
		}
		else if(types[3].equals("Fairy"))
		{
			fourthType.setBackground(Color.PINK);
		}
		else if(types[3].equals("Fire"))
		{
			fourthType.setBackground(Color.ORANGE);
		}
		else if (types[3].equals("Grass"))
		{
			fourthType.setBackground(Color.GREEN);
		}
		else if(types[3].equals("Normal"))
		{
			fourthType.setBackground(Color.DARK_GRAY);
		}
		else
		{
			fourthType.setBackground(Color.WHITE);
		}
	}
	
	
	
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		baseLayout = new SpringLayout();
		
		saveButton = new JButton ("Save");
		clearButton = new JButton ("Clear");
		pokedexDropdown = new JComboBox();
		
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		nameLabel = new JLabel("Name");
		evolvableLabel = new JLabel("Evolvable");
		modifierLabel = new JLabel("Modifier");
		
		iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("Name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		descriptionArea = new JTextArea(5, 10);
		typeArea = new JTextArea(4, 15);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
	
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
		this.setBackground(Color.RED);
		this.add(iconLabel);
		this.add(attackLabel);
		this.add(attackField);
		this.add(healthLabel);
		this.add(healthField);
		this.add(modifierLabel);
		this.add(modifierField);
		this.add(nameLabel);
		this.add(nameField);
		this.add(numberLabel);
		this.add(numberField);
		this.add(evolvableLabel);
		this.add(evolvableBox);
		this.add(pokedexDropdown);
		this.add(clearButton);
		this.add(saveButton);
		this.add(descriptionArea);
		this.add(typeArea);
		
		
	}
}
