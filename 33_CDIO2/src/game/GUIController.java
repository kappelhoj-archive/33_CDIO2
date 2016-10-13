package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GUIController {
	Field[] fields = new Field[11];

	GUIController() {
		// Dette er så simpelt som det kan blive.
		for (int i = 0; i < 11; i++)
			fields[i] = new Street.Builder()
			.setTitle(GameText.fieldTitles[i])
			.setSubText(GameText.fieldSubText[i])
			.setDescription(GameText.fieldDescription[i])
			.build();


		GUI.create(fields);
		GUI.setDice(3, 4);
	}
}
