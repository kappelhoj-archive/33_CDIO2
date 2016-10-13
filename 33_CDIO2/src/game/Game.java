package game;

public class Game 
{
	// turn = 0 for spiller 1 og turn = 1 for spiller 2.
	public static int turn = (int) Math.round(Math.random());
	//Er der nogen der har vundet?
	public static boolean gameWon = false;
	public static Player[] players;
	public static TUI tui;
	public static GUIController controller;
	public static Board board;
	public static DiceCup diceCup;

	public static void startGame()
	{
		players = new Player[2];
		tui = new TUI();
		String[] playerNames=tui.intro();

		controller = new GUIController(playerNames);
		board = new Board();
		diceCup = new DiceCup();

		createPlayers(players, playerNames);	

	}

	public static void createPlayers(Player[] players, String[] names)
	{
		for(int i =0;i<names.length;i++)
			players[i]=new Player(names[i]);
	}

	public static extraTurn()
	{




	}

	public static int[] playDice()
	{
		diceCup.shakeCup();
		return diceCup.getDiceValue();
	}
	
	public static void turn(boolean extraTurn)
	{		
		if(extraTurn)
			return;
		else {
			turn = (turn + 1) % 2;
			return;
		}				
	}	

	public static void playTurn(Player[] players)
	{
		int[] currentDice = playDice();
		int sum = currentDice[0] + currentDice[1];

		players[turn].changeBalance(board.getFieldGold(sum - 2));
		if(players[turn].getBalance() == 3000)
			gameWon = true;
		controller.getTurn(players[turn].getPlayerName(), players[turn].getBalance(), sum-2, currentDice);
	}

	public static void main(String[] args)
	{
		startGame();
		while(!gameWon)
		{
			turn(false);
			



		}
	}

}