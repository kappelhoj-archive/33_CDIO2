package game;

public class Field {
	private int gold;
	private boolean extraTurn;
	
	public Field(int gold, boolean extraTurn) 
	{
		this.gold = gold;
		this.extraTurn = extraTurn;
	}
	
	public int getGold()
	{
		return gold;
	}
	
	public boolean getExtraTurn()
	{
		return extraTurn;
	}
}