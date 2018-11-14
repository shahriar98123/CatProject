package choice.controller;

import java.util.Scanner;
import javax.swing.JOptionPane;

import choice.model.YourThing;

public class ChoiceController
{
	private static final boolean True = false;
	private YourThing myCat;
	private YourThing userCat;
	private Scanner inputScanner;
	
public ChoiceController()
{
	myCat = new YourThing("Mishka, 2.0, 2, True, 2");
	userCat = new YourThing();
	inputScanner = new Scanner(System.in);

}

	public void start()
	{
		JOptionPane.showMessageDialog(null,  myCat);
		System.out.println(myCat);
		
		String userInput = JOptionPane.showInputDialog(null, "Name of Cat?");
		String name = userInput;
		userCat.setName(name);
	}
	String userInput = JOptionPane.showInputDialog(null, "How Many Legs Does Your Cat Have");
	int legCount = (int) 2.0;
	{
	if (validInt(userInput))
	{
		
		userCat.setLegCount(legCount);
		System.out.println("Your Cat Has " + userCat.getLegCount() + "legs!");
		
	}
	userCat.setLegCount(legCount);
	userInput = JOptionPane.showInputDialog(null, "How Many Eyes Does Your Cat Have?");
	int eyes = 2;
	if (validInt(userInput))
	{
		
		eyes = Integer.parseInt(userInput);
		userCat.setEyeCount(eyes);
		System.out.println("Your Cat has " + userCat.getEyeCount() + "Eyes");
	}
	{
		userInput = JOptionPane.showInputDialog(null, "Does Your Cat have a nose?");
		boolean hasNose = True;
		hasNose = Boolean.parseBoolean(userInput);
		
		userCat.setHasNose(hasNose);
	}

	
	}
	private boolean validInt(String userInput2)
	{
		// TODO Auto-generated method stub
		return false;
	}
}
	
	
