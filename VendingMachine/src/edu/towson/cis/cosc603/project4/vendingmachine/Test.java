/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

/**
 * @author Madhura Tendulkar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		VendingMachineItem vendingMachineItem = new VendingMachineItem("Chocolate", 1.5);
		VendingMachineItem vendingMachineItem1 = new VendingMachineItem("Chips", 1.5);
		VendingMachineItem vendingMachineItem2 = new VendingMachineItem("Ice cream", 1.5);
		VendingMachineItem vendingMachineItem3 = new VendingMachineItem("Coffee", 1.5);
		
		
		vendingMachine.addItem(vendingMachineItem, "A");
		
		vendingMachine.addItem(vendingMachineItem1, "B");
		
		//assertTrue((Arrays.asList(vendingMachine.itemArray[1]).contains(vendingMachineItem1)));
		vendingMachine.addItem(vendingMachineItem2, "C");
		//assertTrue((Arrays.asList(vendingMachine.itemArray[2]).contains(vendingMachineItem2)));

		vendingMachine.addItem(vendingMachineItem3, "D");
		//assertTrue((Arrays.asList(vendingMachine.itemArray[2]).contains(vendingMachineItem3)));
		
		
		
		vendingMachine.insertMoney(3.0);
		boolean value = vendingMachine.makePurchase("A");
		System.out.println(value);
		System.out.println(vendingMachine.getBalance());
		System.out.println(vendingMachine.getBalance());
		
		
	}

}
