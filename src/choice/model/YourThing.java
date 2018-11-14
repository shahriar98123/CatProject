package choice.model;

public class YourThing
{


	private  String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public YourThing()
	{
	//Declaration section
	//Data member section
	//Also called instance variables
	//These are special - they get a default value
//	All numbers => 0
	//boolean => false
	//Objects => null!!!
		/**
		 * Default constructor for a Run.
		 * Initializes all variables to valid but "bad" values
		 * used for later customization.
		 */
		/**
		 * initializes a Run instance with a value for the distance.
		 * @param distance The distance of the run.
		 */
		 
		 
	}
	
	public YourThing(String name)
	
	{
		this.name = name;
	}
	
	public YourThing(String name, double legCount, int eyeCount, boolean hasNose, int armCount)
	{
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = armCount;
		this.name = name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	public double getEyeCount()
	{
		return eyeCount;
	}
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	public double getArms()
	{
		return armCount;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setHasNose(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	
	public String toString()
	{
		String description = "This cat is named " + name
								+ " and it has " + legCount + "legs" + eyeCount + "eyes..."
								+ " her favorite thing to do is:"
								+ "Sleeeeep" ;
		return description;
	}

}
