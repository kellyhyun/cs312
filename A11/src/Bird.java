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

public class Bird extends Critter {
	private final int FIRST_MOVEMENT = 3;
	private final int SECOND_MOVEMENT = 6;
	private final int THIRD_MOVEMENT = 9;
	private final int FOURTH_MOVEMENT = 12;
	private final int FIRST = 1;
	private final int SECOND = 2;
	private final int THIRD = 3;
	private final int FOURTH = 4;
	private final String ANT_STRING = "%";
	private final String BIRD_STRING_NORTH = "^";
	private final String BIRD_STRING_EAST = ">";
	private final String birdStringSouth = "V";
	private final String BIRD_STRING_WEST = "<";
	private int numSteps;
	private int determine;
	
	//method to make bird usually pounce unless it is an ant so that the bird can win ant battle
	public Attack fight (String opponent) {
		Attack result = Attack.POUNCE;
		if (opponent.equals(ANT_STRING)) {
			result = Attack.ROAR;
		}
		return result;
	}
	
	//method to always make bird color blue
	public Color getColor() {
		return Color.BLUE;
		
	}
	
	//method to make bird fly in circle
	public Direction getMove() {
		Direction result = Direction.CENTER;//initialize
		//this if statement is making sure the directions change 
		//depending on where we are on the "circle"
		if (numSteps < FIRST_MOVEMENT) {
			result = Direction.NORTH;
			determine = FIRST;
		} else if ((numSteps >= FIRST_MOVEMENT) && (numSteps < SECOND_MOVEMENT)) {
			result = Direction.EAST;
			determine = SECOND;
		} else if ((numSteps >= SECOND_MOVEMENT) && (numSteps < THIRD_MOVEMENT)) {
			result = Direction.SOUTH;
			determine = THIRD;
		} else if ((numSteps >= THIRD_MOVEMENT) && (numSteps < FOURTH_MOVEMENT)) {
			result = Direction.WEST;
			determine = FOURTH;
		}
		numSteps++; //continue steps
		numSteps = numSteps % FOURTH_MOVEMENT; //to make bird go in circle continuously
		return result;
	}
	
	//method to change what the bird looks like depending on the direction
	public String toString() {
		String result = "";
		if ((determine == 0)||(determine == FIRST)) {
			result = BIRD_STRING_NORTH;
		} else if (determine == SECOND) {
			result = BIRD_STRING_EAST;
		} else if (determine == THIRD){
			result = birdStringSouth;
		} else if (determine == FOURTH) {
			result = BIRD_STRING_WEST;
		}
		return result;
	}
	
}
