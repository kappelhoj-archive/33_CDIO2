package game;

import game.Account;

public class Player {

	private String playerName;
	private Account account = new Account();
	
	int newbalance;
	
	public Player(String playerName)
	{
		this.playerName = playerName;
	}
	
	public String getPlayerName(){
		return playerName;
	}

	public void setnewbalance(int balance, int fieldValue){
		newbalance = balance + fieldValue;
	}
	
	public int Recievenewbalance(){
		return newbalance;
	}
	
	public int tellBalance(){
		return account.getbalance();
	}
	
}
