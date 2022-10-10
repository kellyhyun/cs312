import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;

/**
 * CS312 Assignment 3.
 *
 * Replace <NAME> with your name, stating on your honor you completed this
 * assignment on your own and that you didn't share your code with other
 * students.
 * 
 * On my honor, Soomin Hyun, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to print out various scintillation grids and a student designed drawing. 
 *
 *  Name: Soomin Hyun
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 *  Number of slip days used on this assignment: 0
 */

public class ScintillationGrid {

    // Main method that creates the DrawingPanel with scintillation grids.
    // Restricted to chapters 1 - 3 of Building Java Programs
    public static void main(String[] args) {
        /* In the final version of the program DO NOT call method drawingOne 
           from main or anywhere else in the program */
        final int WIDTH = 900;
        final int HEIGHT = 650;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
        dp.setBackground(Color.CYAN);	//setting entire background as cyan
		Graphics g = dp.getGraphics();	//so that we can later draw
        
        // CS312 Students add you four methods calls to draw the four
        // required scintillation grids here.
		fullGrid (g, 0, 0, 348, 75, 16);	//method to call the top left grid
		fullGrid (g, 400, 50, 422, 50, 12);	//method to call the top right grid
		fullGrid (g, 50, 400, 220, 100, 20);//method to call the bottom left grid
		fullGrid (g, 500, 500, 148, 15, 4);	//method to call the bottom right grid
		
		 // CS312 students, do not alter the following line of code.
        saveDrawingPanel(dp, "grid.png");
    }
    
	//this is the method to print any of the 4 grids. the order is important.
	public static void fullGrid (Graphics g, int x, int y, int sizeL, 
									int sizeS, int thickness) {
		blackSquares (g, x, y, sizeL); 
		verticalLines (g, x, y, sizeL, sizeS, thickness);
		horizontalLines (g, x, y, sizeL, sizeS, thickness);
		circles (g, x, y, sizeL, sizeS, thickness);
	}
	
	//this is the method for the big black square behind everything.
	public static void blackSquares (Graphics g, int x, int y, int sizeL) {	//x and y for the coordinates
		g.setColor(Color.BLACK);//color is set to black only for this method
		g.fillRect(x,y,sizeL,sizeL); //to draw a filled rectangle with these specifications
	}
	
	//this is the method for the gray, vertical lines
	public static void verticalLines (Graphics g, int x, int y, int sizeL, 
										int sizeS, int thickness) {
		g.setColor(Color.GRAY);//color is gray for this method
		final int NUM_LINES = sizeL / (sizeS + thickness); //constant for the method (no. of lines)
		for (int limit = 1; limit <= NUM_LINES; limit++) { //for loop to limit the number of lines
			int newX = x + sizeS + (sizeS + thickness)*(limit-1); //to change location of rectangles
			g.fillRect(newX, y, thickness, sizeL);		//drawing filled lines
		}
	}
	
	//this is the method for the gray, horizontal lines
	public static void horizontalLines (Graphics g, int x, int y, int sizeL, 
											int sizeS, int thickness) {
		g.setColor(Color.GRAY);//color is gray again for this method
		final int NUM_LINES = sizeL / (sizeS + thickness); //constant for the method (no. of lines)
		for (int limit = 1; limit <= NUM_LINES; limit++) { //for loop to limit the no. of lines
			int newY = y + sizeS + (sizeS + thickness)*(limit-1); //changes location of rectangles
			g.fillRect(x, newY, sizeL, thickness); // drawing filled lines
		}
	}
	
	//method to draw all the white circles
	public static void circles(Graphics g, int x, int y, int sizeL, 
									int sizeS, int thickness) {
		g.setColor(Color.WHITE); //color is set to white for this method
		double forty = thickness * 1.4; 
		int plus2 = thickness + 2;
		//using the previously defined variables, we will find the bigger number for the size
		//of the circle. either 40% bigger or 2 pixels bigger
		final int CIRCLESIZE = (int) Math.max(forty, plus2);
		final int NUM_LINES = sizeL / (sizeS + thickness);//constant for the method (no. of lines)
		for (int column = 1; column <= NUM_LINES; column++) { //determines how many columns of circles 
													 //for the grid
			//following variable changes the location of the columns
			int newX = x + column*sizeS + (column-1)*(thickness) + (thickness/2)- (CIRCLESIZE/2);
			//inner loop limits no. of circles per column
			for (int limit = 1; limit <= NUM_LINES; limit++) { 
				//changes the location of each circle on the column
				int newY = y + limit*sizeS + (limit-1)*(thickness) + (thickness/2)- (CIRCLESIZE/2);
				g.fillOval(newX, newY, CIRCLESIZE, CIRCLESIZE); //drawing the white circle
			}
		}
	}        

    // method for the student designed drawing
    // NOT restricted to chapters 1 - 3 of Building Java Programs
    // DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!
    public static void drawingOne() {
        // DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!

        // CS312 Students, you may increase the size of the drawing panel if
        // doing a non standard drawing.
        final int WIDTH = 400;
        final int HEIGHT = 200;
        DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);

        // CS312 Students, add your code, including method calls here
        dp.setBackground(Color.GREEN);	// makes the entire background green
		Graphics g = dp.getGraphics();	// this will now allow us to draw
		g.setColor(Color.RED);	//setting the color for the next lines of code to be red
		g.fillOval(0, 0, 200, 100);	//this will draw the top left oval
		g.fillOval(200, 100, 200, 100);	//this will draw the bottom right oval
		g.setColor(Color.BLACK);	//resetting the color to black
		g.drawLine(200, 0, 200, 200);	//this will draw the middle, vertical line
		g.drawLine(0, 100, 400, 100);	//this will draw the middle, horizontal line
		g.drawLine(100, 0, 100, 100);	//this will draw the middle, vertical, left line
		g.drawLine(0, 50, 200, 50);		//this will draw the middle, horizontal, left line
		g.drawLine(300, 100, 300, 200);	//this will draw the middle, vertical, right line
		g.drawLine(200, 150, 400, 150);	//this will draw the middle, horizontal, right line

	
        // Do not alter this line of code. It saves the panel to a file for later viewing
        saveDrawingPanel(dp, "drawing_one.png");
    }
    
    	
    
    // Save the current drawing panel to the given file. 
    // CS312 Students, do not alter this method.
    public static void saveDrawingPanel(DrawingPanel dp, String fileName) {
        try {
            dp.save(fileName);
        } catch (IOException e) {
            System.out.println("Unable to save DrawingPanel");
        }
    }
}

