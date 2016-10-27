package game;

public class Die 
{
	private static int index=0;
	private static int[] diceValues={1,1,2,1,3,1,4,1,5,1,6,1,6,2,6,3,6,4,6,5,6,6};
	public final int MAX_VALUE;
	private int value;

	/**
	 * Constructor Die creates a 6 sided die, with a random face value between 1-6.
	 */
	public Die() 
	{
		MAX_VALUE = 6;
		//value = rollDie();
	}
	/**
	 * Constructor Die creates a n-sided die, with a random face value between 1-n.
	 * If the parameter gives is less than 1, the constructor constructs a 6-sided die.
	 * If the parameter overflows, the constructor constructs a 6-sided die.
	 * @param The amount of sides you want the die to have.
	 */
	public Die(int n) {
		if ( n < 1)
		{
			MAX_VALUE = 6;
			//value = rollDie();
		}
		else
		{
			MAX_VALUE = n;
			//value = rollDie();
		}
	}

	/**
	 * Method rollDie sets the face value of the die to a random integer between 1-MAX_VALUE.
	 * @return Retunerer terningens værdi (int).
	 */
	public int rollDie() 
	{
		// generates a random value between 1-MAX_VALUE.
		value = diceValues[index];
		index++;
		index=index%diceValues.length;
		return value;
	}

	/**
	 * Method getValue returns the face value of the die.
	 * @return The current face value of the die.
	 */
	public int getValue() 
	{
		return value;
	}

	/**
	 * Method toString returns a string representation of the die.
	 */
	public String toString() 
	{
		return "The value of the die is: " + value;
	}
	
	/**
	 * Method setValue sets the face value of the die.
	 * NB: This method is only used when testing the Die class and is therefore not seen in the diagrams.
	 */
	public void setValue(int value)
	{
		this.value = value;
	}
}
