package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 86 (just to test)

/**
 * Main class for Foo and some simple test samples of the == operator
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

public class FooAndDoubleEqualTest{
    public static void main(String[] args){
	int x=3;
	byte y=3;
        /**
         * The == operator can be used to 
           compare two variables of any kind, 
           and it simply compares the bits
         */
	if(x==y)  //True in this case
	    {  
		System.out.println("x and y pass the == test");
	    }
	Foo a = new Foo();
	Foo b = new Foo();
	Foo c = a;
	if(a==b)    //False in this case
	    {
		System.out.println("a and b pass the == test");
	    }
	if(a==c)    //True in this case
	    {
		System.out.println("a and c pass the == test");
	    }
	if(b==c)    //False in this case
	    {
		System.out.println("b and c pass the == test");
	    }
    }
}
