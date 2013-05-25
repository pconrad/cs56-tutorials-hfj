package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   Test Drive file that gives sample output to show that the Life 
	class is implemented properly
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
   @see Life
*/

public class LifeDrive {
    public static void main (String [] args) {
	
	Life t = new Life();
	t.go(t);
	int x =7;
	Life a = new Life();
	System.out.println("x has a value of: " + x + " which is passed to z (copied)");
	a.go(x);
	System.out.println("The value of x is still: " + x 
		+ " because java is pass-by-value and that means pass-by-copy");
    }
}
