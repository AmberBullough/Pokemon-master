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
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber()+ "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() +"");
		modifierField.setText(appController.getPokedex().get(index).getEnchancementModifier() + "");
	}
	
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		
		saveButton = new JButton ("Save");
		clearButton = new JButton ("Clear");
		pokedexDropdown = new JComboBox();
		
		healthLabel = new JLabel();
		attackLabel = new JLabel();
		nameLabel = new JLabel();
		evolvableLabel = new JLabel();
		modifierLabel = new JLabel();
		iconLabel = new JLabel();
		
		baseLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		//JButton btnReset = new JButton("Reset");
		//add(btnReset);
		//JSpinner spinner = new JSpinner();
		//add(spinner);
		//JButton btnNewButton = new JButton("New button");
		//add(btnNewButton);
		
	}
}
