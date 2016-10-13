package game;

public class Account {

	private int balance = 1000;

	public int getBalance(){
		return balance;
	}
/**
 * Method to calculate the new balance based on the int fieldValue.
 */
	public void changeBalance(int fieldValue){
		/**This part of the method simply adds or
		 * subtracts the field value from the player' balance.
		 */

		balance=balance+fieldValue;
		if (balance < 0)
			balance=0;
		else if(balance>3000)
			balance=3000;

	}

}