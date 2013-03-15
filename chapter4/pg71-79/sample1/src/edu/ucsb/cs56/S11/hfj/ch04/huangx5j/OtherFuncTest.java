package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * OtherFunc Main
 * @author Joseph Huang
 * @version hfj04 for cs56, S11
 */
public class OtherFuncTest{

    /**
     * Main for OtherFunc and TestStuff
     */
    public static void main(String[] args){
	OtherFunc f = new OtherFunc();
	f.go();
	int x = 7;
	f.go(x);
	System.out.println("X is: "+x);
    }
}