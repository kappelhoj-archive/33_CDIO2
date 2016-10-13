package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GUIController {
	Field[] fields = new Field[11];

	/**
	 * Initialize the board
	 * @param player1Name Player 1 name
	 * @param player2Name Player 2 name
	 */
	GUIController(String player1Name,String player2Name) {
		for (int i = 0; i < 11; i++)
			fields[i] = new Street.Builder()
			.setTitle(GameText.fieldTitles[i])
			.setSubText(GameText.fieldSubText[i])
			.setDescription(GameText.fieldDescription[i])
			.build();

		//Create the board with the 11 fields
		GUI.create(fields);
		GUI.addPlayer(player1Name,1000);
		GUI.addPlayer(player2Name,1000);
		GUI.setDice(3, 4);
	}
	 
	/**
	 * Move a player to a Field
	 * @param playerName Player name.
	 * @param position Position to move player to.
	 */
	public void movePlayer(String playerName,int position){
		GUI.removeAllCars(playerName);
		GUI.setCar(position, playerName);
	}
	
	public void changeBalanceTo(String playerName,int balance){
		GUI.setBalance(playerName, balance);
	}
	
	
	
	
}
