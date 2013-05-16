package edu.ucsb.cs56.projects.tutorials.hfj;

/**
  Test Drive file to see if ElectricGuitar is implemented correctly and shown using trial output
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
   @see ElectricGuitar
*/

public class ElectricGuitarDrive
{
    public static void main (String [] args) 
    {
		ElectricGuitar guitar = new ElectricGuitar();
		guitar.setBrand("Yamaha");
		guitar.setNumOfPickups(7);
		guitar.setRockStarUsesIt(false);
	
		System.out.println("Brand: " + guitar.getBrand());
		System.out.println("Number of Pickups: " + guitar.getNumOfPickups());
		System.out.println("Rockstar uses one: " + guitar.getRockStarUsesIt());
    }
}
