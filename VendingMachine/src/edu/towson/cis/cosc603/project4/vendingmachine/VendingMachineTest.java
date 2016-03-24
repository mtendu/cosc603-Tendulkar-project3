/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Madhura Tendulkar
 *
 */
public class VendingMachineTest {
	private static VendingMachine vendingMachine = null;
	private static VendingMachineItem vendingMachineItem = null;
	private static VendingMachineItem vendingMachineItem1 = null;
	private static VendingMachineItem vendingMachineItem2 = null;
	private static VendingMachineItem vendingMachineItem3 = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUp() throws Exception {
		vendingMachine = new VendingMachine();
		vendingMachineItem = new VendingMachineItem("Chocolate", 1.5);
		vendingMachineItem1 = new VendingMachineItem("Chips", 1.5);
		vendingMachineItem2 = new VendingMachineItem("Ice cream", 1.5);
		vendingMachineItem3 = new VendingMachineItem("Coffee", 3.5);		
	}

	
	/**
	 * Test the method addItem() with correct input.
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItem() {
		
		vendingMachine.addItem(vendingMachineItem, "A");
		assertTrue((Arrays.asList(vendingMachine.itemArray[0]).contains(vendingMachineItem)));
		
		vendingMachine.addItem(vendingMachineItem1, "B");
		assertTrue((Arrays.asList(vendingMachine.itemArray[1]).contains(vendingMachineItem1)));
		
		vendingMachine.addItem(vendingMachineItem2, "C");
		assertTrue((Arrays.asList(vendingMachine.itemArray[2]).contains(vendingMachineItem2)));

		vendingMachine.addItem(vendingMachineItem3, "D");
		assertTrue((Arrays.asList(vendingMachine.itemArray[3]).contains(vendingMachineItem3)));

	}
	
	/**
	 * Test the method addItem() for the case to add item in already occupied slot.
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItemOccupied(){
		vendingMachine.addItem(vendingMachineItem3, "D");
		assertTrue((Arrays.asList(vendingMachine.itemArray[3]).contains(vendingMachineItem3)));
	}
	
	/**
	 * Test the method addItem() for the invalid slot code.
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItemInvalidCode(){
		vendingMachine.addItem(vendingMachineItem3, "E");
		assertTrue((Arrays.asList(vendingMachine.itemArray[3]).contains(vendingMachineItem3)));
	}
	/** 
	 * Test the method removeItem() with good input.
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */	
	@Test
	public void testRemoveItem() {
		assertSame(vendingMachineItem,vendingMachine.removeItem("A"));
	}
	
	/** 
	 * Test the method removeItem() for the case to remove the item from empty slot. 
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */	
	@Test
	public void testRemoveItemEmptySlot() {
		vendingMachine.removeItem("B");
		assertSame(vendingMachineItem,vendingMachine.removeItem("B"));
	}
	
	/** 
	 * Test the method removeItem() for the case to remove the item with invalid code
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */	
	@Test
	public void testRemoveItemInvalidCode() {
		assertSame(vendingMachineItem,vendingMachine.removeItem("M"));
	}
	
	
	/**
	 * Test the method insertMoney with amount >= 0
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		vendingMachine.insertMoney(0);
		assertEquals(0, vendingMachine.getBalance(), 0.0);
		vendingMachine.insertMoney(1.5);
		assertEquals(1.5, vendingMachine.getBalance(), 0.0);
		vendingMachine.insertMoney(1.5);
		assertEquals(3.0, vendingMachine.getBalance(), 0.0);
	}
	
	/**
	 * Test the method insertMoney with amount < 0
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoneyInvalidAmount() {
		vendingMachine.insertMoney(-1);
		assertEquals(-1, vendingMachine.getBalance(), 0.0);
	}
	
	/**
	 * Test the method makePurchase with good input.
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#testMakePurchase()}.
	 */
	@Test
	public void testMakePurchase() {
		assertEquals(true,vendingMachine.makePurchase("A"));
	}
	
	/**
	 * Test the method makePurchase for code of empty slot
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#testMakePurchase()}.
	 */
	@Test
	public void testMakePurchaseEmptySlot() {
		assertEquals(true,vendingMachine.makePurchase("B"));
	}
	
	
	/**
	 * Test the method makePurchase for code of empty slot
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#testMakePurchase()}.
	 */
	@Test
	public void testMakePurchaseInSufficientBalance() {
		assertEquals(true,vendingMachine.makePurchase("C"));
	}
	

	/**
	 * Test the method getBalance 
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#testGetBalance()}.
	 */
	@Test
	public void testGetBalance(){
		assertEquals(1.5, vendingMachine.getBalance(),0.0);
	}
	
	/**
	 * Test the method getBalance with bad input 
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#testGetBalance()}.
	 */
	
	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#returnChange()}.
	 */
	@Test
	public void testReturnChange() {
		assertEquals(1.5, vendingMachine.returnChange(),0.0);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDown() throws Exception {
		vendingMachine = null;
		vendingMachineItem = null;
		vendingMachineItem1 = null;
		vendingMachineItem2 = null;
		vendingMachineItem3 = null;
	}

}