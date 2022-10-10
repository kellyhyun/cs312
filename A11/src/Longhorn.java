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

public class Longhorn extends Critter {
	private final String ANT_STRING = "%";
	private final String LONGHORN_STRING = "*";
	private final String STONE_STRING = "S";
	private final int EVEN = 2;
	private int counter;
	private int colorChange;
	public Longhorn () {
	}
	
	//method to make longhorn win against ants and stones and birds and either win or random with 
	//the hippo
	public Attack fight(String opponent) {
		Attack result = Attack.SCRATCH;//scratch wins against birds and vultures and is random 
									   //or wins against hippos 
		if (opponent.equals(ANT_STRING)) { //makes sure of always winning against ants
			result = Attack.ROAR;
		} else if (opponent.equals(STONE_STRING)) {//makes sure of always winning against stones
			result = Attack.POUNCE;
		}
		return result;
	}
	
	//method to change the longhorn color between orange and white
	public Color getColor() {
		Color result = Color.ORANGE;
		if (colorChange == 0) {
			result = Color.WHITE;
		}
		colorChange++;
		colorChange = colorChange % EVEN;
		return result;
	}
	
	//method for the longhorn to eventually pass through the entire simulation board
	public Direction getMove() {
		Direction result = Direction.NORTH;
		//if statement to make longhorn move left once after passing through simulation height
		if (counter == getHeight()) {
			result = Direction.EAST;
			counter = 0;
		} else {
			counter++; 
		}
		return result;
	}
	
	//always make longhorns eat so that the score goes up
	public boolean eat() {
		return true;
	}
	
	//method to state that longhorns are always stars!
	public String toString() {
		return LONGHORN_STRING;
	}
	
}
