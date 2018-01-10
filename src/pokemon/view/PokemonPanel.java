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
	private JTextField txtDescription;
	private JTextField txtHealth;
	private JTextField txtAttack;
	
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
	
	private void setupTypePanels()
	{
		
	}
	
	
	
	private void updateImage()
	{
		
	}
	
	private void updateTypePanels()
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
		
		if (types.length > 1)
		{
			
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
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
	
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnSave = new JButton("Save");
		add(btnSave);
		
		JButton btnClear = new JButton("Clear");
		springLayout.putConstraint(SpringLayout.NORTH, btnSave, 0, SpringLayout.NORTH, btnClear);
		springLayout.putConstraint(SpringLayout.WEST, btnSave, 6, SpringLayout.EAST, btnClear);
		springLayout.putConstraint(SpringLayout.SOUTH, btnClear, -132, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnClear, -196, SpringLayout.EAST, this);
		add(btnClear);
		
		JCheckBox chckbxEvolvable = new JCheckBox("Evolvable");
		springLayout.putConstraint(SpringLayout.NORTH, chckbxEvolvable, 6, SpringLayout.SOUTH, btnSave);
		springLayout.putConstraint(SpringLayout.WEST, chckbxEvolvable, 10, SpringLayout.WEST, btnClear);
		add(chckbxEvolvable);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 188, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, -33, SpringLayout.SOUTH, this);
		add(comboBox);
		springLayout.putConstraint(SpringLayout.NORTH, txtDescription, 100, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtDescription, -287, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtDescription, -130, SpringLayout.NORTH, btnSave);
		springLayout.putConstraint(SpringLayout.EAST, txtDescription, -103, SpringLayout.EAST, this);
		
		JTextArea txtrDescription = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, txtrDescription, 47, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtrDescription, -9, SpringLayout.WEST, btnClear);
		springLayout.putConstraint(SpringLayout.SOUTH, txtrDescription, 236, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtrDescription, -10, SpringLayout.EAST, this);
		txtrDescription.setText("Description");
		add(txtrDescription);
		
		JLabel lblIcon = new JLabel("Icon");
		springLayout.putConstraint(SpringLayout.WEST, lblIcon, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblIcon, -130, SpringLayout.WEST, txtrDescription);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, lblIcon);
		springLayout.putConstraint(SpringLayout.NORTH, lblIcon, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIcon, 316, SpringLayout.NORTH, this);
		add(lblIcon);
		
		txtHealth = new JTextField();
		txtHealth.setText("Health");
		springLayout.putConstraint(SpringLayout.NORTH, txtHealth, 0, SpringLayout.NORTH, chckbxEvolvable);
		springLayout.putConstraint(SpringLayout.WEST, txtHealth, 0, SpringLayout.WEST, lblIcon);
		add(txtHealth);
		txtHealth.setColumns(10);
		
		txtAttack = new JTextField();
		txtAttack.setText("Attack");
		springLayout.putConstraint(SpringLayout.SOUTH, txtAttack, 0, SpringLayout.SOUTH, chckbxEvolvable);
		springLayout.putConstraint(SpringLayout.EAST, txtAttack, 0, SpringLayout.EAST, comboBox);
		add(txtAttack);
		txtAttack.setColumns(10);
		
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
}
