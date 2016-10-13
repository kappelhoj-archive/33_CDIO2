package game;

public class DiceCup 
{	
	private Die d1;
	private Die d2;
	
	/**
	 * DiceCup constructor. The diceCup object contains two dice.
	 */
	public DiceCup()
	{
		d1 = new Die();
		d2 = new Die();
	}
	
	/**
	 * Method rollDice rolls both dice in the DiceCup object.
	 */
	public void rollDice()
	{
		d1.rollDie();
		d2.rollDie();
	}


	/**
	 * Method getDiceValue returns the value of the rolled dice as a integer array.
	 * @return int[]
	 */
	public int[] getDiceValue()
	{
		int[] array = {d1.getValue(), d2.getValue()};
		return array;
	}	
}
