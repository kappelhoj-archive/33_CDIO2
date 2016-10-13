package game;

public class Account {

	private int balance = 1000;
	
	public int getbalance(){
		return balance;
	}

	public void changebalance(int fieldValue){
		/**This part of the method simply adds or
		 * subtracts the field value from the player' balance.
		 */

		if (fieldValue < 0){
			while (balance > 0)
				balance -= fieldValue;
		}

		else if (fieldValue > 0){
			while (balance < 3000)
				balance += fieldValue;
		}

		/**This part of the method recognizes if the player already has 0 gold coins,
		 * it sets the balance to 0 again.
		 */
		else if (balance + fieldValue < 0){
			balance = 0;
		}

		/**This part of the method recognizes if the player already has 3000 gold coins,
		 * it sets the balance to 3000 again.
		 */
		else if (balance + fieldValue > 3000) {
			balance = 3000;
		}
	}
}