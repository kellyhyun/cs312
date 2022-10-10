import java.awt.Color;


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

public class Hippo extends Critter{
	
	private final int STEPS = 5;
	private final int NUM_DIRECTIONS = 4;
	private final int FIRST = 0;
	private final int SECOND = 1;
	private final int THIRD = 2;
	private final int FOURTH = 3;
	private int numSteps;
	private int randDirection;
	private Direction dir; 
	private int hunger;
	 
	//method constructor to initialize hunger so we can use it in later methods
	public Hippo (int hunger) {
		this.hunger = hunger;
	}
	
	//method to attack with scratch when hungry and pounce when not hungry
	public Attack fight(String opponent) {
		if (hunger > 0) {
			return Attack.SCRATCH;
		} else {
			return Attack.POUNCE;
		}
	}
	
	//method to make hippo gray when hungry and white when not hungry
	public Color getColor() {
		if (hunger > 0) {
			return Color.GRAY;
		} else {
			return Color.WHITE;
		}
	}
	
	//method to make direction change every 5 steps
	public Direction getMove() {
		//determine direction when number of steps is equal to 0
		if (numSteps == 0) {
			//random direction because there are 4 directions
			randDirection = (int)(Math.random() * NUM_DIRECTIONS);
			if (randDirection == FIRST) {
				dir = Direction.NORTH;
			} else if (randDirection == SECOND) {
				dir = Direction.EAST;
			} else if (randDirection == THIRD) {
				dir = Direction.SOUTH;
			} else if (randDirection == FOURTH){
				dir = Direction.WEST;
			}
		}
		numSteps++;
		numSteps = numSteps % STEPS;//to make hippo always move
		return dir;
	}
	
	//method to make hippo always eat when hungry and not eat after eating enough
	public boolean eat() {
		if (hunger > 0) {
			hunger--;//making hunger less because hippo eats each time
			return true;
		} else {
			return false;
		}
	}
	
	//method to make string of hippo the number of hunger
	public String toString() {
		return ("" + hunger);
	}
	
}
