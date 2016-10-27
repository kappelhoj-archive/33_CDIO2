package game;

public class Field {
	private int gold;
	private boolean extraTurn;
	
	/**
	 * Field constructor creates a field object with a gold value and extraTurn value.
	 * @param Gold value and extraTurn value.
	 */
	public Field(int gold, boolean extraTurn) 
	{
		this.gold = gold;
		this.extraTurn = extraTurn;
	}
	
	/**
	 * Method getGold returns the gold value of the field.
	 * @return Gold value of the field.
	 */
	public int getGold()
	{
		return gold;
	}
	
	/**
	 * Method getExtraTurn returns the extraTurn value of the field.
	 * @return Extraturn value of the field.
	 */
	public boolean getExtraTurn()
	{
		return extraTurn;
	}
}