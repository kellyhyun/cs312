import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * CS312 Assignment 7.
 * 
 * On my honor, Soomin Hyun, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to play determine the extend of home field advantage in sports.
 *
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 *  Number of slip days used on this assignment: 2
 */
 
 /**
 * Analysis of results. Include your write-up of results and analysis here:
 * I ran the code once and analyzed all of files in one run:
 * 
A program to analyze home field advantage in sports.

Enter the file name: cfb05.txt

**********   College Football --- 2005   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,069
Number of games with a home team: 3,955
Percentage of games with a home team: 97.2%
Number of games the home team won: 2,257
Home team win percentage: 57.1%
Home team average margin: 4.24

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: cfb08.txt

**********   College Football --- 2008   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,702
Number of games with a home team: 4,592
Percentage of games with a home team: 97.7%
Number of games the home team won: 2,617
Home team win percentage: 57.0%
Home team average margin: 4.28

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: mbb12_r.txt

**********   NCAA Men's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,842
Number of games with a home team: 14,481
Percentage of games with a home team: 91.4%
Number of games the home team won: 9,178
Home team win percentage: 63.4%
Home team average margin: 5.37

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: mbb12.txt

**********   NCAA Men's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,842
Number of games with a home team: 14,481
Percentage of games with a home team: 91.4%
Number of games the home team won: 9,178
Home team win percentage: 63.4%
Home team average margin: 5.37

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: mbb14.txt

**********   NCAA Men's Basketball --- 2013 - 2014   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 16,219
Number of games with a home team: 14,754
Percentage of games with a home team: 91.0%
Number of games the home team won: 9,276
Home team win percentage: 62.9%
Home team average margin: 5.18

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: mlb12.txt

**********   Major League Baseball --- 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 2,467
Number of games with a home team: 2,465
Percentage of games with a home team: 99.9%
Number of games the home team won: 1,312
Home team win percentage: 53.2%
Home team average margin: 0.16

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: mscc06.txt

**********   College Men's Soccer --- 2006   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 8,380
Number of games with a home team: 7,373
Percentage of games with a home team: 88.0%
Number of games the home team won: 3,962
Home team win percentage: 53.7%
Home team average margin: 0.51

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb00.txt

**********   NCAA Women's Basketball --- 1999 - 2000   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,607
Number of games with a home team: 4,345
Percentage of games with a home team: 94.3%
Number of games the home team won: 2,696
Home team win percentage: 62.0%
Home team average margin: 5.60

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb05.txt

**********   NCAA Women's Basketball --- 2004 - 2005   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 14,687
Number of games with a home team: 13,261
Percentage of games with a home team: 90.3%
Number of games the home team won: 8,043
Home team win percentage: 60.7%
Home team average margin: 4.95

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb08s.txt

**********   NCAA Women's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 14
Number of games with a home team: 9
Percentage of games with a home team: 64.3%
Number of games the home team won: 6
Home team win percentage: 66.7%
Home team average margin: 6.00

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb12.txt

**********   NCAA Women's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,640
Number of games with a home team: 14,303
Percentage of games with a home team: 91.5%
Number of games the home team won: 8,496
Home team win percentage: 59.4%
Home team average margin: 4.41

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb13.txt

**********   NCAA Women's Basketball --- 2012 - 2013   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,722
Number of games with a home team: 14,341
Percentage of games with a home team: 91.2%
Number of games the home team won: 8,512
Home team win percentage: 59.4%
Home team average margin: 4.23

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wbb14.txt

**********   NCAA Women's Basketball --- 2013 - 2014   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,790
Number of games with a home team: 14,305
Percentage of games with a home team: 90.6%
Number of games the home team won: 8,471
Home team win percentage: 59.2%
Home team average margin: 4.24

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: y

Enter the file name: wscc10.txt

**********   NCAA Women's Soccer --- 2010   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 10,593
Number of games with a home team: 9,941
Percentage of games with a home team: 93.8%
Number of games the home team won: 5,392
Home team win percentage: 54.2%
Home team average margin: 0.51

Do you want to check another data set?
Enter Y or y to analyze another file, anything else to quit: n

 * 
 * Analysis of Data:
 * I believe that there is an indication that a home field advantage exists because the home team 
 * win percentages are all higher than 50% with all of our data files. This is pretty significant
 * because we cannot say that home team win percentage being above 50% is just a coincidence. 
 * However, the average margins are at the lowest, less than 1 point, and at most, 6 points. This
 * shows that even though the home team is likely to win, it is not a guarantee and they often
 * win with small margins. The analysis that there is a home field advantage is more applicable
 * to the sports basketball (women's and men's) and college football. We can see by the data
 * that soccer and baseball are not affected by the home field advantage as much. Even though the 
 * percentage of home teams winning is still above 50%, it is in its lower 50s whereas basketball 
 * and football have percentages of the high 50s, and upwards into the 60s. Additionally, the team 
 * average margins for soccer and baseball are a lot smaller, coming down to 0.16 for one of the 
 * seasons.
 *
 */
 
