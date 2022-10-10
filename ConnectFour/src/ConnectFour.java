import java.util.Scanner;

/**
 * CS312 Assignment 10.
 *
 * On my honor, Soomin Hyun, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian 
 *  Number of slip days used on this assignment: 0
 *
 * Program that allows two people to play Connect Four.
 */


public class ConnectFour {

    // CS312 Students, add your constants here.

    public static void main(String[] args) {
        intro();
        Scanner key = new Scanner(System.in);
        // Complete this method.
        // Make and use one Scanner connected to System.in.
        String name1 = getName(key, "Player 1 enter your name: ");
        String name2 = getName(key, "Player 2 enter your name: ");
        
        key.close();
    }


    // CS312 Students, add your methods here.
    public static String getName(Scanner key, String promptPlayer) {	
    	System.out.print(promptPlayer);
		return key.next();
	}

    // Show the introduction.
    public static void intro() {
        System.out.println("This program allows two people to play the");
        System.out.println("game of Connect four. Each player takes turns");
        System.out.println("dropping a checker in one of the open columns");
        System.out.println("on the board. The columns are numbered 1 to 7.");
        System.out.println("The first player to get four checkers in a row");
        System.out.println("horizontally, vertically, or diagonally wins");
        System.out.println("the game. If no player gets fours in a row and");
        System.out.println("and all spots are taken the game is a draw.");
        System.out.println("Player one's checkers will appear as r's and");
        System.out.println("player two's checkers will appear as b's.");
        System.out.println("Open spaces on the board will appear as .'s.\n");
    }


    // Prompt the user for an int. The String prompt will
    // be printed out. key must be connected to System.in.
    public static int getInt(Scanner key, String prompt) {
        while(!key.hasNextInt()) {
            String notAnInt = key.nextLine();
            System.out.println(notAnInt + " is not an integer.");
            System.out.print(prompt);
        }
        int result = key.nextInt();
        key.nextLine();
        return result;
    }
}
