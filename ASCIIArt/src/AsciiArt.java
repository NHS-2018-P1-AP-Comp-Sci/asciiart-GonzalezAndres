/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class AsciiArt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cap();
		head();
		topArm();
		lowerArm();
		water();
		System.out.println("\t\t\t\t                A swimmer! Kind of...");
	}
	/*I added a lot of spaces to center the image, 
	  I know it looks weird in the code */
	public static void cap() {
		System.out.println("                                                    /=======\\");
		System.out.println("                                                   /=========\\");
	}
	public static void head() {
		System.out.println("                                                   \\  *   *  /");
		System.out.println("                                                    \\   _   /  ");
	}
	public static void topArm() {
		System.out.println("                                       ___===____/   /      \\   \\____===___ ");
	}
	public static void lowerArm() {
		System.out.println("                                    /   __===_____\\_____|______/______===___  \\");
		System.out.println("                                   /   /          /            \\            \\  \\");
	}
	public static void water() {
		System.out.println("                            0^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^0");
	}
	/*There wasn't a lot of repetition in the code 
	  so I seperated it into groups to make it 
	  easier to see and read */
}
