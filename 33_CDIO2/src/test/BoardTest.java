package test;

import static org.junit.Assert.*;
import game.Board;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	Board board;
	
	@Before
	public void setUp() throws Exception {
		board = new Board();
	}

	@After
	public void tearDown() throws Exception {
		board = null;
	}
	
	/* 
	 * Tests if the method getFieldGold returns the correct gold value for
	 * a specific field.
	 */
	@Test
	public void testGetFieldGold() {
		int fieldIndex = 0;
		// The expected gold value for field index 0 (Tower).
		int expected = 250;
		// The actual gold value for field index 0.
		int actual = board.getFieldGold(fieldIndex);
		assertEquals(expected, actual);
	}
	
	/*
	 * Tests if the method getFieldGold returns the correct gold value for
	 * all the fields on the board.
	 */
	@Test
	public void testGetGoldForAllFields() {
		// Array with the 11 fields and their gold values.
		int[] fields = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
		
		for(int i = 0; i < fields.length; i++)
		{
			int actual = fields[i];
			int expected = board.getFieldGold(i);
			assertEquals(expected, actual);
		}
	}
	
	/*
	 * Tests if the method getFieldExtraTurn returns the correct extraTurn value.
	 */
	@Test
	public void testGetFieldExtraTurn() {
		// Field index of 
		int fieldIndex = 0;
		boolean expected = false;
		boolean actual = board.getFieldExtraTurn(fieldIndex);
		assertEquals(expected, actual);
	}
	
	/*
	 * Tests if the method getFieldExtraTurn returns the correct extraTurn value
	 * for all the fields on the board.
	 */
	@Test
	public void testGetFieldExtraTurnForAllFields() {
		// Array with the 11 fields and their extraTurn values (only The Werewall field gives an extra turn).
		boolean[] fields = {false, false, false, false, false, false, false, false, true, false, false};
		
		for(int i = 0; i < fields.length; i++)
		{
			boolean expected = fields[i];
			boolean actual = board.getFieldExtraTurn(i);
			assertEquals(expected, actual);
		}
	}
}
