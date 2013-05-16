package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   A class Life that shows that java is pass-by-value which means pass-by-copy.
   Adds two numbers stores in total and changes one then prints out values
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
*/

public class Life {
    private int theSecret = giveSecret();
    
     /**
     * Function that automatically stores 42 as the given secret
     */
    public int giveSecret() 
    {
		return 42;
    }
    
    /**
     * Function go that creates two local variables and passes them by copy to
     * @param an object of type Life
     */
    public void go(Life d) 
    {
		int foo = 7;
		int bar = 3;
		d.takeTwo(foo, bar);
    }
    
    /**
     * Function go that prints what z is, changes z, and then prints out z again
     * @param a number of type int
     */
    public void go(int z) 
    {
		System.out.println("The value of z is: " + z);
		z=0;
		System.out.println("The value of z is now: " + z);
    }

	/**
	* Function takeTwo that takes 2 input values stores it in z and then prints the total
	* @param a number of type int
	* @param a 2nd number of type int
	*/

    public void takeTwo(int x, int y)
    {
		int z = x + y;
		System.out.println("Total is " + z);
    }
}

