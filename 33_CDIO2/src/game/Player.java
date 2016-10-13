package game;

import game.Account;

public class Player {

	private String playerName;
	private Account account = new Account();
	
	int NewBalance;
	
	public Player(String playerName)
	{
		this.playerName = playerName;
	}
	
	public String getPlayerName(){
		return playerName;
	}

	public void setNewBalance(int Balance, int fieldValue){
		NewBalance = Balance + fieldValue;
	}
	
	public int RecieveNewBalance(){
		return NewBalance;
	}
	
	public int tellBalance(){
		return account.getBalance();
	}
	
}
