package game;


public class Die {

	public final int MAX_VALUE;
	private int value;

	/**
	 * Opretter en terning med 6 sider, og en tilfældig værdi fra 1-6.
	 */
	public Die() {
		MAX_VALUE = 6;
		value = rollDie();
	}
	/**
	 * Opretter en terning med n sider.
	 * @param n antal sider på terningen.
	 */
	public Die(int n) {
		MAX_VALUE = n;
		value = rollDie();
	}

	/**
	 * Denne funktion slår med terningen og gemmer slaget i en variabel.
	 * 
	 * @return Retunerer terningens værdi (int).
	 */
	public int rollDie() {
		// Generere en tilfældig værdi mellem 1 og 6.
		value = (int) (Math.random() * MAX_VALUE + 1);
		return value;
	}

	/**
	 * Henter værdien af terningen.
	 * 
	 * @return Den nuværende værdi af terningen.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returnere en string der beskriver værdien af terningen.
	 */
	public String toString() {
		return "The value of the die is: " + value;
	}
	
	/**
	 * Sætter værdien af terningen.
	 * OBS: Bruges kun til at teste med. Er derfor ikke i diagrammerne.
	 */
	public void setValue(int value)
	{
		this.value = value;
	}
}
