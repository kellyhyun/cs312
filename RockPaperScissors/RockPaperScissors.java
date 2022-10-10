import java.util.Scanner;

/**
 * CS312 Assignment 4.
 *
 * On my honor, Soomin Hyun, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to play Rock Paper Scissors
 *
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 *  Number of slip days used on this assignment: 2
 */

public class RockPaperScissors {

	public static final int ROCK = 1;
	public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static int round = 1;	
    public static int draw = 0;		//Here I initialized variables round, draw, comp, and user
    public static int comp = 0;		//so that I won't have to later on in my playGame method.
    public static int user = 0;
    /* A program to allow a human player to play rock - paper - scissors
     * against the computer. If args.length != 0 then we assume
     * the first element of args can be converted to an int
     */
    public static void main(String[] args) {
        // CS312 Students. Do not change the following line.
        RandomPlayer computerPlayer = buildRandomPlayer(args);

        // CS312 students do no change the following line. 
        // Do not create any other Scanners. 
        Scanner keyboard = new Scanner(System.in);
        //the next line waits for user input (string) and stores it into "name" for future use
        String name = introduction(keyboard);		
        //the next line waits for user input (integer) and stores it into "name" for future use
        int noRounds = howManyRounds(keyboard, name);
        //this next line calls our biggest method
        playGame(keyboard, name, noRounds, computerPlayer, round, user, comp, draw);
        keyboard.close();
    }
    
    //This method looks long, but many of my lines had to be broken up so that I don't cross
    //the 100 character limit for any of the lines.
    //I put it at the beginning because this method is the bulk/most important part of my code.
    public static void playGame (Scanner keyboard, String name, int noRounds, 
    				RandomPlayer computerPlayer, int round, int user, int comp, int draw) {
    	while (round <= noRounds) {	//starts at 1, ends at user input noRounds
    		//states which round at the start of each round
    		System.out.println("\nRound " + round + "."); 
    		System.out.println(name + ", please enter your choice for this round.");
    		//stores userChoice for later code(userWord, reaction, etc.)
    		int userChoice = userChoices(keyboard, name, noRounds);
    		//stores computerChoice for later code(computerWord, reaction, etc.)
    	    int computerChoice = computerChoices(noRounds, computerPlayer);
    	    String userWord = userChoiceToWord(userChoice);					//these two are stored
    	    String computerWord = computerChoiceToWord(computerChoice);		//for the next line
    		System.out.println("Computer picked " + computerWord + ", " + name + " picked " 
    																+ userWord + ".\n");
    		//This if statement is the counter for who won/if it was a draw
    		if (userChoice == computerChoice) {
        		draw = draw + 1;
        	} else if ((userChoice == ROCK && computerChoice == PAPER)
    				||(userChoice == PAPER && computerChoice == SCISSORS)
    				||(userChoice == SCISSORS && computerChoice == ROCK)) {
        		comp = comp + 1;
        	} else if ((userChoice == ROCK && computerChoice == SCISSORS)
    				||(userChoice == PAPER && computerChoice == ROCK)
    				||(userChoice == SCISSORS && computerChoice == PAPER)) {
        		user = user + 1;
        	}
    		//this method prints out who won
    		reaction(userChoice, computerChoice);
    		//This if statement is important, it prints out the final results of the game only at 
    		//the end of all the rounds. 
    		if (round == noRounds) {
    			System.out.println("\n\nNumber of games of ROCK PAPER SCISSORS: " + noRounds);
    			System.out.println("Number of times Computer won: " + comp);
    			System.out.println("Number of times " + name + " won: " + user);
    			System.out.println("Number of draws: " + draw);
    			winner(draw,user,comp,name);
    		}
    		round = round + 1; //makes sure the while loop isn't endless
    	}
    }
    
    public static String getName(Scanner keyboard, String promptNoSpace) {	//ensures no space
    	System.out.print(promptNoSpace + " ");
		return keyboard.nextLine();
	}
    
    public static String introduction(Scanner keyboard) {	
    	System.out.println("Welcome to ROCK PAPER SCISSORS. I, Computer, will be your opponent.");
    	//next line is for user input
    	String name = getName(keyboard, "Please type in your name and press return:"); 
    	System.out.println();
    	System.out.println("Welcome " + name + ".");
    	System.out.println();
    	return name; //so that we can store it for later
	}
	
