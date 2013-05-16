package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   Test Drive file that gives sample output to show that the Dog class 
   is implemented properly
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
   @see Dog
*/

public class DogDrive
{
    public static void main(String [] args) 
    {
		Dog one = new Dog();
		one.setSize(70);
		Dog two = new Dog();
		two.setSize(8);
		Dog three = new Dog();
		three.setSize(35);

		System.out.println("Dog 1's Size is " + one.getSize() + 
			" and makes the sound: ");
		one.bark(3);
		
		System.out.println("Dog 2's Size is " + two.getSize() + 
			" and makes the sound: ");
		two.bark(2);
		
		System.out.println("Dog 3's Size is " + three.getSize() + 
			" and makes the sound: ");
		three.bark(1);
    }
}
