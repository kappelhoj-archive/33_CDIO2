package game;

import java.util.Scanner;

public class TUI 
{

	/**
	 * Method intro prints the game intro to the console. This intro includes asking the players 
	 * for their names.
	 * @return return the name of the players as a string array
	 */
	public String[] intro()
	{	
		System.out.println(GameText.welcomeText());
		String[] playerNames = getPlayerNames();
		System.out.println(GameText.gameRulesText());
		System.out.println(GameText.firstTurnText());
	
		return playerNames;
	}
	
	/**
	 * Method getPlayerNames asks the player for their names.
	 * @return the name of the players as a string array.
	 */
	
	public String[] getPlayerNames()
	{
		Scanner keyb = new Scanner(System.in);
		
		System.out.println(GameText.enterPlayerNameText(1));
		String playerOne = keyb.nextLine();
		
		System.out.println(GameText.enterPlayerNameText(2));
		String playerTwo = keyb.nextLine();
		
		String[] playerNames = {playerOne, playerTwo}; 
		
		keyb.close();
		return playerNames;
	}
}
