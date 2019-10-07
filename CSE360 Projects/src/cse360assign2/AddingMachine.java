package cse360assign2;
/**
 * @author Preston McArthur
 * Assignment 2
 * CSE360
 * <p>
 * Class adds and subtracts numbers to a total.
 * </p>
 */

public class AddingMachine {

	private int total;
	private String calculations;
	
	/**
	 * Constructor for AddingMachine.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		calculations = "0";
	}
	
	/**
	 * Returns the total.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds number to total.
	 * @param value number being added
	 */
	public void add (int value) {
		total = total + value;
		calculations = calculations + " + " + value;
	}
	
	/**
	 * Subtracts number from total.
	 * @param value number being subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		calculations = calculations + " - " + value;
	}
	
	/**
	 * Shows history of inputs.
	 */
	public String toString () {
		return calculations;
	}
	
	/**
	 * Clears the total.
	 */
	public void clear() {
		total = 0;
		calculations = "0";
	}
}
