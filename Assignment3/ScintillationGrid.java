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
 * On my honor, <NAME>, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to print out various scintillation grids and a student designed drawing. 
 *
 *  email address:
 *  UTEID:
 *  Number of slip days I am using on this assignment:
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
        
        // CS312 Students add you four methods calls to draw the four
        // required scintillation grids here.

        
        // CS312 students, do not alter the following line of code.
        saveDrawingPanel(dp, "grid.png");
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

