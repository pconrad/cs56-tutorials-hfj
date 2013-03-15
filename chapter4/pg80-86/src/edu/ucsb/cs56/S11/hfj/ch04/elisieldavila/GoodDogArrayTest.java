package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 83

/**
 * Main for GoodDog class to test in an array form 
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

public class GoodDogArrayTest{
    
    public static void main (String[] args) {
	GoodDog one = new GoodDog();
	GoodDog[] pets;
	pets = new GoodDog[7];       //creates an array of 7 GoodDogs 
	pets[0] = new GoodDog();     
	pets[1] = new GoodDog();
	pets[0].setSize(30);         //sets the size our zero dog
	int x = pets[0].getSize();   //gets the size of our zero dog
	pets[1].setSize(8);          //sets the size of our second dog
	System.out.println("Dog zero (As an array): " + x);
	System.out.println("Dog one (As an array): " + pets[1].getSize());
	System.out.print("Dog zero's bark (As an array): "); pets[0].bark();
	System.out.print("Dog one's bark (As an array): "); pets[1].bark();
    }
}
