package game;

public class Board {
	private Field[] fields;
	
	public Board(Field[] fields)
	{
		this.fields = fields;
	}
	

	public Field[] getFields()
	{
		return fields;
	}
}