    public static int getNextValue(Scanner keyboard, String promptNoSpace) { //ensures no space
		System.out.print(promptNoSpace + " ");
		return keyboard.nextInt();
	}
    
    public static int howManyRounds(Scanner keyboard, String name) {
		System.out.println("All right " + name + ". How many rounds would you like to play?");
		//next line asks for user input for how many rounds
    	int noRounds = getNextValue(keyboard, "Enter the number of rounds you want to "	
    												+ "play and press return:");
    	return noRounds; //store for later
    }
    
    public static int userChoices (Scanner keyboard, String name, int noRounds) {
    	int userChoiceNo = getNextValue(keyboard, "1 for ROCK, 2 for PAPER, and 3 for SCISSORS:");
    	return userChoiceNo; //to store for later use
    }
    
    public static String userChoiceToWord (int userChoice) {
    	String userChoiceToWord = "";//initialize string
    	//to change the integer to their respective string
    	// where ROCK,PAPER, SCISSORS is a public static final int
    	if(userChoice == ROCK) { 
    		userChoiceToWord = "ROCK";
        } else if (userChoice == PAPER) {
        		userChoiceToWord = "PAPER";
       	} else if (userChoice == SCISSORS) {
        	userChoiceToWord = "SCISSORS";
        } 
    	return userChoiceToWord;//store for later use
    }
    	
    public static int computerChoices (int noRounds, RandomPlayer computerPlayer) {
    	int computerChoiceNo = computerPlayer.getComputerChoice();
    	return computerChoiceNo;//store for later use
    }
    	
    public static String computerChoiceToWord (int computerChoice) {
    	String computerChoiceToWord = "";//initialize String
    	//to change the integer to their respective string
    	if(computerChoice == ROCK) { 
        	computerChoiceToWord = "ROCK";
        } else if (computerChoice == PAPER) {
        	computerChoiceToWord = "PAPER";
        } else if (computerChoice == SCISSORS) {
        	computerChoiceToWord = "SCISSORS";
        }
    	return computerChoiceToWord;//store for later
    }
      
    public static void reaction(int userChoice, int computerChoice) {	
    	//to print the result of each round
    	//most of them are different so they each need an else if statement
    	if ((userChoice == ROCK && computerChoice == ROCK)||
    			(userChoice == PAPER && computerChoice == PAPER)||
    			(userChoice == SCISSORS && computerChoice == SCISSORS)) {
			System.out.println("We picked the same thing! This round is a draw.");
		} else if (userChoice == PAPER && computerChoice == ROCK) {
			System.out.println("PAPER covers ROCK. You win.");
		} else if (userChoice == SCISSORS && computerChoice == ROCK) {
			System.out.println("ROCK breaks SCISSORS. I win.");
		} else if (userChoice == ROCK && computerChoice == PAPER) {
			System.out.println("PAPER covers ROCK. I win.");
		} else if (userChoice == SCISSORS && computerChoice == PAPER) {
			System.out.println("SCISSORS cut PAPER. You win.");
		} else if (userChoice == ROCK && computerChoice == SCISSORS) {
			System.out.println("ROCK breaks SCISSORS. You win.");
		} else if (userChoice == PAPER && computerChoice == SCISSORS) {
			System.out.println("SCISSORS cut PAPER. I win.");
		}
	}
    
    
    public static void winner(int draw, int user, int comp, String name) {
    	//to print who is the winner
    	//if statement makes sure that the largest integer coincides with who won
    	if ((draw > user) && (draw > comp)) {
    		System.out.println("We are evenly matched.");
    	} else if ((user > comp) && (user > draw)) {
    		System.out.println("You, " + name + ", are a master at ROCK, PAPER, SCISSORS.");
    	} else if ((comp > user) && (comp > draw)) {
    		System.out.println("I, Computer, am a master at ROCK, PAPER, SCISSORS.");
    	} 
    }
    
    /*
     * Build the random player. If args is length 0 then the
     * default RandomPlayer is built that follows a predictable
     * sequence. If args.length > 0 then we assume we can
     * convert the first element to an int and build the
     * RandomPlayer with that initial value.
     */
    public static RandomPlayer buildRandomPlayer(String[] args) {
        if(args.length == 0) {
            return new RandomPlayer();
        } else {
            int seed = Integer.parseInt(args[0]);
            return new RandomPlayer(seed);
        }
    }
}
