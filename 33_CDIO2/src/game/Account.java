package game;

public class Account {

	int Balance = 1000;
	int fieldValue = 5;

	public int getBalance(){
		return Balance;
	}

	public void changeBalance(){
		/**This part of the method simply adds or
		 * subtracts the field value from the player' balance.
		 */

		if (fieldValue < 0){
			while (Balance > 0)
				Balance -= fieldValue;
		}

		else if (fieldValue > 0){
			while (Balance < 3000)
				Balance += fieldValue;
		}

		/**This part of the method recognizes if the player already has 0 gold coins,
		 * it sets the balance to 0 again.
		 */
		else if (Balance + fieldValue < 0){
			Balance = 0;
		}
		
		/**This part of the method recognizes if the player already has 3000 gold coins,
		 * it sets the balance to 3000 again.
		 */
		else if (Balance + fieldValue > 3000) {
			Balance = 3000;
		}
		
		else if (Balance > 3000){
			Balance = 3000;
		}
	}
}
