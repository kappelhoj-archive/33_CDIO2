package game;

import java.awt.Color;

import desktop_codebehind.Car;
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
	GUIController(String[] players) {
		for (int i = 0; i < 11; i++)
			fields[i] = new Street.Builder()
			.setTitle(GameText.fieldTitles[i])
			.setSubText(GameText.fieldSubText[i])
			.setDescription(GameText.fieldShortDescription[i])
			.build();

		//Create the board with the 11 fields
		GUI.create(fields);	
		Car[] cars=createCars();
		GUI.addPlayer(players[0],1000,cars[0]);
		GUI.addPlayer(players[1],1000,cars[1]);
		GUI.setDice(3, 4);
	}
	
	 private Car[] createCars(){
		 Car[] carArray =new Car[2];
			carArray[0]=new Car.Builder()
					.primaryColor(Color.BLUE)
					.secondaryColor(Color.WHITE)
					.typeUfo()
					.patternFill()
					.build();
			carArray[1]=new Car.Builder()
					.primaryColor(Color.RED)
					.secondaryColor(Color.WHITE)
					.typeUfo()
					.patternFill()
					.build();
			return carArray;
	 }
	/**
	 * Move a player to a Field
	 * @param playerName Player name.
	 * @param position Position to move player to.
	 */
	private void movePlayer(String playerName,int position){
		GUI.removeAllCars(playerName);
		GUI.setCar(position, playerName);
	}
	
	public void getTurn(String playerName,int playerBalance,int playerPosition,int[] currentDice){	

		GUI.setDice(currentDice[0],1+varians(),5+varians(), currentDice[1],3+varians(),7+varians());
		GUI.getUserButtonPressed(GameText.rollText(playerName, currentDice)+"\n"+GameText.fieldDescription[playerPosition],"Ok");
		GUI.setBalance(playerName, playerBalance);
		movePlayer(playerName,playerPosition+1);
		
	}
	public int varians(){
		return (int)(Math.round(Math.random()*2-1));
	}
	
    public void endGame(String playerName){	
    	GUI.getUserButtonPressed(GameText.winnerText(playerName),"X");
	}
	
	
	
	
}
