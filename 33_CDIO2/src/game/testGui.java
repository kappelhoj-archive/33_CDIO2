package game;

public class testGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array={"Bob","Børge"};
		GUIController guicon=new GUIController(array);
		guicon.movePlayer("bob",2);
		guicon.movePlayer("bob",3);
		guicon.movePlayer("bob",4);
		guicon.movePlayer("bob",5);
	}

}
