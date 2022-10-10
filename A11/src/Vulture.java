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

//vulture class extends bird instead of critter because a lot of bird methods apply to vulture
public class Vulture extends Bird{
	
	private final int STOP_EAT = 1;
	private int firstEat;
	
	//method to make the color always black
	public Color getColor() {
		return Color.BLACK;
	}
		
	//method to eat only at the first time eating food
	public boolean eat() {
		boolean eat = false;//initialize as false
		if (firstEat == 0) { //if it is the first time eating
			eat = true;		 //make the vulture eat
		} 
		firstEat = STOP_EAT;//stop eating after the first time eating
		return eat;
	}

}
