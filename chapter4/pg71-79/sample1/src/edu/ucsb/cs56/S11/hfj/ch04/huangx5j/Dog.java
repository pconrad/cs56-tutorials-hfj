package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;

/**
 * Dog with name, size, and bark
 * @author Joseph Huang
 * @version hfj04 for CS56, S11
 */

public class Dog {
    private int size;
    private String name;

    /**
     * Constructor for Dog
     */
    public Dog() {}

    /**
     * For objects of class Dog
     * @param theName 
     * @param theSize 
     */
    public Dog(String theName, int theSize){
	name = theName;
	size = theSize;
    }

    /**
     * Returns the name of the Dog
     * @return name the name of the dog
     */
    public String getName(){
	return name;
    }

    /**
     * Returns the size of the Dog
     * @return size 
     */
    public int getSize(){
	return size;
    }

    /**
     * Sets the name of the Dog
     * @param theName 
     */
    public void setName(String theName){
	name = theName;
    }

    /**
     * Sets the size of the Dog
     * @param theSize
     */    
    public void setSize(int theSize){
	size = theSize;
    }

    /**
     * Dog barks depending on size
     */
    public void bark() {
	if (size > 60) {
	    System.out.println("Wooof! Wooof!");
	} else if (size > 14) {
	    System.out.println("Ruff! Ruff!");
	} else {
	    System.out.println("Yip! Yip!");
	}
    }

    /**
     * Different number of barks
     * @param numOfBarks 
     */
    public void bark(int numOfBarks) {
	while (numOfBarks > 0) {
	    System.out.println("ruff");
	    numOfBarks--;
	}
    }
    
}