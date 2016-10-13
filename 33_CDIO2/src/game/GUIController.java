package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GUIController {
	Field[] fields = new Field[11];

	GUIController(String player1Name,String player2Name) {
		// Dette er så simpelt som det kan blive.
		for (int i = 0; i < 11; i++)
			fields[i] = new Street.Builder()
			.setTitle(GameText.fieldTitles[i])
			.setSubText(GameText.fieldSubText[i])
			.setDescription(GameText.fieldDescription[i])
			.build();

		//Create the board with the 11 fields
		GUI.create(fields);
		GUI.addPlayer(player1Name,1000);
		GUI.setDice(3, 4);
	}
	

	public void movePlayer(int playerNumber,int position){
		
	}
	
}
