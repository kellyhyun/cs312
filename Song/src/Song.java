/*
 * CS312 Assignment 1.
 * On my honor, <Soomin Hyun>, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Soomin Hyun
 *  email address: kellyhyun@utexas.edu
 *  UTEID: sh52679
 *  Section 5 digit ID: 52215
 *  Grader name: Kiana Fithian
 */ 

public class Song {
	
	
    // print out the lyrics of "There was an old woman ... "
    public static void main(String[] args) {
    	para1();
    	para2();
    	para3();
    	para4();
    	para5();
    	para6();
    	para7();
    	para8();
    }
    	/* The fly method prints out the lines  	
    	 * "I don't know why she swallowed that fly,
    	 * Perhaps she'll die."
    	 * These are the last two lines of all paragraphs  except for the last. 
    	 * This method will not print out the first line of the song. 
    	 */
    	public static void fly() {
    		System.out.println("I don't know why she swallowed that fly,");
    		System.out.println("Perhaps she'll die.");
    	}
    	
    	/* The spiderAndFly method adds one of the new lines of the 2nd paragraph. 
    	 * It is not the full 2nd paragraph. 
    	 * It prints the last 3 lines of the 2nd paragraph. 
    	 */
    	public static void spiderAndMore() {
    		System.out.println("She swallowed the spider to catch the fly,");
    		fly();
    	}
    	
    	/* The birdAndMore method adds one of the new lines of the 3rd paragraph. 
    	 * It is not the full 3rd paragraph.
    	 * It prints the last 4 lines of the 3rd paragraph.
    	 */
    	public static void birdAndMore() {
    		System.out.println("She swallowed the bird to catch the spider,");
    		spiderAndMore();
    	}

    	/* The catAndMore method adds one of the new lines of the 4th paragraph. 
         * It is not the full 4th paragraph.
         * It prints the last 5 lines of the 4th paragraph.
         */
        public static void catAndMore() {
        	System.out.println("She swallowed the cat to catch the bird,");
        	birdAndMore();
        }
        
    	/* The dogAndMore method adds one of the new lines of the 5th paragraph. 
         * It is not the full 5th paragraph.
         * It prints the last 6 lines of the 5th paragraph.
         */
        public static void dogAndMore() {
        	System.out.println("She swallowed the dog to catch the cat,");
        	catAndMore();
        }
        
    	/* The goatAndMore method adds one of the new lines of the 6th paragraph. 
         * It is not the full 6th paragraph.
         * It prints the last 7 lines of the 6th paragraph.
         */
        public static void goatAndMore() {
        	System.out.println("She swallowed the goat to catch the dog,");
        	dogAndMore();
        }
      
    	/* The cowAndMore method adds one of the new lines of the 7th paragraph. 
         * It is not the full 7th paragraph.
         * It prints the last 8 lines of the 7th paragraph.
         */
        public static void cowAndMore() {
        	System.out.println("She swallowed the cow to catch the goat,");
        	goatAndMore();
        }
        
    	/* The para1 method prints the first paragraph.
         * It prints all 3 lines of the first paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para1() {
        	System.out.println("There was an old woman who swallowed a fly.");
        	fly();
        	System.out.println();
        }
        
    	/* The para2 method prints the second paragraph.
         * It prints all 5 lines of the second paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para2() {
        	System.out.println("There was an old woman who swallowed a spider,");
        	System.out.println("That wriggled and iggled and jiggled inside her.");
        	spiderAndMore();
        	System.out.println();
        }
        
    	/* The para3 method prints the third paragraph.
         * It prints all 6 lines of the third paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para3() {
        	System.out.println("There was an old woman who swallowed a bird,");
        	System.out.println("How absurd to swallow a bird.");
        	birdAndMore();
        	System.out.println();
        }
        
        /* The para4 method prints the 4th paragraph.
         * It prints all 7 lines of the 4th paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para4() {
        	System.out.println("There was an old woman who swallowed a cat,");
        	System.out.println("Imagine that to swallow a cat.");
        	catAndMore();
        	System.out.println();
        }
        
        /* The para5 method prints the 5th paragraph.
         * It prints all 8 lines of the 5th paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para5() {
        	System.out.println("There was an old woman who swallowed a dog,");
        	System.out.println("What a hog to swallow a dog.");
        	dogAndMore();
        	System.out.println();
        }
        
        /* The para6 method prints the 6th paragraph.
         * It prints all 9 lines of the 6th paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para6() {
        	System.out.println("There was an old woman who swallowed a goat,");
        	System.out.println("She just opened her throat to swallow a goat.");
        	goatAndMore();
        	System.out.println();
        }
        
        /* The para7 method prints the 7th paragraph.
         * It prints all 10 lines of the 7th paragraph.
         * It also prints the extra line space for the empty space at the end.
         */
        public static void para7() {
        	System.out.println("There was an old woman who swallowed a cow,");
        	System.out.println("I don't know how she swallowed a cow.");
        	cowAndMore();
        	System.out.println();
        }
        
        /* The para8 method prints the 8th paragraph.
         * It prints both lines of the 8th paragraph.
         * It also prints the extra line space for the empty space at the end.
         * There is no other method within this method.
         */
        public static void para8() {
        	System.out.println("There was an old woman who swallowed a horse,");
        	System.out.println("She died of course.");
        }
}
