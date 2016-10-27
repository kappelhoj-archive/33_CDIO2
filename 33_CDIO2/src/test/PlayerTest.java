package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import game.Player;

public class PlayerTest {


Player player;	
	
	@Before
	public void setUp() throws Exception {
		player = new Player("Peter");
	}

	@After
	public void tearDown() throws Exception {
		player = null;
	}
	
	/**
	 * TEST ID: UP01
	 * Method to test whether player name is correcly read,
	 * from the user.
	 */
	@Test
	public void testGetPlayerName() {
		String expected = "Peter";
		player.getPlayerName();
		String actual = player.getPlayerName();
		assertEquals(expected,actual);
	}

}
