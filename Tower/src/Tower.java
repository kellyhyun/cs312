/*
 *  CS312 Assignment 2.
 *  On my honor, <Soomin Hyun>, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Soomin Hyun
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 *  Number of slip days used on this assignment: 1
 */

public class Tower {
    
    // CS312 students, DO NOT ALTER THE FOLLOWING LINE except for the 
    // value of the literal int.
    // You may change the literal int assigned to SIZE to any value from 2 to 100.
    // In the final version of the program you submit set the SIZE to 3.
    public static final int SIZE = 3;
  
    //This declaration is to calculate the number of rows on the stairs.
    //I call the int ROW for the number of ROWS.
    public static int ROW = SIZE/2 + 1;		//The integer will change according to this equation.
  
    /*
     * The main method is printing all parts of the tower. 
     * I have separated the different parts for readability, and so that
     * my main method isn't crowded.
     */
    public static void main(String[] args) {
    	topPart();				//This is the method for the top part of the tower. 
    	midPart();				//This is the method for the middle part of the tower.
    	bottomPart();			//This is the method for the bottom part of the tower. 
    } 	
   
    	/* 
    	 * This method is for printing the correct amount of space from the start 
    	 * of the tower to the hashtags. This also applies to all the lines from
    	 * and the the first set of hashtags to the last set of hashtags 
    	 * (SIZE = 3: lines 1-6). 
    	 * This space is necessary to print the tower centered. 
    	 */
    	public static void topSpace() {
    		//I called the variable space because each time it does 
    		//a loop, there is one "space added."
    		for (int space = 1; space <= 4*SIZE+2; space++) {		
    			System.out.print(" ");
    		}
    	}
    
    	/*
    	 * This method is for printing the correct amount of hashtags for the 
    	 * top of the tower. 
    	 * This is for lines 1 and 4.
    	 */
    	public static void hashtag() {
    		topSpace();										//centers the tower.
    		for (int hash = 1; hash <= 2*SIZE-1; hash++) {	// when it does a loop, it adds a #.  
    			System.out.print("#");
    		}
    		System.out.println();
    	}
    
    	/*
    	 * This method is to put all parts of the top part together, so the spaces, 
    	 * hashtags, and the vertical lines. 
    	 * With SIZE = 3, the lines are 1-6. 
    	 */
    	public static void topPart() {
    		//These methods within the topPart method is to print the hashtags.
        	hashtag();
    		for (int rows = 1 ; rows <= 2*SIZE-2; rows++) {// determines how many line rows
    	    	topSpace();
    	    		/*
    	        	 * This for loop is for printing the correct amount of vertical lines for 
    	        	 * the top of the tower.
    	        	 * This would be for lines in between the hashtags. 
    	        	 */
    	    		for (int line = 1; line <=2*SIZE-1; line++) {	//one loop = one line
    	    			System.out.print("|");
    	    		}
    	    		System.out.println();
    	    }
        	hashtag();
    	}
    
    	/*
    	 * This method is to print the spaces to center the middle part of the tower.
    	 * For SIZE = 3, the lines are 7-25.
    	 */
    	public static void midSpace() {
    		for (int space = 1; space <= 4*SIZE; space++) {
    			System.out.print(" ");	//In most cases, my reasoning will be the same as above.
    		}
    	}
    	
    	/*
    	 * This method is to print the squiggly line.
    	 * For SIZE = 3, the first line of squigglies is at line7.
    	 */
    	public static void squiggly() {
    		midSpace();
    		for (int squiggle = 1; squiggle <= 2*SIZE+3; squiggle++) {
    			System.out.print("~");
    		}
    		System.out.println();
    	}
    	
    	
    	/*
    	 * This method is to put the mid part of the tower together.
    	 * So we will be putting the squigglies, spaces, and windows together.
    	 * For SIZE = 3, the lines are 7-25.
    	 */
    	public static void midPart() {
    		/*
    		 * This method within the midPart method is to print the extra,
    		 * top squiggly line.
    		 */
    		squiggly();
    		for (int rows = 1 ; rows <= SIZE*SIZE; rows++) {
    	    	midSpace();
    	    	// This inner loop is to print the group of windows and squigglies. 
    	    	// This one is neccessary unlike the topPart, because it starts with a |-.
    	    	for (int group = rows; group <= rows; group++) { //one row is a group
    	    			/*
    	    			 * This for loop is to print the windows between the squiggly lines,
    	    			 * it looks like this |-O-O-O-|. 
    	    			 * For SIZE = 3, this first line of this is at line 8.
    	    			 */
    	        		System.out.print("|-");
    	        		for (int window = 1; window <= SIZE; window++) {
    	        			System.out.print("O-");
    	        		}
    	        		System.out.println("|");
    	        		squiggly();
    	        	}
    	    	}
    	    }
    	
