package catcontroller;

import cat.Cat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CatController
{
	private static final boolean True = false;
	private Cat myCat;
	private Cat userCat;
	private Scanner inputScanner;
	
public CatController()
{
	myCat = new Cat("Mishka, 2.0, 2, True, 2");
	userCat = new Cat();
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
	
	
