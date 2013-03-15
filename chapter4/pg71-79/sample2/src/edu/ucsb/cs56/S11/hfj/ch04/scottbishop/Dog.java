package edu.ucsb.cs56.S11.hfj.ch04.scottbishop;

/**
   A dog that Barks with different noises based on the size of the dog and tells   it how many times to bark.
   
   @author Scott Bishop and Leif Dreizler
   @version cs56, Choice Pts 0000209, Spring 2011
*/

public class Dog{
    private int size;
    private String name;
    
    /**
       get the name
       @return name
    */
    public String getName(){
	return name;
    }
    
    /**
       set the name
       @param r the new name
    */
    public void setName(String newName){
	name = newName;
    }
    
    /**
       get the size
       @return size
    */
    public int getSize(){
	return size;
    }
    
    /**
       set the Size
       @param r the new size
    */
    public void setSize(int newSize){
	size = newSize;
    }
    
    /**
     * Function Bark makes different bark sounds based on the size of the dog
     * @param numOfBarks is the number of times you want the dog to bark
     */
    
    public void bark(int numOfBarks) {
	if (size > 60 && numOfBarks > 0){
	    System.out.println("Wooof! Wooof!");
	    numOfBarks = numOfBarks - 1;
	    bark(numOfBarks);
	}
	else if (size > 14 && numOfBarks > 0){
	    System.out.println("Ruff! Ruff!");
	    numOfBarks = numOfBarks - 1;
	    bark(numOfBarks);
	}
	
	else if (numOfBarks > 0){
	    System.out.println("Yip! Yip!");
	    numOfBarks = numOfBarks - 1;
	    bark(numOfBarks);
	}
    }
}