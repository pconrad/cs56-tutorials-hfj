package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   *A dog that Barks with different noises based on the size of the dog and tells 
   * it how many times to bark.
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
*/

public class Dog
{
    private int size; // size of the dog
    private String name; // name of the dog
    
    /**
       get the name of the dog
       @return name of the dog
    */
    public String getName()
    {
		return name;
    }
    
    /**
       set the name of the dog
       @param newName the new name for the dog
    */
    public void setName(String newName)
    {
		name = newName;
    }
    
    /**
       get the size of the dog
       @return size of the dog
    */
    public int getSize()
    {
		return size;
    }
    
    /**
       set the Size
       @param newSize the new size for the dog
    */
    public void setSize(int newSize)
    {
		size = newSize;
    }
    
    /**
     * Function Bark makes different bark sounds based on the size of the dog
     * @param numOfBarks is the number of times you want the dog to bark
     */
    
    public void bark(int numOfBarks) 
    {
		if (size > 60 && numOfBarks > 0)
		{
			System.out.println("Wooof! Wooof!");
			numOfBarks = numOfBarks - 1;
			bark(numOfBarks);
		}
		else if (size > 14 && numOfBarks > 0)
		{
			System.out.println("Ruff! Ruff!");
			numOfBarks = numOfBarks - 1;
			bark(numOfBarks);
		}
	
		else if (numOfBarks > 0)
		{
			System.out.println("Yip! Yip!");
			numOfBarks = numOfBarks - 1;
			bark(numOfBarks);
		}
    }
}
