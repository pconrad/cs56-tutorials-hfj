import java.util.Scanner; //to read user input

/* 
Name: Kevin Wang
Quarter: W11
Class: CS56
Mantis ticket: 0000138
*/

/**
 *  A class that demonstrates using Math static methods in a random and comparing numbers program 
 *
 */

public class Numbers {

    /**
       Runs and calls the math static methods and allows user to continue or end the program
     */
    public static void main(String[] args) throws NumberFormatException{
	double d = 0; // user input number
	double e = 0; // random number
      	double temp = 0; // temporary number

	String input = "";
	String answer = "";

	boolean loop = true; //set inital loop 
	boolean askAgain = true; //set ask user again loop

	Scanner keyboard = new Scanner(System.in);

	while (loop == true){
	
	System.out.println("Enter a positive or negative number:");
	input = keyboard.nextLine(); //reads user input
	d = Double.parseDouble(input); //converts string to double

	System.out.println("Set the maximum number of a random number:");
	input = keyboard.nextLine(); //reads user input
	temp = Double.parseDouble(input); //converts string to double
	e = (int) (Math.random()*temp); //demonstrating a cast to make random number from double to integer
	
	    System.out.println("Random generated number between 1.0 and " + temp + " is " + e);

	    temp = Math.min(d,e); //Calls static math minimum method
	    System.out.println("The minimumm of the random number and your number is " + temp);

	    temp = Math.max(d,e); //Calls static math maximum method
	    System.out.println("The maximum of the random number and your number is " + temp);

	    temp = Math.abs(d); //Calls static math absolute value method
	    System.out.println("The absolute value of your number is " + temp);

	    temp =Math.round(d); //Calls static math round value method
	    System.out.println("Your number rounded off is " + temp);
	     
	    do{
		System.out.println("Try another number? (yes,no)");
		input = keyboard.nextLine();
		if (input.equals("yes")){
		    askAgain = false;
		}
		else if (input.equals("no")) {
		    loop = false;
		    askAgain = false;
		}
		else{
		    System.out.println("Input 'yes' or 'no' ");
		    askAgain = true;
		}
	      } while (askAgain==true);
	}
    }

}