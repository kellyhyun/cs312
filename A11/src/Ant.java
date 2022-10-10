import java.awt.Color; //to get color

/**
* CS312 Assignment 11.
*
* On MY honor, Soomin Hyun, this programming assignment is MY own work
* and I have not provided this code to any other student.
*
* Student name: Soomin Hyun
* UTEID:sh52679
* email address: kellyhyun@utexas.edu
* Section 5 digit ID: 52215
* Grader name: Kiana Fithian 
* Number of slip days used on this assignment: 1
*
*/

public class Ant extends Critter {
	private final int EVEN = 2;
	private final String ANT_STRING = "%";
	private int numSteps;
	private boolean walkSouth;
	
	//constructor method that initializes boolean so we can use it in later methods
	public Ant (boolean walkSouth) {
		this.walkSouth = walkSouth;
	}
	
	//method that makes all attacks scratch
	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}
	
	//method that makes all ant colors red
	public Color getColor() {
		return Color.RED;
	}
	
	//method that makes the ants move in a zig zag motion
	public Direction getMove() {
		Direction result = Direction.CENTER; //initialize
		if (walkSouth) {	//statement for if the ant told to walk south first
			if (numSteps % EVEN == 0) {
				result = Direction.SOUTH;
			} else if (numSteps % EVEN == 1) {
				result = Direction.EAST;
			}
			numSteps++; //continue increasing the steps
		} else if (!walkSouth) {	//statement for if the ant told to walk north first
			if (numSteps % EVEN == 0) {
				result = Direction.NORTH;
			} else if (numSteps % EVEN == 1) {
				result = Direction.EAST;
			}
			numSteps++;  //continue increasing the steps
		}
		return result;
	}
	
	//method to make ant always eat
	public boolean eat() {
		return true;
	}
	
	//method that defines string of ants
	public String toString() {
		return ANT_STRING;
	}
	
}
