package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 82_2

/**
 * Main for GoodDog class to test in a non-array form 
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */


public class GoodDogTest{
    
    public static void main (String[] args) {
	GoodDog one = new GoodDog();    //creates a new GoodDog decalared as one
	one.setSize(70);                //sets the size of our one dog
	GoodDog two = new GoodDog();    //creates a new GoodDog decalared as two
	two.setSize(8);                 //sets the size of our two dog
	
	/*Everything else prints out the size of our dogs and shows their barks*/
	
	System.out.println("Dog one: " + one.getSize());     
	System.out.println("Dog two: " + two.getSize());
	System.out.print("Dog one's bark: "); one.bark();
	System.out.print("Dog two's bark: "); two.bark();
	
    }
}
