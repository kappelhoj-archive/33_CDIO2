package test;
import game.Account;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
Account acc;	
	
	@Before
	public void setUp () throws Exception
	{
		acc = new Account();
	}
	
	@After
	public void tearDown () throws Exception
	{

		acc = null;
	}
	
	
	/**
	 * Tests if the Account Balance
	 * method correctly adds Balance and
	 * the Field Value.
	 */
	@Test
	public void testAccountBalanceAddition() {
		int fieldValue = 250;
		int expected = 1250;
		acc.changeBalance(fieldValue);
		int actual = acc.getBalance();
		assertEquals(expected,actual);
	}
	
	
	/**
	 * Tests if the Account Balance
	 * method correctly subtracts Balance and
	 * the Field Value.
	 */
	@Test
	public void testAccountBalanceSubtraction() 
	{
		int fieldValue = -250;
		int expected = 750;
		acc.changeBalance(fieldValue);
		int actual = acc.getBalance();
		assertEquals(expected,actual);
	}

	
	/**
	 * Tests if the Account Balance
	 * method correctly does not exceed 3000
	 */
	@Test
	public void testAccountBalanceHighValue() 
	{
		int fieldValue = 15000;
		int expected = 3000;
		acc.changeBalance(fieldValue);
		int actual = acc.getBalance();
		assertEquals(expected,actual);
	}
	
	
	/**
	 * Tests if the Account Balance
	 * method correctly does not go below 0.
	 */
	@Test
	public void testAccountBalanceNegativeValue() 
	{
		int fieldValue = -15000;
		int expected = 0;
		acc.changeBalance(fieldValue);
		int actual = acc.getBalance();
		assertEquals(expected,actual);
	}
	
	/**
	 * Tests how the Account Balance
	 * method handles an incredibly large number,
	 * and if it correctly resets the Balance to 0.
	 */
	@Test
	public void testAccountBalanceOverflow() {
		int fieldValue = Integer.MAX_VALUE+1;
		int expected = 0;
		acc.changeBalance(fieldValue);
		int actual = acc.getBalance();
		assertEquals(expected,actual);
	}
}