public class HomeField {
	public static final int PERCENTAGE_CONVERTER = 100;
    // Ask the user for the name of a data file and process
    // it until they want to quit.
    public static void main(String[] args) throws IOException {
        System.out.println("A program to analyze home field advantage in sports.");
        System.out.println();
        // CS312 students. Do not create any other Scanners connected to System.in.
        // Pass keyboard as a parameter to all the methods that need it. 
        Scanner keyboard = new Scanner(System.in);

        // CS312 students - Add your code here;
        String userInput = whichFile(keyboard);	//order is important 1st: ask for file name
        File gameFile = new File(userInput);	//2nd: "create" the file within code 
        finalResult(keyboard, gameFile);		//3rd: analyze data and print
        repeatAsk(keyboard);					//4th: ask if user wants to continue processing
        										//		data, then proceed as such
        keyboard.close();
    }

    // CS312 Students - Add your methods here.
    
    //this method is wanting the name of the file the user wants to analyze
    public static String whichFile(Scanner keyboard) {	//ask user the name of the file 
    	System.out.print("Enter the file name: ");
    	String userInput = keyboard.nextLine();
    	return userInput;	//return string to create file later
    }
    
    //this method is making sure that we only print results when the file exists, if not,
    //asking for another file name
    public static void finalResult(Scanner keyboard, File gameFile) 
    									throws FileNotFoundException  {    	
    	int noGames = 0;		//initializing all of the variables
    	double teamAHome = 0;
    	double teamBHome = 0;
    	double homeGamesWon = 0;
    	double homeTeam = 0;
    	double awayTeam = 0;
    	boolean fileIs = false;	//Initializing boolean for the while loop
    	while (fileIs==false){
    		if (gameFile.exists()) {
    			fileIs = true;//loop will stop because boolean is now true
    			Scanner fileReader = new Scanner(gameFile);
    			heading(fileReader); //not only prints heading of game but also allows analysis
    								 //to start at the right lines
    			gameResults(fileReader, noGames, teamAHome, teamBHome, 
    												homeGamesWon, homeTeam, awayTeam);
    							//all of the analysis is in this method
    			fileReader.close();
    		} else {
    			fileIs = false;//boolean will continue looping and asking for file that exists
    			System.out.println("Sorry, that file does not exist");
    			String userInput = whichFile(keyboard);//asking for file name again
        		gameFile = new File(userInput);//replacing gameFile with new file 
    		}
    	}
	}
    
    //this method is printing the heading of the results and skipping the 2 lines not needed for 
    //the analysis
    public static void heading(Scanner fileReader) throws FileNotFoundException {
    	String gameType = fileReader.nextLine();	//stores the gametype and years for the heading
    	String years = fileReader.nextLine();		//and skips these lines for later analysis
    	System.out.printf("\n**********   %s --- %s   **********\n", gameType, years);
    	System.out.println("\nHOME FIELD ADVANTAGE RESULTS");
    }
    
