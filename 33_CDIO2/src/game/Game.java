package game;

public class Game 
{
	// turn = 0 for spiller 1 og turn = 1 for spiller 2.
	public static int turn = 0;
	//Er der nogen der har vundet?
	public static boolean gameWon = false;

	public static void startGame()
	{
		Player[] players = new Player[2];
		Guicon controller = new Guicon();
		Board board = new Board();
		DiceCup diceCup = new DiceCup();


		turn = (int) Math.round(Math.random());	

	}
	
	public static extraTurn()
	{
		
		
		
		
	}
	
	public static void turn(boolean extraTurn)
	{
		
		if(extraTurn)
			return;
		else {
			turn = (turn + 1) % 2;
			return;
		}
			
		
		
		turn(extraTurn())
		
	}
	
	
	
	public static playTurn(Player[] players)
	{
		
		
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		while(!gameWon)
		{
			
			
			
			
			
		}




	}

}