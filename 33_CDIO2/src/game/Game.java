package game;

public class Game {
	// turn = 0 for player 1 og turn = 1 for player 2. Choose random player to start.
	public static int turn = (int) Math.round(Math.random());
	// Boolean that tells if someone won the game.
	public static boolean gameWon = false;
	//An array of players
	public static Player[] players;
	//The console controller.
	public static TUI tui;
	//GUI controller
	public static GUIController controller;
	//Board class
	public static Board board;
	//Diecup class
	public static DiceCup diceCup;

	/**
	 *Method that starts the create and initialise all the vaiables.
	 */
	public static void startGame() {
		//Create 2 players
		players = new Player[2];
		tui = new TUI();
		//Ask for the names of the players
		String[] playerNames = tui.intro();

		//Creates various objects.
		controller = new GUIController(playerNames);
		board = new Board();
		diceCup = new DiceCup();

		//Assign the players their names.
		setPlayerNames(players, playerNames);

	}
	/**
	 * set the players names.
	 * @param players
	 * @param names
	 */
	public static void setPlayerNames(Player[] players, String[] names) {
		for (int i = 0; i < names.length; i++)
			players[i] = new Player(names[i]);
	}

	/**
	 * Rolls the dice
	 * @return
	 */
	public static int[] playDice() {
		diceCup.shakeCup();
		return diceCup.getDiceValue();
	}

	/**
	 * Changes the turn of the players
	 * @param extraTurn
	 */
	public static void turn(boolean extraTurn) {
		if (extraTurn) {
			controller.startTurn(players[turn].getPlayerName(), extraTurn);
			return;
		} else {
			turn = (turn + 1) % 2;
			controller.startTurn(players[turn].getPlayerName(), extraTurn);
			return;
		}
	}
	/**
	 * Play the turn of a player.
	 */
	public static void playTurn() {
		int[] currentDice = playDice();
		int sum = currentDice[0] + currentDice[1];

		players[turn].changeAccountBalance(board.getFieldGold(sum - 2));
		controller.getTurn(players[turn].getPlayerName(), players[turn].getAccountBalance(), sum - 2, currentDice);
		if (players[turn].getAccountBalance() == 3000) {
			gameWon = true;
			return;
		}
		turn(board.getFieldExtraTurn(sum - 2));
	}
	/**
	 * Controls the game.
	 */
	public static void main(String[] args) {
		//Initialize the game
		startGame();
		//Makes sure someone gets information to start.
		turn(false);
		//Game loop
		while (!gameWon) {
			playTurn();
		}
		controller.endGame(players[turn].getPlayerName());
	}

}