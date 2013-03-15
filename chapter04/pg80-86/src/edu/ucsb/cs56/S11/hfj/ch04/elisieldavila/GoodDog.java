package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 82_1

/**
 * A GoodDog with size and bark
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */


class GoodDog{
    private int size;    //instance variable named size of type int
    
    public int getSize()    //a getter to get the size of our GoodDog
    {
	return size;
    }
    
    public void setSize(int s)  //a setter to set the size of our GoodDog
    {
	size=s;
    }
    
    void bark()            //a function to display our GoodDog's bark depending on it's size
    {
	if (size > 60)
	    {
		System.out.println("Wooof! Wooof!");
	    } 
	else if (size > 14)
	    {
		System.out.println("Ruff!  Ruff!");
	    } 
	else 
	    {
		System.out.println("Yip! Yip!");
	    }
    }
}
