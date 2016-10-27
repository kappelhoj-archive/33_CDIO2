package game;

public class Board {
	private Field[] fields;
	
	/**
	 * Board constructor creates a board with 11 fields.
	 */
	public Board()
	{
		// Create array with gold values for each field.
		int[] gold = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
		
		// Create fields array with 11 elements.
		fields = new Field[11];
		
		// Go through fields array.
		for(int i = 0; i < fields.length; i++)
		{
			// Set a boolean variable with false as default value.
			boolean extraTurn = false;
			
			// For field 9 change extraTurn value to true.
			if(i == 8)
				extraTurn = true;
			
			// Add a field in every element of fields array.
			fields[i] = new Field(gold[i], extraTurn);
		}
	}
	
	/**
	 * Method getFieldGold returns the gold value of a specific field.
	 * @return Gold value of a field.
	 */
	public int getFieldGold(int fieldIndex)
	{
		return fields[fieldIndex].getGold();
	}
	
	/**
	 * Method getFieldExtraTurn returns the extraTurn value of a specific field.
	 * @return Extra turn value of a field.
	 */
	public boolean getFieldExtraTurn(int fieldIndex)
	{
		return fields[fieldIndex].getExtraTurn();
	}
}