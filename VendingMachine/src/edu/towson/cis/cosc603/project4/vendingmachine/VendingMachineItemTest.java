/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Madhura Tendulkar
 *
 */
public class VendingMachineItemTest {
	
	VendingMachineItem vendingMachineItem;
	VendingMachineItem vendingMachineItem1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		vendingMachineItem = new VendingMachineItem("Ice cream", 2.5);
		
	}

	
	/**
	 * Test the constructor of VendingMachineItem
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	@Test
	public void testVendingMachineItem() {
		
			assertTrue((vendingMachineItem instanceof VendingMachineItem));
		
	}
	
	
	/**
	 * Test the method getName
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test
	public void testGetName() {
		assertEquals("Ice cream", vendingMachineItem.getName());
	}

	/**
	 * Test the method getPrice
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	
	@Test
	public void testGetPrice() {
		assertEquals(2.5, vendingMachineItem.getPrice(),0.0);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		vendingMachineItem = null;
	
	}


}
