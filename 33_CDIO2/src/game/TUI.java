package game;

import java.util.Scanner;

public class TUI 
{

	/**
	 * Method getPlayerNames Ask the players of their names.
	 * @return return the name of the players as a string array
	 */
	public String[] intro()
	{
		
		
		String[] playerNames = getPlayerNames();
		
		
		
		return playerNames;
	}
	
	public String[] getPlayerNames()
	{
		Scanner keyb = new Scanner(System.in);
		
		System.out.println(GameText.enterPlayerName(1));
		String playerOne = keyb.nextLine();
		
		System.out.println(GameText.enterPlayerName(2));
		String playerTwo = keyb.nextLine();
		
		String[] playerNames = {playerOne, playerTwo}; 
		
		keyb.close();
		return playerNames;
	}
}
