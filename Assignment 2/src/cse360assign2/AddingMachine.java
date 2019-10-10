/* Alexandra Kassis CSE360 Assignment 2
 * This class maintains two calculating methods that can or 
 * subtract from a previous total. The total can be called or cleared
 */
package cse360assign2;

public class AddingMachine {

	private int total; // holds the total amount that can be added or subtracted
	private String history; // Stores the history of values added or subtracted
	
	/*Class constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = " 0 "; // Stores string of added and subtracted values
	}
	
	/*Gets total value
	 */
	public int getTotal () {
		return total; // returns the total amount added or subtracted from the previous total
	}
	
	/*Adds total value from the @param value to the total then adds it to the end
	 * of the history string
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/*Subtracts the @param value from the previous int stored in total then adds
	 * that value to the end of the history string
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	// Returns a string of all the added or subtracted values
	public String toString () {
		return history;
	}

	/* Clears the string that holds the history of values added or subtracted
	as well as the value stored in total
	*/
	public void clear() {
	  history = "0";
	  total = 0;
	
	}
}
