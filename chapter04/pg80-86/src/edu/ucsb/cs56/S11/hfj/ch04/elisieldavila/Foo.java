package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 85_3

/**
 * Foo Class to show that local variables 
   must be initialized before use.
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

class Foo{
    public void go(){
  /*    int x;
        int z=x+3;   This is wrong! It won't compile 
            ^---   because local variables must be 
                   initialized before use.
  */
	int x=2;
	int z=x+3;  //This is how it should be! z is 6;
    }
}
