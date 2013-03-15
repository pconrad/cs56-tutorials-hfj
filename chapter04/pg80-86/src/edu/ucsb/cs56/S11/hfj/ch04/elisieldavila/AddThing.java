package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 85_2

/**
 * AddThing Class to show that local variables
    are declared within a method
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

class AddThing{
    int a;       //Not initialized
    int b=12;    //Initialized
    
    public int add(){
	int total = a + b;  //Result should be 12 since "a" is not initialized
	return total;
    }
}
