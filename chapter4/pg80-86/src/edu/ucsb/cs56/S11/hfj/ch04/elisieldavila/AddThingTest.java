package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 85 (just to test)

/**
 * Main class for AddThing. It only test's and displays the ouput of add()
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

public class AddThingTest{
    public static void main(String[] args){
	AddThing one = new AddThing();
	int x = one.add();          // x should be 12 at this moment
	System.out.println(x);      // printing out x which is 12
    }
}