    //this method ties in the analysis and printing of results
    public static void gameResults(Scanner fileReader,int noGames, 
    					double teamAHome, double teamBHome, double homeGamesWon, 
    					double homeTeam, double awayTeam) throws FileNotFoundException {
    	while (fileReader.hasNextLine()) {	// we continue as long as there is another line
    		noGames++; //each line represents a game in the file so we are adding one each time
    		String eachGame = fileReader.nextLine();	//so that we can put it in the scanner
    		Scanner lineScan = new Scanner(eachGame);	//new scanner for each line
    		lineScan.next();	// skipping the date on each line
    		String teamA = lineScan.next();	
    		if (teamA.startsWith("@")) {	//analyzing if teamA is the home team
    			teamAHome = teamAHome + 1;
    		}
    		int teamAScore = teamScore(lineScan);	//storing teamA score
    		String teamB = lineScan.next();
    		if (teamB.startsWith("@")) {	//analyzing if teamB is the home team
    			teamBHome++;
    		}
    		int teamBScore = teamScore(lineScan);	//storing teamB score
    		//adding to the number of home games won with the proper conditions
    		if ((teamA.startsWith("@") && teamAScore > teamBScore)||
    					(teamB.startsWith("@") && teamBScore > teamAScore)) {
    			homeGamesWon++;
    		} 
    		//team scores to the right category of home or away
    		if (teamA.startsWith("@")) {
    			homeTeam = homeTeam + teamAScore;
    			awayTeam = awayTeam + teamBScore;
    		} else if (teamB.startsWith("@")) {
    			homeTeam = homeTeam + teamBScore;
    			awayTeam = awayTeam + teamAScore;
    		}
    	lineScan.close();
    	}
    	printResults(teamAHome, teamBHome, homeGamesWon, noGames, homeTeam, awayTeam);
    }
    
    //this method skips the multi-word teams and returns the team scores
    public static int teamScore(Scanner lineScan) {//mostly made to reduce lines in other method
    	while(!lineScan.hasNextInt()) {
			lineScan.next();//skips the multiple words of the teams
		}
		return lineScan.nextInt();	//returning the team score (A or B)
    }
    
    //this method calculates the number of home games, the percentage of home games, the percentage
    //of home games won, and the margin difference. Then, it prints them out the the format that 
    //we are required to do.
    public static void printResults(double teamAHome, double teamBHome, double homeGamesWon, 
    											int noGames, double homeTeam, double awayTeam) {
    	double noHomeGames = teamAHome + teamBHome;
    	double percentageHome = noHomeGames/noGames*PERCENTAGE_CONVERTER;	
    	double percentageHomeWon = homeGamesWon/noHomeGames*PERCENTAGE_CONVERTER;	
    	double marginDifference = (homeTeam-awayTeam)/noHomeGames;	
    	//using the printf function is important here so that we can get commas for big numbers, 
    	//and shorten the doubles to which decimal that we specify
    	System.out.printf("\nTotal number of games: %,d", noGames);	
    	System.out.printf("\nNumber of games with a home team: %,.0f", noHomeGames);
    	System.out.printf("\nPercentage of games with a home team: %.1f%%", percentageHome);
    	System.out.printf("\nNumber of games the home team won: %,.0f", homeGamesWon);
    	System.out.printf("\nHome team win percentage: %.1f%%", percentageHomeWon);
    	System.out.printf("\nHome team average margin: %.2f\n", marginDifference);
    }
	
    //this method makes sure to repeatedly ask if the user would like to continue analyzing
    public static void repeatAsk(Scanner keyboard) throws FileNotFoundException {
    	String yesOrNo = again(keyboard);	//asking if we want to process again
    	String answer = yesOrNo.toLowerCase();	//changing the answer to be lowercase because 
    											//user might input a "Y"
    	while (answer.equals("y")) {
    		repeatingAnalysis(keyboard, yesOrNo, answer);	//this is where analysis repeats
    		yesOrNo = again(keyboard);	//this is where the asking repeats
        	answer = yesOrNo.toLowerCase();	//we are redefining the answer to be the new answer
    	}
    	while (!answer.equals("y")) {	//will execute user doesn't want to process again
    		System.out.println();	//for the extra space at the end of the output
    		answer = "y";//this is so that the loop will not happen again
    	}
    }
    
    //this is to make sure that the analysis will repeat when the user wants to continue
    public static void repeatingAnalysis (Scanner keyboard, String yesOrNo, String answer) 
    													throws FileNotFoundException {
    	if (answer.equals("y")) {
    		System.out.println();//extra space for between the y and the entering of new file name
    		String userInput = whichFile(keyboard);	//new user input of which file to analyze
    		File gameFile = new File(userInput);	//redefining gameFile to the new file
    		finalResult(keyboard,gameFile);	//this is the analysis part and the printing part
    	} 
    }
    
    //this method asks if the user wants to check another data set and returns that answer to use 
    //in the other methods
    public static String again(Scanner keyboard) {	//asking the user if they want to process 	
    												//another data set
    	System.out.print("\nDo you want to check another data set?\nEnter Y or y to "
    									+ "analyze another file, anything else to quit: ");
    	String another = keyboard.nextLine();
    	return another;
    }
}