    	//This method is for printing the 9 spaces in front of a line of some sizes (6and7). 
    	//These spaces are the center the stairs.
    	public static void space9() {
    		//this for outer for loop is limiting which sizes this method will apply to. 
    		//same variable name will be used for other for loops that limit.
    		for (int limit = ROW/4; limit >= 1; limit--) {	
    			for(int space = 1; space <= 9; space++) {
    				System.out.print(" ");
    			}
    		}
    	}
    	
    	//This method is for printing the 6 spaces in front of a line of some sizes (4,5,6,7).    	
    	//These spaces are the center the stairs.
    	public static void space6() {
    		for (int limit = ROW/3; limit >= 1; limit--) {	//outer loop to limit affected sizes
    			for(int space = 1; space <= 6; space++) {	//inner loop to print spaces
    				System.out.print(" ");
    			}
    		}
    	}
    	
    	//This method is for printing the 3 spaces in front of a line of all sizes. 
    	//These spaces are the center the stairs.
    	public static void space3() {	
    		for (int limit = ROW / 5; limit >= 0; limit--) { //outer loop to limit affected sizes
    			for(int space = 1; space<=3; space++) {		 //inner loop to print spaces
    				System.out.print(" ");
    			}
    		}
    	}
    	
    	//This method is for printing the bottom stairs step. Long and doesn't have spaces on sides.
    	//All sizes will have this method affecting them.
    	public static void stairs1() {
    		for (int limit = ROW/5; limit>=0; limit--) { //outer loop limits which affected sizes
        		System.out.print("/");	//to print the start of stairs so it points into the tower.
        		for(int width = 1; width <= SIZE*5; width++) {	//determines width of stairs
        			System.out.print("\"'"); //prints the "inside" of the stairs
        		}
        		System.out.println("\"\\");	//to print end of stairs so it points into tower.
        	}
    	}
    	
    	// Method to print second to bottom stairs step. Has 3 spaces next to it to center.
    	// All sizes will have this method affecting them.
    	public static void stairs2() {
    		space3();	//spaces to center tower
    		for (int limit = ROW/5; limit >= 0; limit--) { //outer loop limits which affected sizes
    			System.out.print("/");	//to print the start of stairs so it points into the tower.
    			for(int width = 1; width <= SIZE*5-3; width++) {	//determines width of stairs
    				System.out.print("\"'");	//prints the "inside" of the stairs
    			}
    			System.out.println("\"\\");	//to print end of stairs so it points into tower.
    		}
    	}
    	
    	//Method to print second from top stairs step. Has 6 spaces next to it to center.
    	public static void stairs3() {
    		space6();	//spaces to center tower
    		for (int limit = ROW/3; limit >= 1; limit--) { //outer loop limits which affected sizes (4,5,6,7).
    			System.out.print("/"); 
    			for(int width = 1; width <=SIZE*5-6; width++) {
    				System.out.print("\"'");
    			}
    			System.out.println("\"\\");
    		}
    	}
    	
    	//Method to print top stairs step. Has 9 spaces next to it to center.
    	public static void stairs4() {
    		space9();	//spaces to center tower
    		for (int limit = ROW / 4; limit >= 1; limit--) { //outer loop limits which affected sizes (6,7).
    			System.out.print("/");
    			for(int width = 1; width <= SIZE*5-9; width++) {
    				System.out.print("\"'");
    			}
    			System.out.println("\"\\");
    		}
    	}
    	
    	//Method to print last lines of tower. Very bottom lines of tower.
    	public static void lastWindows() {
    		for (int rows = 1; rows <= SIZE; rows++) {	//determines how many rows there are
    			System.out.print("/");
    			for(int width = 1; width <=SIZE*5; width++) { //determines width of last lines
    				System.out.print("\"O");
    			}
    			System.out.println("\"\\");
    		}
    	}
    	
    	//Method to put together all parts of the bottom of the tower.
    	//Order is important here, the order determines whether the staircase will be rightside up.
    	public static void bottomPart() {
    		stairs4();
    		stairs3();
    		stairs2();
    		stairs1();
    		lastWindows();
    	}
    	
}

