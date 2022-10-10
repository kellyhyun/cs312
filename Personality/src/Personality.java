/**
 * CS312 Assignment 8.
 * 
 * On my honor, Soomin Hyun, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to read a file with raw data from a Keirsey personality test
 * and print out the results.
 *
 *   email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 *  Number of slip days used on this assignment: 0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Personality {
    
    // CS312 Student: Add your constants here.
	public static final int PERCENTAGE_CONVERTER = 100;
	public static final int DETERMINING_NUMBER = 50;
	public static final int SPACES_FOR_NAME = 30;
	public static final int SPACES_BETWEEN_PERCENTS = 11;
	
    // The main method to process the data from the personality tests
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // do not make any other Scanners connected to System.in
        Scanner fileScanner = getFileScanner(keyboard);
        
        // CS312 Student: Your code and methods calls go here.
        eachLine(fileScanner); //this method calls other methods
        
        fileScanner.close();
        keyboard.close();
    }

    
    // CS312 Student: Add your methods here.
    
    //Method to print out all of the lines except for when asking user input
    public static void eachLine(Scanner fileScanner) {
    	final int noElements = 4; //number of dimensions/things to determine one's personality
    	fileScanner.nextLine();//skip the first line that has the no. of records
    	while (fileScanner.hasNextLine()) {	
    	//loop continues till there are no more lines to analyze
    		String name = fileScanner.nextLine(); //save name to use later
    		String answer = fileScanner.nextLine(); //save answer as string to use later
    		answer = answer.toUpperCase(); //to make sure all answers lowercase and uppercase can
    									   //be taken
    		namePercentType(answer, name, noElements);	//method that combines name, percent, and 
    													//type into one method
    	}
    }
    
    //Method to print out and analyze name, percent, and determine personality by using what is 
    //coded in the method, and by calling other methods
    public static void namePercentType(String answer,String name, int noElements) {
    	final int numberGrouping = 7; //number to indicate when questions rotate
    	final int extroIntro = 1; //these 4 numbers are to indicate when the questions about 
    	final int senseIntui = 2; //their respective characteristics start in relation to 
    	final int thinkFeel = 4;  //the rotation of questions
    	final int judgePerceive = 6;
    	int[] noBCounter = new int[4];		//initializing arrays
    	int[] noAnsCounter = new int [4];
    	for (int everyAnswer = 1; everyAnswer <= answer.length(); everyAnswer++) { 
    	//to loop for all answers in the answer string
    		char singleAnswer = answer.charAt(everyAnswer-1); 
						//(-1) necessary because arrays start at 0
    					//single answer character needed to be analyzed later
        	for (int element = 0; element < noElements; element++) { 
        	//loops through all elements of the array
        		if ((element == 0) && (everyAnswer%numberGrouping == extroIntro)) {
        			//only changes the array for the socializing section 
        			addingToCounter(element, singleAnswer, noBCounter,noAnsCounter);
        		}
        		if ((element == 1) && ((everyAnswer%numberGrouping == senseIntui)||
        					(everyAnswer%numberGrouping == senseIntui+1))) {
        					//repeating pattern has two answers in a row relating to this topic
        			//only changes the array for the sensing/intuition section 
        			addingToCounter(element, singleAnswer, noBCounter,noAnsCounter);
        		}
        		if ((element == 2) && ((everyAnswer%numberGrouping == thinkFeel)||
						(everyAnswer%numberGrouping == thinkFeel+1))) {
    						//repeating pattern has two answers in a row relating to this topic
        			//only changes the array for the thinking/feeling section 
        			addingToCounter(element, singleAnswer, noBCounter,noAnsCounter);
        		}
        		if ((element == 3) && ((everyAnswer%numberGrouping == judgePerceive)||
						(everyAnswer%numberGrouping == (judgePerceive+1)%numberGrouping))) {
    						//repeating pattern has two answers in a row relating to this topic
        					//also there is ((judgePerceive+1)%numberGrouping) because we need 
        					//for every 7th answer to be connected to this section
        			//only changes the array for the judging/perceiving section 
        			addingToCounter(element, singleAnswer, noBCounter,noAnsCounter);
        		}
        	}
    	}
    	int[] percents = percentages (noBCounter,noAnsCounter,noElements); 
    	//new array created with the percents to use in the next method
    	printEachLine(name, percents, noElements, noAnsCounter); //prints each line
    }
    
    //this method adds to the previously created arrays noBCounter and noAnsCounter according to 
    //the specifications shown below
    public static void addingToCounter(int element, char singleAnswer, int[] noBCounter,
    															int[] noAnsCounter) {
    	if (singleAnswer == 'B') { //so that we only add more to the B counter if the answer is B
    		noBCounter[element]++;
    		noAnsCounter[element]++; //because we need to count all valid answers
		} else if(singleAnswer == 'A') { //also to count all valid answers
			noAnsCounter[element]++;
		}
    }
    
    //to create the array for the percentages
    public static int[] percentages (int[] noBCounter, int[] noAnsCounter, int noElements) {
    	int[] percent = new int [4];//initialize array
    	for (int element = 0; element < noElements; element++) { //to get all 4 parts of the array
    		if (!(noAnsCounter[element] == 0)) {//so that code doesn't mess up by dividing by zero
    			double percentage = (double)(noBCounter[element])/(double)(noAnsCounter[element])
    																		*PERCENTAGE_CONVERTER;
        		percent[element] = (int)(percentage + .5);//changing the element of the array
    		} else {
    			percent[element] = 0;//in case there were no answers for that type
    		}
    	}
    	return percent;
    }
    
    //method to find the first letter of the personality
    //I needed separate ones because the combination of letters are different for all 4
    //so I needed to return 4 different strings each time
    public static String determineFirstLetter(int[] percents, int noElements, int[] noAnsCounter) {
    	String first = ""; //initialize string
    	for (int element = 0; element < noElements; element++) {
    		if (element == 0) { //this is so that we only change the first element
    			if (percents[element] > DETERMINING_NUMBER) {
    				first = "I"; //for introvert
    			} else if ((percents[element] < DETERMINING_NUMBER)) {
    				first = "E"; //for extrovert
    			} 
    			first = commonLetter (element, first, percents, noAnsCounter);
    			//calling method that changes letter to something that is in common with the other
    			//three dimensions. Either X or -.
    		}
    	}
    	return first;
    }
    
    //method to find the second letter of the personality
    //much of the comments would be similar to the first letter method, but we needed another one
    //so that we could return different letters according to what is needed.
    public static String determineSecondLetter(int[] percents, int noElements, int[] noAnsCounter) {
    	String second = "";
    	for (int element = 0; element < noElements; element++) {
    		if (element == 1) {
    			if (percents[element] > DETERMINING_NUMBER) {
    				second = "N";//for intuition
    			} else if ((percents[element] < DETERMINING_NUMBER)) {
    				second = "S";//for sensing
    			}
    			second = commonLetter (element, second, percents, noAnsCounter);
    		} 
    	}
    	return second;
    }
    
    //method to find the third letter of the personality
    //much of the comments would be similar to the first letter method, but we needed another one
    //so that we could return different letters according to what is needed.
    public static String determineThirdLetter(int[] percents, int noElements, int[] noAnsCounter) {
    	String third = "";
    	for (int element = 0; element < noElements; element++) {
    		if (element == 2) {
    			if (percents[element] > DETERMINING_NUMBER) {
    				third = "F";//for feeling
    			} else if ((percents[element] < DETERMINING_NUMBER)) {
    				third = "T";//for thinking
    			} 
    			third = commonLetter (element, third, percents, noAnsCounter);
    		}
    	}
    	return third;
    }
    
    //method to find the fourth letter of the personality
    //much of the comments would be similar to the first letter method, but we needed another one
    //so that we could return different letters according to what is needed.
    public static String determineFourthLetter(int[] percents, int noElements, int[] noAnsCounter) {
    	String fourth = "";
    	for (int element = 0; element < noElements; element++) {
    		if (element == 3) {
    			if (percents[element] > DETERMINING_NUMBER) {
    				fourth = "P";//for Perceiving 
    			} else if ((percents[element] < DETERMINING_NUMBER)) {
    				fourth = "J";//for judging
    			} 
    			fourth = commonLetter (element, fourth, percents, noAnsCounter);
    		}
    	}
    	return fourth;
   	}
    
    //method that accounts for if the answers don't determine their type because it is 50% 
    //of both, and it accounts for if there were no answers.
    public static String commonLetter (int element, String number, int[] percents,
    																int[] noAnsCounter) {
    	if (percents[element] == DETERMINING_NUMBER){// answers doesn't determine type
			number = "X";
		} else if ((percents[element] == 0)&&(noAnsCounter[element] == 0)){//no  answers
			number = "-";
		}	
    	return number;
    }
    
    //method to print each line (name, percents, type)
    public static void printEachLine (String name, int[] percents, int noElements, 
    																int[] noAnsCounter) {
    	if (name.length()<SPACES_FOR_NAME) {
    		System.out.printf("%"+SPACES_FOR_NAME+"s:",name);
    	} else {
    		System.out.printf("%s:",name);
    	} 	//if else: to make sure that if a name contains more than 30 characters, 
    		//shift the output to the left
    	for (int element = 0; element < noElements; element++) {//to do for each dimension
    		if (!(noAnsCounter[element]==0)) { //if there were answers, this will print
    			System.out.printf("%"+SPACES_BETWEEN_PERCENTS+"d", percents[element]);
    		} else { //if there were no answers, this will print
    			System.out.printf("%"+SPACES_BETWEEN_PERCENTS+"s", "NO ANSWERS");
    		}
    	}
    	//assigning letters to variables so we can print with them in one line 
    	String first = determineFirstLetter(percents, noElements, noAnsCounter);
    	String second = determineSecondLetter(percents, noElements, noAnsCounter);
    	String third = determineThirdLetter(percents, noElements, noAnsCounter);
    	String fourth = determineFourthLetter(percents, noElements, noAnsCounter);
    	System.out.printf(" = %s%s%s%s\n",first, second, third, fourth);//printing the personality
    }
    
    // Method to choose a file.
    // Asks user for name of file. 
    // If file not found creates a Scanner hooked up to a dummy set of data.
    // Example use: 
    public static Scanner getFileScanner(Scanner keyboard) {
        Scanner result = null;
        try {
            System.out.print("Enter the name of the file with the personality data: ");
            String fileName = keyboard.nextLine().trim();
            System.out.println();
            result = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("Problem creating Scanner: " + e);
            System.out.println("Creating Scanner hooked up to default data " + e);
            String defaultData = "1\nDEFAULT DATA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            result = new Scanner(defaultData);
        }
        return result;
    }
}
