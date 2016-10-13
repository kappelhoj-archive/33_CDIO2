package game;
import game.Die;
public class DiceCup {

	private Die d1;
	private Die d2;
	
	public DiceCup()
	{
		d1 = new Die();
		d2 = new Die();
	}
	
	public void rollDice()
	{
		d1.rollDie();
		d2.rollDie();
	}


	public int[] getDiceValue(){
		int[] array = {d1.getValue(), d2.getValue()};
		return array;
	}	
}
