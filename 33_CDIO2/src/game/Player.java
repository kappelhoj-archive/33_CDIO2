package game;

import game.Account;

public class Player {

	private String playerName;
	private Account account = new Account();

	/** 
	 * Method to set the players name to the input playername.
	 */
	public Player(String playerName)
	{
		this.playerName = playerName;
	}
	
	/** 
	 * Method to return the individual players name. 
	 */
	public String getPlayerName(){
		return playerName;
	}
	
	/** 
	 * Method to calcute the new balance for the active player.
	 */
	public void changeBalance(int fieldValue){
		account.changeBalance(fieldValue);
	}
	
	/** 
	 * Method to return the calculated balance.
	 */
	public int getBalance(){
		return account.getBalance();
	}
}