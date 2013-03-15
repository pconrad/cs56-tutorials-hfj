package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * Code from Pages 75-77
 * @author Joseph Huang
 * @version hfjch04 for CS56, S11
 */
public class OtherFunc{

    /**
     * Returns 42
     * @return 42
     */
    public int giveSecret(){
	return 42;
    }

    /**
     * Different values for TestStuff t
     */
    public void go(){
	TestStuff t = new TestStuff();
	t.takeTwo(12, 34);
 
	int foo = 7;
	int bar = 3;
	t.takeTwo(foo, bar);
    }

    /**
     * Another go method
     * @param z integer 
     */
    public void go(int z){
	z = 0;
	System.out.println("Z is: "+z);
    }


}



