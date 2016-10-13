package game;

public class GameText {
	public static String[] fieldTitles={
/*(001)*/	"Tower",
/*(002)*/	"Crater",
/*(003)*/	"Palace gates",
/*(004)*/	"Cold Desert",
/*(005)*/	"Walled city",
/*(006)*/	"Monastery",
/*(007)*/	"Black cave",
/*(008)*/	"Huts in the mountain",
/*(009)*/	"The Werewall",
/*(010)*/	"The pit",
/*(011)*/	"Goldmine"};
	public static String[] fieldSubText={
/*(101)*/	"+250",
/*(102)*/	"-100",
/*(103)*/	"+100",
/*(104)*/	"-20",
/*(105)*/	"+180",
/*(106)*/	"0",
/*(107)*/	"-70",
/*(109)*/	"+60",
/*(108)*/	"-80 +T",
/*(110)*/	"-50",
/*(111)*/	"+650"};
	public static String[] fieldDescription={
/*(201)*/   "Along your journey, you come across a dark tower.  A through exploration reveals a chest of gold. You recover treasures worth 250 gold coins.",
/*(202)*/   "A huge crater blocks your further journey. It stretches on for hundreds of feet. A quick search near the mound of the crater reveals a rusty trolley and a railroad track. The tracks lead across the crater. A red imp sits in a ticketstand next to the old worn trolley. You pay the hefty price of 100 gold coins to cross the crater.",
/*(203)*/	"Your path leads you to a monstrous pair of palace gates. One herculean effort later, you finally manage to open the gates, revealing a sizeable pile of gold. You fill your pockets with 100 gold coins.",
/*(204)*/	"The extreme heat of the desert is quickly replaced by a bone chilling cold. Your comfortable clothes provide little protection, and you shiver throughout the night. Your shivering causes a few gold coins to drop from your pockets. You lose 20 gold coins.",
/*(205)*/	"Your journey leads to a walled city. The ruling lord fancies your mission and is intrigue by your tales of your travels. He provides you with additional funds to continue your  travelling. You have been gifted 180 gold coins.",
/*(206)*/	"A lone monastery break the uniformity of the surrounding land. The friendly monks can only provide a warm nights rest, and a decent meal. You gladly accept the offer. Your funds are not affected.",
/*(207)*/	"A black cave scars the mountainous regions on your way. As you draw closer to the entrance, a group of bandits surround you. It's an ambush. 'Anyone who wishes to pass my mountains must first pay the toll', the leader of the bandits say. You are forced to pay the 'toll' of 80 gold coins.",
/*(208)*/	"During a treacherous path in the woods, you come across an injured woodsman. The forester has had an accident, and can't walk on his own. He offers you pay and a meal if you help him back home. You help the forester back to his hut in the mountains, and receive 60 gold coins in return for your good deed.",
/*(209)*/	"Waking up after a deep night sleep, you notice a low rumbling in the distance. Scouting the horizon, you spot a huge black mass of werewolves, of various sizes. Franticly scrambling to gather your belongings, you miss a small bag of gold in your hurry. You lose 80 gold coins to the furry menace. Your quick departure earns you a second roll of the dice.",
/*(210)*/	"Enraptured by the surrounding greenery, you fail to notice the huge pit in front of you. Tumbling down the side of the  pit, your gold lined pockets scatter their contents. You lose 50 gold coins on your painful way down.",
/*(211)*/	"In your journey, you happen to meet a friendly dwarf. He offers you a huge payment in return for helping him recover a large gold ingot lodged inside his goldmine. You spend the rest of the day working alongside the dwarf, and succesfully retrieve the shiny metal. The dwarfs rewards you a staggering 650 gold coins!"
};
	
	
	/**
	 * The method enterPlayerNames returns a string Which asks the players to enter their names.
	 * @param  The number of the player
	 * @return String
	 */
	
	public static String enterPlayerName(int number)
	{
		return "Please enter the name of player " + number;
	}
	
	
	
	public static String introText(String playerName)
	{	
		String introText = "";
		introText = "Welcome to the game 'A Tale of Tales' \n" + gameRules();
		
		return introText;
	}
	
	/**
	 * The method rollText returns a String which contains what a particular player has rolled with the dice.
	 * @param playerName The name of the player (String).
	 * @param value A array of two dice values (Int[])
	 * @return String rollText
	 */
	
	public static String rollText(String playerName, int[] value)
	{
		return playerName + "has rolled a " + value[0] + " and a " + value[1];
	}
	
	public static String gameRules()
	{
		String gameRules = "";
		gameRules = "The game rules are as follows: \n";
		gameRules = "- All players start with 1000 gold coins. \n"
				  + "- The first player to achieve 3000 gold coins wins the game. \n"
				  + "- A player receive or loss gold coins each turn. The amount depends on which field you landed on in the current turn. \n"
				  + "- A player always lands on the field corresponding to the sum of the dice.";
		return gameRules;
	}
	
	
}
